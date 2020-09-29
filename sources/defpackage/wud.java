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
import rx.internal.operators.OnSubscribeFlatMapSingle;
import rx.internal.operators.OnSubscribeFromArray;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorPublish;
import rx.internal.operators.OperatorZip;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: wud reason: default package */
public class wud<T> {
    private a<T> a;

    /* renamed from: wud$a */
    public interface a<T> extends wun<wuj<? super T>> {
    }

    /* renamed from: wud$b */
    public interface b<R, T> extends wut<wuj<? super R>, wuj<? super T>> {
    }

    /* renamed from: wud$c */
    public interface c<T, R> extends wut<wud<T>, wud<R>> {
    }

    protected wud(a<T> aVar) {
        this.a = aVar;
    }

    @Deprecated
    public static <T> wud<T> a(a<T> aVar) {
        return new wud<>(wzs.a(aVar));
    }

    public static <T> wud<T> a(wun<Emitter<T>> wun, BackpressureMode backpressureMode) {
        return b((a<T>) new OnSubscribeCreate<T>(wun, backpressureMode));
    }

    public static <T> wud<T> b(a<T> aVar) {
        return new wud<>(wzs.a(aVar));
    }

    public final <R> wud<R> a(b<? extends R, ? super T> bVar) {
        return b((a<T>) new wvi<T>(this.a, bVar));
    }

    public final <R> wud<R> a(c<? super T, ? extends R> cVar) {
        return (wud) cVar.call(this);
    }

    public final wuh<T> a() {
        return new wuh<>(wvm.a(this));
    }

    public static <T1, T2, R> wud<R> a(wud<? extends T1> wud, wud<? extends T2> wud2, wuu<? super T1, ? super T2, ? extends R> wuu) {
        return a(Arrays.asList(new wud[]{wud, wud2}), wuy.a(wuu));
    }

    public static <T1, T2, T3, R> wud<R> a(wud<? extends T1> wud, wud<? extends T2> wud2, wud<? extends T3> wud3, wuv<? super T1, ? super T2, ? super T3, ? extends R> wuv) {
        return a(Arrays.asList(new wud[]{wud, wud2, wud3}), wuy.a(wuv));
    }

    public static <T, R> wud<R> a(List<? extends wud<? extends T>> list, wux<? extends R> wux) {
        return b((a<T>) new OnSubscribeCombineLatest<T>(list, wux));
    }

    public static <T> wud<T> a(wud<? extends T> wud, wud<? extends T> wud2) {
        return a((T) wud, (T) wud2).a((wut<? super T, ? extends wud<? extends R>>) Identity.INSTANCE);
    }

    public static <T> wud<T> a(wus<wud<T>> wus) {
        return b((a<T>) new wvc<T>(wus));
    }

    public static <T> wud<T> a(Throwable th) {
        return b((a<T>) new wvo<T>(th));
    }

