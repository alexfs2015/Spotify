package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xfm {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final xfl<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<xfm> upstream = new AtomicReference<>();

    public StrictSubscriber(xfl<? super T> xfl) {
        this.downstream = xfl;
    }

    public final void a() {
        if (!this.done) {
            SubscriptionHelper.a(this.upstream);
        }
    }

    public final void a(long j) {
        if (j <= 0) {
            a();
            StringBuilder sb = new StringBuilder("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        SubscriptionHelper.a(this.upstream, this.requested, j);
    }

    public final void a(xfm xfm) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.a(this);
            SubscriptionHelper.a(this.upstream, this.requested, xfm);
            return;
        }
        xfm.a();
        a();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void b_(T t) {
        HalfSerializer.a(this.downstream, t, (AtomicInteger) this, this.error);
    }

    public void c() {
        this.done = true;
        HalfSerializer.a(this.downstream, (AtomicInteger) this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.a(this.downstream, th, (AtomicInteger) this, this.error);
    }
}
