package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    private SingleSource<T> b;
    private Function<? super T, ? extends wrf<? extends R>> c;

    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements FlowableSubscriber<T>, SingleObserver<S>, wrh {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final wrg<? super T> downstream;
        final Function<? super S, ? extends wrf<? extends T>> mapper;
        final AtomicReference<wrh> parent = new AtomicReference<>();

        SingleFlatMapPublisherObserver(wrg<? super T> wrg, Function<? super S, ? extends wrf<? extends T>> function) {
            this.downstream = wrg;
            this.mapper = function;
        }

        public final void onSubscribe(Disposable disposable2) {
            this.disposable = disposable2;
            this.downstream.a(this);
        }

        public final void c_(S s) {
            try {
                ((wrf) ObjectHelper.a(this.mapper.apply(s), "the mapper returned a null Publisher")).b(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.downstream.onError(th);
            }
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a(this.parent, (AtomicLong) this, wrh);
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void c() {
            this.downstream.c();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.parent, (AtomicLong) this, j);
        }

        public final void a() {
            this.disposable.bf_();
            SubscriptionHelper.a(this.parent);
        }
    }

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends wrf<? extends R>> function) {
        this.b = singleSource;
        this.c = function;
    }

    public final void a(wrg<? super R> wrg) {
        this.b.b(new SingleFlatMapPublisherObserver(wrg, this.c));
    }
}
