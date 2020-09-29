package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSwitchMapCompletable<T> extends Completable {
    private Flowable<T> a;
    private Function<? super T, ? extends CompletableSource> b;
    private boolean c = false;

    static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {
        private static SwitchMapInnerObserver g = new SwitchMapInnerObserver(null);
        final CompletableObserver a;
        final boolean b;
        final AtomicThrowable c = new AtomicThrowable();
        final AtomicReference<SwitchMapInnerObserver> d = new AtomicReference<>();
        volatile boolean e;
        private Function<? super T, ? extends CompletableSource> f;
        private wrh h;

        static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }

            public final void onError(Throwable th) {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (!switchMapCompletableObserver.d.compareAndSet(this, null) || !ExceptionHelper.a((AtomicReference<Throwable>) switchMapCompletableObserver.c, th)) {
                    RxJavaPlugins.a(th);
                } else {
                    if (!switchMapCompletableObserver.b) {
                        switchMapCompletableObserver.bf_();
                        Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) switchMapCompletableObserver.c);
                        if (a != ExceptionHelper.a) {
                            switchMapCompletableObserver.a.onError(a);
                        }
                    } else if (switchMapCompletableObserver.e) {
                        switchMapCompletableObserver.a.onError(ExceptionHelper.a((AtomicReference<Throwable>) switchMapCompletableObserver.c));
                    }
                }
            }

            public final void onComplete() {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (switchMapCompletableObserver.d.compareAndSet(this, null) && switchMapCompletableObserver.e) {
                    Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) switchMapCompletableObserver.c);
                    if (a == null) {
                        switchMapCompletableObserver.a.onComplete();
                        return;
                    }
                    switchMapCompletableObserver.a.onError(a);
                }
            }
        }

        SwitchMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.a = completableObserver;
            this.f = function;
            this.b = z;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.h, wrh)) {
                this.h = wrh;
                this.a.onSubscribe(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.a(this.f.apply(t), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(this);
                while (true) {
                    SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) this.d.get();
                    if (switchMapInnerObserver2 == g) {
                        break;
                    } else if (this.d.compareAndSet(switchMapInnerObserver2, switchMapInnerObserver)) {
                        if (switchMapInnerObserver2 != null) {
                            DisposableHelper.a((AtomicReference<Disposable>) switchMapInnerObserver2);
                        }
                        completableSource.a(switchMapInnerObserver);
                    }
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.h.a();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!ExceptionHelper.a((AtomicReference<Throwable>) this.c, th)) {
                RxJavaPlugins.a(th);
            } else if (this.b) {
                c();
            } else {
                d();
                Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.c);
                if (a2 != ExceptionHelper.a) {
                    this.a.onError(a2);
                }
            }
        }

        public final void c() {
            this.e = true;
            if (this.d.get() == null) {
                Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) this.c);
                if (a2 == null) {
                    this.a.onComplete();
                    return;
                }
                this.a.onError(a2);
            }
        }

        private void d() {
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.d.getAndSet(g);
            if (switchMapInnerObserver != null && switchMapInnerObserver != g) {
                DisposableHelper.a((AtomicReference<Disposable>) switchMapInnerObserver);
            }
        }

        public final void bf_() {
            this.h.a();
            d();
        }

        public final boolean b() {
            return this.d.get() == g;
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.a = flowable;
        this.b = function;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.a((FlowableSubscriber<? super T>) new SwitchMapCompletableObserver<Object>(completableObserver, this.b, this.c));
    }
}
