package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FlowableUsing<T, D> extends Flowable<T> {
    private Callable<? extends D> b;
    private Function<? super D, ? extends wrf<? extends T>> c;
    private Consumer<? super D> d;
    private boolean e;

    static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 5904473792286235046L;
        final Consumer<? super D> disposer;
        final wrg<? super T> downstream;
        final boolean eager;
        final D resource;
        wrh upstream;

        UsingSubscriber(wrg<? super T> wrg, D d, Consumer<? super D> consumer, boolean z) {
            this.downstream = wrg;
            this.resource = d;
            this.disposer = consumer;
            this.eager = z;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            if (this.eager) {
                Throwable th2 = null;
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th3) {
                        th2 = th3;
                        Exceptions.b(th2);
                    }
                }
                this.upstream.a();
                if (th2 != null) {
                    this.downstream.onError(new CompositeException(th, th2));
                } else {
                    this.downstream.onError(th);
                }
            } else {
                this.downstream.onError(th);
                this.upstream.a();
                b();
            }
        }

        public final void c() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.a();
                this.downstream.c();
                return;
            }
            this.downstream.c();
            this.upstream.a();
            b();
        }

        public final void a(long j) {
            this.upstream.a(j);
        }

        public final void a() {
            b();
            this.upstream.a();
        }

        private void b() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a(th);
                }
            }
        }
    }

    public FlowableUsing(Callable<? extends D> callable, Function<? super D, ? extends wrf<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        this.b = callable;
        this.c = function;
        this.d = consumer;
        this.e = z;
    }

    public final void a(wrg<? super T> wrg) {
        try {
            Object call = this.b.call();
            try {
                ((wrf) ObjectHelper.a(this.c.apply(call), "The sourceSupplier returned a null Publisher")).b(new UsingSubscriber(wrg, call, this.d, this.e));
            } catch (Throwable th) {
                Exceptions.b(th);
                EmptySubscription.a(new CompositeException(th, th), wrg);
            }
        } catch (Throwable th2) {
            Exceptions.b(th2);
            EmptySubscription.a(th2, wrg);
        }
    }
}
