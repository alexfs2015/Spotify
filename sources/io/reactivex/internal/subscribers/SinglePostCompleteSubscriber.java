package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, wrh {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final wrg<? super R> downstream;
    protected long produced;
    protected wrh upstream;
    protected R value;

    public SinglePostCompleteSubscriber(wrg<? super R> wrg) {
        this.downstream = wrg;
    }

    public final void a(wrh wrh) {
        if (SubscriptionHelper.a(this.upstream, wrh)) {
            this.upstream = wrh;
            this.downstream.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(R r) {
        long j = this.produced;
        if (j != 0) {
            BackpressureHelper.c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) == 0) {
                if ((j2 & Long.MAX_VALUE) != 0) {
                    lazySet(-9223372036854775807L);
                    this.downstream.b_(r);
                    this.downstream.c();
                    return;
                }
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void a(long j) {
        if (SubscriptionHelper.b(j)) {
            while (true) {
                long j2 = get();
                if ((j2 & Long.MIN_VALUE) == 0) {
                    if (compareAndSet(j2, BackpressureHelper.a(j2, j))) {
                        this.upstream.a(j);
                        break;
                    }
                } else if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                    this.downstream.b_(this.value);
                    this.downstream.c();
                    return;
                }
            }
        }
    }

    public final void a() {
        this.upstream.a();
    }
}
