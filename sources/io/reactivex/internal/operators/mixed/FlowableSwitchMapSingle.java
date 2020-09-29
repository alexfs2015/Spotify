package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    private Flowable<T> b;
    private Function<? super T, ? extends SingleSource<? extends R>> c;
    private boolean d = false;

    static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, wrh {
        private static SwitchMapSingleObserver<Object> a = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final wrg<? super R> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        wrh upstream;

        static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }

            public final void c_(R r) {
                this.item = r;
                this.parent.d();
            }

            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber = this.parent;
                if (!switchMapSingleSubscriber.inner.compareAndSet(this, null) || !ExceptionHelper.a((AtomicReference<Throwable>) switchMapSingleSubscriber.errors, th)) {
                    RxJavaPlugins.a(th);
                    return;
                }
                if (!switchMapSingleSubscriber.delayErrors) {
                    switchMapSingleSubscriber.upstream.a();
                    switchMapSingleSubscriber.b();
                }
                switchMapSingleSubscriber.d();
            }
        }

        SwitchMapSingleSubscriber(wrg<? super R> wrg, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.downstream = wrg;
            this.mapper = function;
            this.delayErrors = z;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
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
                this.upstream.a();
                this.inner.getAndSet(a);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                if (!this.delayErrors) {
                    b();
                }
                this.done = true;
                d();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            this.done = true;
            d();
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            SwitchMapSingleObserver<Object> switchMapSingleObserver = (SwitchMapSingleObserver) this.inner.getAndSet(a);
            if (switchMapSingleObserver != null && switchMapSingleObserver != a) {
                DisposableHelper.a((AtomicReference<Disposable>) switchMapSingleObserver);
            }
        }

        public final void a(long j) {
            BackpressureHelper.a(this.requested, j);
            d();
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
            b();
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            if (getAndIncrement() == 0) {
                wrg<? super R> wrg = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j = this.emitted;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z = this.done;
                        SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                        boolean z2 = switchMapSingleObserver == null;
                        if (z && z2) {
                            Throwable a2 = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                            if (a2 != null) {
                                wrg.onError(a2);
                                return;
                            } else {
                                wrg.c();
                                return;
                            }
                        } else if (z2 || switchMapSingleObserver.item == null || j == atomicLong.get()) {
                            this.emitted = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            wrg.b_(switchMapSingleObserver.item);
                            j++;
                        }
                    } else {
                        wrg.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
                        return;
                    }
                }
            }
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.b = flowable;
        this.c = function;
    }

    public final void a(wrg<? super R> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new SwitchMapSingleSubscriber<Object>(wrg, this.c, this.d));
    }
}
