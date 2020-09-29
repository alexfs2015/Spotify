package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class SubscriptionArbiter extends AtomicInteger implements xfm {
    private static final long serialVersionUID = -2189523197179400958L;
    xfm actual;
    final boolean cancelOnReplace;
    public volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<xfm> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    private void d() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    private void e() {
        xfm xfm = null;
        long j = 0;
        int i = 1;
        do {
            xfm xfm2 = (xfm) this.missedSubscription.get();
            if (xfm2 != null) {
                xfm2 = (xfm) this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            xfm xfm3 = this.actual;
            if (this.cancelled) {
                if (xfm3 != null) {
                    xfm3.a();
                    this.actual = null;
                }
                if (xfm2 != null) {
                    xfm2.a();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = BackpressureHelper.a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            SubscriptionHelper.c(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.requested = j4;
                }
                if (xfm2 != null) {
                    if (xfm3 != null && this.cancelOnReplace) {
                        xfm3.a();
                    }
                    this.actual = xfm2;
                    if (j4 != 0) {
                        j = BackpressureHelper.a(j, j4);
                        xfm = xfm2;
                    }
                } else if (!(xfm3 == null || j2 == 0)) {
                    j = BackpressureHelper.a(j, j2);
                    xfm = xfm3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            xfm.a(j);
        }
    }

    public void a() {
        if (!this.cancelled) {
            this.cancelled = true;
            d();
        }
    }

    public final void a(long j) {
        if (SubscriptionHelper.b(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                BackpressureHelper.a(this.missedRequested, j);
                d();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long a = BackpressureHelper.a(j2, j);
                this.requested = a;
                if (a == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            xfm xfm = this.actual;
            if (decrementAndGet() != 0) {
                e();
            }
            if (xfm != null) {
                xfm.a(j);
            }
        }
    }

    public final void b(xfm xfm) {
        if (this.cancelled) {
            xfm.a();
            return;
        }
        ObjectHelper.a(xfm, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            xfm xfm2 = (xfm) this.missedSubscription.getAndSet(xfm);
            if (xfm2 != null && this.cancelOnReplace) {
                xfm2.a();
            }
            d();
            return;
        }
        xfm xfm3 = this.actual;
        if (xfm3 != null && this.cancelOnReplace) {
            xfm3.a();
        }
        this.actual = xfm;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            e();
        }
        if (j != 0) {
            xfm.a(j);
        }
    }

    public final boolean b() {
        return this.unbounded;
    }

    public final void d(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                BackpressureHelper.a(this.missedProduced, j);
                d();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    SubscriptionHelper.c(j3);
                } else {
                    j4 = j3;
                }
                this.requested = j4;
            }
            if (decrementAndGet() != 0) {
                e();
            }
        }
    }
}
