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
    private Function<? super T, ? extends xfk<? extends R>> c;

    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements FlowableSubscriber<T>, SingleObserver<S>, xfm {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final xfl<? super T> downstream;
        final Function<? super S, ? extends xfk<? extends T>> mapper;
        final AtomicReference<xfm> parent = new AtomicReference<>();

        SingleFlatMapPublisherObserver(xfl<? super T> xfl, Function<? super S, ? extends xfk<? extends T>> function) {
            this.downstream = xfl;
            this.mapper = function;
        }

        public final void a() {
            this.disposable.bd_();
            SubscriptionHelper.a(this.parent);
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.parent, (AtomicLong) this, j);
        }

        public final void a(xfm xfm) {
            SubscriptionHelper.a(this.parent, (AtomicLong) this, xfm);
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void c() {
            this.downstream.c();
        }

        public final void c_(S s) {
            try {
                ((xfk) ObjectHelper.a(this.mapper.apply(s), "the mapper returned a null Publisher")).b(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.downstream.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable2) {
            this.disposable = disposable2;
            this.downstream.a(this);
        }
    }

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends xfk<? extends R>> function) {
        this.b = singleSource;
        this.c = function;
    }

    public final void a(xfl<? super R> xfl) {
        this.b.b(new SingleFlatMapPublisherObserver(xfl, this.c));
    }
}
