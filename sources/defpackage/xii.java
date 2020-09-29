package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.exceptions.OnErrorFailedException;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.OnSubscribeCombineLatest;
import rx.internal.operators.OnSubscribeCreate;
import rx.internal.operators.OnSubscribeFromArray;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorPublish;
import rx.internal.operators.OperatorZip;
import rx.internal.util.InternalObservableUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: xii reason: default package */
public class xii<T> {
    private a<T> a;

    /* renamed from: xii$a */
    public interface a<T> extends xis<xio<? super T>> {
    }

    /* renamed from: xii$b */
    public interface b<R, T> extends xiy<xio<? super R>, xio<? super T>> {
    }

    /* renamed from: xii$c */
    public interface c<T, R> extends xiy<xii<T>, xii<R>> {
    }

    protected xii(a<T> aVar) {
        this.a = aVar;
    }

    public static xii<Long> a(long j, long j2, TimeUnit timeUnit, xil xil) {
        xjx xjx = new xjx(j, j2, timeUnit, xil);
        return b((a<T>) xjx);
    }

    public static xii<Long> a(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, xoe.b());
    }

    private xii<T> a(long j, TimeUnit timeUnit, xii<? extends T> xii, xil xil) {
        xjv xjv = new xjv(this, j, timeUnit, xil, xii);
        return b((a<T>) xjv);
    }

    public static xii<Long> a(long j, TimeUnit timeUnit, xil xil) {
        return b((a<T>) new xjw<T>(j, timeUnit, xil));
    }

    private static <T> xii<T> a(T t, T t2) {
        return a((T[]) new Object[]{t, t2});
    }

    public static <T> xii<T> a(Throwable th) {
        return b((a<T>) new xjt<T>(th));
    }

    public static <T, R> xii<R> a(List<? extends xii<? extends T>> list, xjc<? extends R> xjc) {
        return b((a<T>) new OnSubscribeCombineLatest<T>(list, xjc));
    }

    public static <T> xii<T> a(Callable<? extends T> callable) {
        return b((a<T>) new xjm<T>(callable));
    }

    @Deprecated
    public static <T> xii<T> a(a<T> aVar) {
        return new xii<>(xnx.a(aVar));
    }

    public static <T> xii<T> a(xii<? extends xii<? extends T>> xii) {
        return xii.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) xii).k(Identity.INSTANCE) : xii.a((b<? extends R, ? super T>) OperatorMerge.a(false));
    }

    public static <T> xii<T> a(xii<? extends T> xii, xii<? extends T> xii2) {
        return a((T) xii, (T) xii2).a((xiy<? super T, ? extends xii<? extends R>>) Identity.INSTANCE);
    }

    public static <T1, T2, T3, R> xii<R> a(xii<? extends T1> xii, xii<? extends T2> xii2, xii<? extends T3> xii3, xja<? super T1, ? super T2, ? super T3, ? extends R> xja) {
        return a(Arrays.asList(new xii[]{xii, xii2, xii3}), xjd.a(xja));
    }

    public static <T1, T2, R> xii<R> a(xii<? extends T1> xii, xii<? extends T2> xii2, xiz<? super T1, ? super T2, ? extends R> xiz) {
        return a(Arrays.asList(new xii[]{xii, xii2}), xjd.a(xiz));
    }

    private xii<T> a(xil xil, boolean z) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).c(xil) : b((a<T>) new xko<T>(this, xil, z));
    }

    private xii<T> a(xil xil, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).c(xil) : a((b<? extends R, ? super T>) new xki<Object,Object>(xil, false, i));
    }

    public static <T> xii<T> a(xis<Emitter<T>> xis, BackpressureMode backpressureMode) {
        return b((a<T>) new OnSubscribeCreate<T>(xis, backpressureMode));
    }

    public static <T> xii<T> a(xix<xii<T>> xix) {
        return b((a<T>) new xjh<T>(xix));
    }

    private static <T> xii<T> a(T[] tArr) {
        int length = tArr.length;
        return length == 0 ? EmptyObservableHolder.a() : length == 1 ? ScalarSynchronousObservable.d(tArr[0]) : b((a<T>) new OnSubscribeFromArray<T>(tArr));
    }

    public static <T> xip a(xio<? super T> xio, xii<T> xii) {
        if (xio == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (xii.a != null) {
            xio.onStart();
            if (!(xio instanceof xnr)) {
                xio = new xnr<>(xio);
            }
            try {
                xnx.a(xii, xii.a).call(xio);
                return xnx.a((xip) xio);
            } catch (Throwable th) {
                xiq.b(th);
                StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException(sb.toString(), th);
                xnx.b((Throwable) onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    public static <T> xii<T> b(a<T> aVar) {
        return new xii<>(xnx.a(aVar));
    }

    public static <T> xii<T> b(xii<? extends T> xii, xii<? extends T> xii2) {
        return a(a((T[]) new xii[]{xii, xii2}));
    }

    public static <T1, T2, R> xii<R> b(xii<? extends T1> xii, xii<? extends T2> xii2, xiz<? super T1, ? super T2, ? extends R> xiz) {
        return ScalarSynchronousObservable.d(new xii[]{xii, xii2}).a((b<? extends R, ? super T>) new OperatorZip<Object,Object>(xiz));
    }

    private xii<T> d(long j, TimeUnit timeUnit, xil xil) {
        return a((b<? extends R, ? super T>) new xkk<Object,Object>(j, timeUnit, xil));
    }

    private static <T> xii<T> d(xii<? extends xii<? extends T>> xii) {
        return xii.a((b<? extends R, ? super T>) xkp.a(false));
    }

    private xii<T> e(xii<? extends T> xii) {
        if (xii != null) {
            return b((a<T>) new xjs<T>(this, xii));
        }
        throw new NullPointerException("alternate is null");
    }

    public final xii<T> a(int i) {
        return a((b<? extends R, ? super T>) new xkq<Object,Object>(i));
    }

    public final xii<T> a(long j, TimeUnit timeUnit, xii<? extends T> xii) {
        return a(30, timeUnit, xii, xoe.b());
    }

    public final <R> xii<R> a(Class<R> cls) {
        return a((b<? extends R, ? super T>) new xjz<Object,Object>(cls));
    }

    public final xii<T> a(T t) {
        return e((xii<? extends T>) ScalarSynchronousObservable.d(t));
    }

    public final <R> xii<R> a(b<? extends R, ? super T> bVar) {
        return b((a<T>) new xjn<T>(this.a, bVar));
    }

    public final <R> xii<R> a(c<? super T, ? extends R> cVar) {
        return (xii) cVar.call(this);
    }

    public final <U, R> xii<R> a(xii<? extends U> xii, xiz<? super T, ? super U, ? extends R> xiz) {
        return a((b<? extends R, ? super T>) new xku<Object,Object>(xii, xiz));
    }

    public final xii<T> a(xil xil) {
        return a(xil, false, xlx.b);
    }

    public final xii<T> a(xir xir) {
        return a((b<? extends R, ? super T>) new xke<Object,Object>(xir));
    }

    public final xii<T> a(xis<? super Throwable> xis) {
        return b((a<T>) new xjj<T>(this, new xlq(xiv.a(), xis, xiv.a())));
    }

    public final <U, V> xii<T> a(xix<? extends xii<U>> xix, xiy<? super T, ? extends xii<V>> xiy, xii<? extends T> xii) {
        if (xiy != null) {
            return b((a<T>) new xju<T>(this, xix != null ? a(xix) : null, xiy, null));
        }
        throw new NullPointerException("timeoutSelector is null");
    }

    public final <R> xii<R> a(xiy<? super T, ? extends xii<? extends R>> xiy) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).k(xiy) : b((a<T>) new xjg<T>(this, xiy, 2, 0));
    }

    public final xim<T> a() {
        return new xim<>(xjr.a(this));
    }

    public final xip a(xij<? super T> xij) {
        if (xij instanceof xio) {
            return a((xio) xij, this);
        }
        if (xij != null) {
            return a((xio<? super T>) new xlu<Object>(xij), this);
        }
        throw new NullPointerException("observer is null");
    }

    public final xip a(xio<? super T> xio) {
        try {
            xio.onStart();
            xnx.a(this, this.a).call(xio);
            return xnx.a((xip) xio);
        } catch (Throwable th) {
            xiq.b(th);
            StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
            sb.append(th.getMessage());
            sb.append("] and then again while trying to pass to onError.");
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException(sb.toString(), th);
            xnx.b((Throwable) onErrorFailedException);
            throw onErrorFailedException;
        }
    }

    public final xip a(xis<? super T> xis, xis<Throwable> xis2) {
        if (xis == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (xis2 != null) {
            return a((xio<? super T>) new xlr<Object>(xis, xis2, xiv.a()), this);
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final xii<T> b() {
        return a((b<? extends R, ? super T>) xkc.a());
    }

    public final xii<T> b(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, xoe.b());
    }

    public final xii<T> b(long j, TimeUnit timeUnit, xil xil) {
        return a((b<? extends R, ? super T>) new xkb<Object,Object>(j, timeUnit, xil));
    }

    public final xii<T> b(T t) {
        return a(1).a((b<? extends R, ? super T>) new xkm<Object,Object>(t));
    }

    public final <U> xii<T> b(xii<U> xii) {
        if (xii != null) {
            return b((a<T>) new xji<T>(this, xii));
        }
        throw new NullPointerException();
    }

    public final <T2, R> xii<R> b(xii<? extends T2> xii, xiz<? super T, ? super T2, ? extends R> xiz) {
        return b(this, xii, xiz);
    }

    public final xii<T> b(xil xil) {
        return a(xil, !(this.a instanceof OnSubscribeCreate));
    }

    public final xii<T> b(xir xir) {
        return a((b<? extends R, ? super T>) new xkf<Object,Object>(xir));
    }

    public final xii<T> b(xis<? super T> xis) {
        return b((a<T>) new xjj<T>(this, new xlq(xis, xiv.a(), xiv.a())));
    }

    public final <U> xii<T> b(xiy<? super T, ? extends U> xiy) {
        return a((b<? extends R, ? super T>) new xkc<Object,Object>(xiy));
    }

    public final xii<T> c() {
        return a(1).a((b<? extends R, ? super T>) xkm.a());
    }

    public final xii<T> c(long j, TimeUnit timeUnit) {
        return d(500, timeUnit, xoe.b());
    }

    public final xii<T> c(long j, TimeUnit timeUnit, xil xil) {
        return a(j, timeUnit, null, xil);
    }

    public final xii<T> c(T t) {
        return a((xii<? extends T>) ScalarSynchronousObservable.d(t), this);
    }

    public final xii<T> c(xii<? extends T> xii) {
        return a((b<? extends R, ? super T>) xkj.a(xii));
    }

    public final xii<T> c(xiy<? super T, Boolean> xiy) {
        return b((a<T>) new xjk<T>(this, xiy));
    }

    public final xip c(xis<? super T> xis) {
        if (xis != null) {
            return a((xio<? super T>) new xlr<Object>(xis, InternalObservableUtils.c, xiv.a()), this);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final xii<T> d(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, null, xoe.b());
    }

    public final <R> xii<R> d(xiy<? super T, ? extends xii<? extends R>> xiy) {
        return getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) this).k(xiy) : a(e(xiy));
    }

    public final xno<T> d() {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new a<T>(atomicReference) {
            private /* synthetic */ AtomicReference a;

            {
                this.a = r1;
            }

            public final /* synthetic */ void call(Object obj) {
                boolean z;
                xio xio = (xio) obj;
                while (true) {
                    a aVar = (a) this.a.get();
                    if (aVar == null || aVar.isUnsubscribed()) {
                        a aVar2 = new a(this.a);
                        aVar2.a();
                        if (this.a.compareAndSet(aVar, aVar2)) {
                            aVar = aVar2;
                        } else {
                            continue;
                        }
                    }
                    InnerProducer innerProducer = new InnerProducer(aVar, xio);
                    while (true) {
                        InnerProducer[] innerProducerArr = (InnerProducer[]) aVar.d.get();
                        z = false;
                        if (innerProducerArr != a.c) {
                            int length = innerProducerArr.length;
                            InnerProducer[] innerProducerArr2 = new InnerProducer[(length + 1)];
                            System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                            innerProducerArr2[length] = innerProducer;
                            if (aVar.d.compareAndSet(innerProducerArr, innerProducerArr2)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        xio.add(innerProducer);
                        xio.setProducer(innerProducer);
                        return;
                    }
                }
            }
        }, this, atomicReference);
    }

    public final <R> xii<R> e(xiy<? super T, ? extends R> xiy) {
        return b((a<T>) new xjo<T>(this, xiy));
    }

    public final xii<T> f(xiy<? super Throwable, ? extends xii<? extends T>> xiy) {
        return a((b<? extends R, ? super T>) new xkj<Object,Object>(xiy));
    }

    public final xii<T> g(xiy<? super Throwable, ? extends T> xiy) {
        return a((b<? extends R, ? super T>) xkj.a(xiy));
    }

    public final <R> xii<R> h(xiy<? super T, ? extends xii<? extends R>> xiy) {
        return d(e(xiy));
    }

    public final xii<T> i(xiy<? super T, Boolean> xiy) {
        return c(xiy).a(1);
    }

    public final <V> xii<T> j(xiy<? super T, ? extends xii<V>> xiy) {
        return a(null, xiy, null);
    }
}