    private static <T> wud<T> a(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return EmptyObservableHolder.a();
        }
        if (length == 1) {
            return ScalarSynchronousObservable.d(tArr[0]);
        }
        return b((a<T>) new OnSubscribeFromArray<T>(tArr));
    }

    public static <T> wud<T> a(Callable<? extends T> callable) {
        return b((a<T>) new wvh<T>(callable));
    }

    public static wud<Long> a(long j, long j2, TimeUnit timeUnit, wug wug) {
        wvs wvs = new wvs(j, j2, timeUnit, wug);
        return b((a<T>) wvs);
    }

    private static <T> wud<T> a(T t, T t2) {
        return a((T[]) new Object[]{t, t2});
    }

    public static <T> wud<T> a(wud<? extends wud<? extends T>> wud) {
        if (wud.getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) wud).m(Identity.INSTANCE);
        }
        return wud.a((b<? extends R, ? super T>) OperatorMerge.a(false));
    }

    private static <T> wud<T> d(wud<? extends wud<? extends T>> wud) {
        return wud.a((b<? extends R, ? super T>) wwk.a(false));
    }

    public static wud<Long> a(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, wzz.b());
    }

    public static wud<Long> a(long j, TimeUnit timeUnit, wug wug) {
        return b((a<T>) new wvr<T>(j, timeUnit, wug));
    }

    public final <R> wud<R> a(Class<R> cls) {
        return a((b<? extends R, ? super T>) new wvu<Object,Object>(cls));
    }

    public final <R> wud<R> a(wut<? super T, ? extends wud<? extends R>> wut) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).m(wut);
        }
        return b((a<T>) new wvb<T>(this, wut, 2, 0));
    }

    private wud<T> e(wud<? extends T> wud) {
        if (wud != null) {
            return b((a<T>) new wvn<T>(this, wud));
        }
        throw new NullPointerException("alternate is null");
    }

    public final wud<T> b(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, wzz.b());
    }

    public final wud<T> b(long j, TimeUnit timeUnit, wug wug) {
        return a((b<? extends R, ? super T>) new wvw<Object,Object>(j, timeUnit, wug));
    }

    public final <U> wud<T> b(wud<U> wud) {
        if (wud != null) {
            return b((a<T>) new wvd<T>(this, wud));
        }
        throw new NullPointerException();
    }

    public final wud<T> b() {
        return a((b<? extends R, ? super T>) wvx.a());
    }

    public final <U> wud<T> b(wut<? super T, ? extends U> wut) {
        return a((b<? extends R, ? super T>) new wvx<Object,Object>(wut));
    }

    public final wud<T> a(wun<? super Throwable> wun) {
        return b((a<T>) new wve<T>(this, new wxl(wuq.a(), wun, wuq.a())));
    }

    public final wud<T> b(wun<? super T> wun) {
        return b((a<T>) new wve<T>(this, new wxl(wun, wuq.a(), wuq.a())));
    }

    public final wud<T> a(wum wum) {
        return a((b<? extends R, ? super T>) new wvz<Object,Object>(wum));
    }

    public final wud<T> b(wum wum) {
        return a((b<? extends R, ? super T>) new wwa<Object,Object>(wum));
    }

    public final wud<T> c(wut<? super T, Boolean> wut) {
        return b((a<T>) new wvf<T>(this, wut));
    }

    public final wud<T> c() {
        return a(1).a((b<? extends R, ? super T>) wwh.a());
    }

    public final wud<T> b(T t) {
        return a(1).a((b<? extends R, ? super T>) new wwh<Object,Object>(t));
    }

    public final <R> wud<R> d(wut<? super T, ? extends wud<? extends R>> wut) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).m(wut);
        }
        return a(f(wut));
    }

    public final <R> wud<R> e(wut<? super T, ? extends wuh<? extends R>> wut) {
        return a(wut, false, Integer.MAX_VALUE);
    }

    private <R> wud<R> a(wut<? super T, ? extends wuh<? extends R>> wut, boolean z, int i) {
        return b((a<T>) new OnSubscribeFlatMapSingle<T>(this, wut, false, Integer.MAX_VALUE));
    }

    public final <R> wud<R> f(wut<? super T, ? extends R> wut) {
        return b((a<T>) new wvj<T>(this, wut));
    }

    public final wud<T> a(wug wug) {
        return a(wug, false, wxs.b);
    }

    private wud<T> a(wug wug, boolean z, int i) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).c(wug);
        }
        return a((b<? extends R, ? super T>) new wwd<Object,Object>(wug, false, i));
    }

    public final wud<T> g(wut<? super Throwable, ? extends wud<? extends T>> wut) {
        return a((b<? extends R, ? super T>) new wwe<Object,Object>(wut));
    }

    public final wud<T> c(wud<? extends T> wud) {
        return a((b<? extends R, ? super T>) wwe.a(wud));
    }

    public final wud<T> h(wut<? super Throwable, ? extends T> wut) {
        return a((b<? extends R, ? super T>) wwe.a(wut));
    }

    public final wud<T> c(long j, TimeUnit timeUnit) {
        return d(500, timeUnit, wzz.b());
    }

    private wud<T> d(long j, TimeUnit timeUnit, wug wug) {
        return a((b<? extends R, ? super T>) new wwf<Object,Object>(j, timeUnit, wug));
    }

    public final wuk a(wun<? super T> wun, wun<Throwable> wun2) {
        if (wun == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (wun2 != null) {
            return a((wuj<? super T>) new wxm<Object>(wun, wun2, wuq.a()), this);
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final wuk a(wue<? super T> wue) {
        if (wue instanceof wuj) {
            return a((wuj) wue, this);
        }
        if (wue != null) {
            return a((wuj<? super T>) new wxp<Object>(wue), this);
        }
        throw new NullPointerException("observer is null");
    }

    public final wuk a(wuj<? super T> wuj) {
        try {
            wuj.onStart();
            wzs.a(this, this.a).call(wuj);
            return wzs.a((wuk) wuj);
        } catch (Throwable th) {
            wul.b(th);
            StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
            sb.append(th.getMessage());
            sb.append("] and then again while trying to pass to onError.");
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException(sb.toString(), th);
            wzs.b((Throwable) onErrorFailedException);
            throw onErrorFailedException;
        }
    }

    public static <T> wuk a(wuj<? super T> wuj, wud<T> wud) {
        if (wuj == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (wud.a != null) {
            wuj.onStart();
            if (!(wuj instanceof wzm)) {
                wuj = new wzm<>(wuj);
            }
            try {
                wzs.a(wud, wud.a).call(wuj);
                return wzs.a((wuk) wuj);
            } catch (Throwable th) {
                wul.b(th);
                StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException(sb.toString(), th);
                wzs.b((Throwable) onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    public final wud<T> b(wug wug) {
        return a(wug, !(this.a instanceof OnSubscribeCreate));
    }

    private wud<T> a(wug wug, boolean z) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).c(wug);
        }
        return b((a<T>) new wwj<T>(this, wug, z));
    }

    public final <R> wud<R> i(wut<? super T, ? extends wud<? extends R>> wut) {
        return d(f(wut));
    }

    public final wud<T> a(int i) {
        return a((b<? extends R, ? super T>) new wwl<Object,Object>(i));
    }

    public final wud<T> j(wut<? super T, Boolean> wut) {
        return c(wut).a(1);
    }

    public final wud<T> k(wut<? super T, Boolean> wut) {
        return a((b<? extends R, ? super T>) new wwn<Object,Object>(wut));
    }

    public final <U, V> wud<T> a(wus<? extends wud<U>> wus, wut<? super T, ? extends wud<V>> wut, wud<? extends T> wud) {
        if (wut != null) {
            return b((a<T>) new wvp<T>(this, wus != null ? a(wus) : null, wut, null));
        }
        throw new NullPointerException("timeoutSelector is null");
    }

    public final <V> wud<T> l(wut<? super T, ? extends wud<V>> wut) {
        return a(null, wut, null);
    }

    public final wud<T> d(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, null, wzz.b());
    }

    public final wud<T> a(long j, TimeUnit timeUnit, wud<? extends T> wud) {
        return a(30, timeUnit, wud, wzz.b());
    }

    private wud<T> a(long j, TimeUnit timeUnit, wud<? extends T> wud, wug wug) {
        wvq wvq = new wvq(this, j, timeUnit, wug, wud);
        return b((a<T>) wvq);
    }

    public final wud<T> c(long j, TimeUnit timeUnit, wug wug) {
        return a(j, timeUnit, null, wug);
    }

    public final <U, R> wud<R> a(wud<? extends U> wud, wuu<? super T, ? super U, ? extends R> wuu) {
        return a((b<? extends R, ? super T>) new wwp<Object,Object>(wud, wuu));
    }

    public final <T2, R> wud<R> b(wud<? extends T2> wud, wuu<? super T, ? super T2, ? extends R> wuu) {
        return b(this, wud, wuu);
    }

    public static <T> wud<T> b(wud<? extends T> wud, wud<? extends T> wud2) {
        return a(a((T[]) new wud[]{wud, wud2}));
    }

    public static <T1, T2, R> wud<R> b(wud<? extends T1> wud, wud<? extends T2> wud2, wuu<? super T1, ? super T2, ? extends R> wuu) {
        return ScalarSynchronousObservable.d(new wud[]{wud, wud2}).a((b<? extends R, ? super T>) new OperatorZip<Object,Object>(wuu));
    }

    public final wud<T> a(T t) {
        return e((wud<? extends T>) ScalarSynchronousObservable.d(t));
    }

    public final wzj<T> d() {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new a<T>(atomicReference) {
            private /* synthetic */ AtomicReference a;

            {
                this.a = r1;
            }

            public final /* synthetic */ void call(Object obj) {
                boolean z;
                wuj wuj = (wuj) obj;
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
                    InnerProducer innerProducer = new InnerProducer(aVar, wuj);
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
                        wuj.add(innerProducer);
                        wuj.setProducer(innerProducer);
                        return;
                    }
                }
            }
        }, this, atomicReference);
    }

    public final wud<T> c(T t) {
        return a((wud<? extends T>) ScalarSynchronousObservable.d(t), this);
    }
}
