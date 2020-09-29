package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublish<T> extends ConnectableObservable<T> {
    private ObservableSource<T> a;
    private AtomicReference<PublishObserver<T>> b;
    private ObservableSource<T> c;

    static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final Observer<? super T> child;

        InnerDisposable(Observer<? super T> observer) {
            this.child = observer;
        }

        public final boolean b() {
            return get() == this;
        }

        public final void bd_() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((PublishObserver) andSet).a(this);
            }
        }
    }

    static final class PublishObserver<T> implements Observer<T>, Disposable {
        static final InnerDisposable[] a = new InnerDisposable[0];
        private static InnerDisposable[] e = new InnerDisposable[0];
        final AtomicReference<InnerDisposable<T>[]> b = new AtomicReference<>(e);
        final AtomicBoolean c;
        private AtomicReference<PublishObserver<T>> d;
        private AtomicReference<Disposable> f = new AtomicReference<>();

        PublishObserver(AtomicReference<PublishObserver<T>> atomicReference) {
            this.d = atomicReference;
            this.c = new AtomicBoolean();
        }

        /* access modifiers changed from: 0000 */
        public final void a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.b.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerDisposableArr[i2].equals(innerDisposable)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerDisposableArr2 = e;
                        } else {
                            InnerDisposable[] innerDisposableArr3 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                            innerDisposableArr2 = innerDisposableArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.b.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        public final boolean b() {
            return this.b.get() == a;
        }

        public final void bd_() {
            if (((InnerDisposable[]) this.b.getAndSet(a)) != a) {
                this.d.compareAndSet(this, null);
                DisposableHelper.a(this.f);
            }
        }

        public final void onComplete() {
            this.d.compareAndSet(this, null);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.b.getAndSet(a)) {
                innerDisposable.child.onComplete();
            }
        }

        public final void onError(Throwable th) {
            this.d.compareAndSet(this, null);
            InnerDisposable[] innerDisposableArr = (InnerDisposable[]) this.b.getAndSet(a);
            if (innerDisposableArr.length != 0) {
                for (InnerDisposable innerDisposable : innerDisposableArr) {
                    innerDisposable.child.onError(th);
                }
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.b.get()) {
                innerDisposable.child.onNext(t);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.f, disposable);
        }
    }

    static final class PublishSource<T> implements ObservableSource<T> {
        private final AtomicReference<PublishObserver<T>> a;

        PublishSource(AtomicReference<PublishObserver<T>> atomicReference) {
            this.a = atomicReference;
        }

        public final void subscribe(Observer<? super T> observer) {
            PublishObserver publishObserver;
            boolean z;
            InnerDisposable innerDisposable = new InnerDisposable(observer);
            observer.onSubscribe(innerDisposable);
            while (true) {
                publishObserver = (PublishObserver) this.a.get();
                if (publishObserver == null || publishObserver.b()) {
                    PublishObserver publishObserver2 = new PublishObserver(this.a);
                    if (this.a.compareAndSet(publishObserver, publishObserver2)) {
                        publishObserver = publishObserver2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    InnerDisposable[] innerDisposableArr = (InnerDisposable[]) publishObserver.b.get();
                    z = false;
                    if (innerDisposableArr != PublishObserver.a) {
                        int length = innerDisposableArr.length;
                        InnerDisposable[] innerDisposableArr2 = new InnerDisposable[(length + 1)];
                        System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                        innerDisposableArr2[length] = innerDisposable;
                        if (publishObserver.b.compareAndSet(innerDisposableArr, innerDisposableArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!innerDisposable.compareAndSet(null, publishObserver)) {
                publishObserver.a(innerDisposable);
            }
        }
    }

    private ObservablePublish(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<PublishObserver<T>> atomicReference) {
        this.c = observableSource;
        this.a = observableSource2;
        this.b = atomicReference;
    }

    public static <T> ConnectableObservable<T> h(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.a((ConnectableObservable<T>) new ObservablePublish<T>(new PublishSource(atomicReference), observableSource, atomicReference));
    }

    public final void a(Observer<? super T> observer) {
        this.c.subscribe(observer);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r0 = r4.b
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r0 = (io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r1 = new io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r4.b
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r4.b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.c
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.c
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r5.accept(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            io.reactivex.ObservableSource<T> r5 = r4.a
            r5.subscribe(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.b(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
            goto L_0x0049
        L_0x0048:
            throw r5
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublish.e(io.reactivex.functions.Consumer):void");
    }
}
