package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {
    private Observable<T> a;
    private Function<? super T, ? extends SingleSource<? extends R>> b;
    private boolean c = false;

    static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static SwitchMapSingleObserver<Object> a = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        Disposable upstream;

        static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleMainObserver<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            public final void c_(R r) {
                this.item = r;
                this.parent.d();
            }

            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver = this.parent;
                if (!switchMapSingleMainObserver.inner.compareAndSet(this, null) || !ExceptionHelper.a((AtomicReference<Throwable>) switchMapSingleMainObserver.errors, th)) {
                    RxJavaPlugins.a(th);
                    return;
                }
                if (!switchMapSingleMainObserver.delayErrors) {
                    switchMapSingleMainObserver.upstream.bd_();
                    switchMapSingleMainObserver.c();
                }
                switchMapSingleMainObserver.d();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }
        }

        SwitchMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            this.cancelled = true;
            this.upstream.bd_();
            c();
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            SwitchMapSingleObserver<Object> switchMapSingleObserver = (SwitchMapSingleObserver) this.inner.getAndSet(a);
            if (switchMapSingleObserver != null && switchMapSingleObserver != a) {
                DisposableHelper.a((AtomicReference<Disposable>) switchMapSingleObserver);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z = this.done;
                        SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                        boolean z2 = switchMapSingleObserver == null;
                        if (z && z2) {
                            Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                            if (a2 != null) {
                                observer.onError(a2);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        } else if (z2 || switchMapSingleObserver.item == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            observer.onNext(switchMapSingleObserver.item);
                        }
                    } else {
                        observer.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                        return;
                    }
                }
            }
        }

        public final void onComplete() {
            this.done = true;
            d();
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                if (!this.delayErrors) {
                    c();
                }
                this.done = true;
                d();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) this.inner.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.a((AtomicReference<Disposable>) switchMapSingleObserver);
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver2 = new SwitchMapSingleObserver(this);
                while (true) {
                    SwitchMapSingleObserver<Object> switchMapSingleObserver3 = (SwitchMapSingleObserver) this.inner.get();
                    if (switchMapSingleObserver3 != a) {
                        if (this.inner.compareAndSet(switchMapSingleObserver3, switchMapSingleObserver2)) {
                            singleSource.b(switchMapSingleObserver2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.bd_();
                this.inner.getAndSet(a);
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.a = observable;
        this.b = function;
    }

    public final void a(Observer<? super R> observer) {
        if (!ScalarXMapZHelper.a((Object) this.a, this.b, observer)) {
            this.a.subscribe(new SwitchMapSingleMainObserver(observer, this.b, this.c));
        }
    }
}
