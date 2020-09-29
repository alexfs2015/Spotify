package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableRange extends Flowable<Integer> {
    private int b;
    private int c;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public final int a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        public abstract void b();

        /* access modifiers changed from: 0000 */
        public abstract void b(long j);

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }

        public final boolean d() {
            return this.index == this.end;
        }

        public final void e() {
            this.index = this.end;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j) && BackpressureHelper.a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    b();
                    return;
                }
                b(j);
            }
        }

        public final void a() {
            this.cancelled = true;
        }

        public final /* synthetic */ Object bc_() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.downstream = conditionalSubscriber;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    conditionalSubscriber.b(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                conditionalSubscriber.c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            int i = this.end;
            int i2 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                conditionalSubscriber.c();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        if (conditionalSubscriber.b(Integer.valueOf(i2))) {
                            j3++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final wrg<? super Integer> downstream;

        RangeSubscription(wrg<? super Integer> wrg, int i, int i2) {
            super(i, i2);
            this.downstream = wrg;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i = this.end;
            wrg<? super Integer> wrg = this.downstream;
            int i2 = this.index;
            while (i2 != i) {
                if (!this.cancelled) {
                    wrg.b_(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                wrg.c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            int i = this.end;
            int i2 = this.index;
            wrg<? super Integer> wrg = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.cancelled) {
                                wrg.c();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        wrg.b_(Integer.valueOf(i2));
                        j3++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public FlowableRange(int i, int i2) {
        this.b = i;
        this.c = i + i2;
    }

    public final void a(wrg<? super Integer> wrg) {
        if (wrg instanceof ConditionalSubscriber) {
            wrg.a(new RangeConditionalSubscription((ConditionalSubscriber) wrg, this.b, this.c));
        } else {
            wrg.a(new RangeSubscription(wrg, this.b, this.c));
        }
    }
}
