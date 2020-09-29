package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    private BiFunction<? super T, ? super U, ? extends R> c;
    private wrf<? extends U> d;

    final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        private final WithLatestFromSubscriber<T, U, R> a;

        public final void c() {
        }

        FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.a = withLatestFromSubscriber;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.a.other, wrh)) {
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(U u) {
            this.a.lazySet(u);
        }

        public final void onError(Throwable th) {
            WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber = this.a;
            SubscriptionHelper.a(withLatestFromSubscriber.upstream);
            withLatestFromSubscriber.downstream.onError(th);
        }
    }

    static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, wrh {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final wrg<? super R> downstream;
        final AtomicReference<wrh> other = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<wrh> upstream = new AtomicReference<>();

        WithLatestFromSubscriber(wrg<? super R> wrg, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = wrg;
            this.combiner = biFunction;
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a(this.upstream, this.requested, wrh);
        }

        public final void b_(T t) {
            if (!b(t)) {
                ((wrh) this.upstream.get()).a(1);
            }
        }

        public final boolean b(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.downstream.b_(ObjectHelper.a(this.combiner.apply(t, obj), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    a();
                    this.downstream.onError(th);
                }
            }
            return false;
        }

        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.other);
            this.downstream.onError(th);
        }

        public final void c() {
            SubscriptionHelper.a(this.other);
            this.downstream.c();
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.upstream, this.requested, j);
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
            SubscriptionHelper.a(this.other);
        }
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, wrf<? extends U> wrf) {
        super(flowable);
        this.c = biFunction;
        this.d = wrf;
    }

    public final void a(wrg<? super R> wrg) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wrg);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.c);
        serializedSubscriber.a((wrh) withLatestFromSubscriber);
        this.d.b(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.b.a((FlowableSubscriber<? super T>) withLatestFromSubscriber);
    }
}
