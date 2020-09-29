package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.Callable;

/* renamed from: qvb reason: default package */
public abstract class qvb implements qul {
    private final BehaviorSubject<Observable<qum>> a = BehaviorSubject.a();
    final qsr b;
    private Observable<qun> c;
    private final Function<qum, qum> d = new Function<qum, qum>() {
        private int a;

        public final /* synthetic */ Object apply(Object obj) {
            int i;
            int i2;
            qum qum = (qum) obj;
            int c = qvb.this.c();
            int i3 = this.a;
            int i4 = qvb.this.b.d;
            int i5 = qvb.this.b.e;
            int a2 = qum.a();
            if (qum.b() + a2 >= (i3 + c) - i5) {
                i = c - i4;
                i2 = a2 / i;
            } else {
                if (i3 > 0 && a2 < i3 + i5) {
                    i = c - i4;
                    i2 = (a2 - i5) / i;
                }
                this.a = i3;
                return qum.h().a(i3).b(c).a();
            }
            i3 = i * i2;
            this.a = i3;
            return qum.h().a(i3).b(c).a();
        }
    };

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Observable observable) {
        return observable;
    }

    /* access modifiers changed from: protected */
    public abstract Observable<qun> a(qum qum);

    public qvb(qsr qsr) {
        this.b = qsr;
    }

    public final Observable<Boolean> a() {
        return d().c((Function<? super T, ? extends R>) $$Lambda$qvb$lz3aLEeoz8sENlYmYtiqKEvXeM.INSTANCE).a(Functions.a());
    }

    public final Observable<qun> b() {
        return d();
    }

    public final Observable<qun> a(Observable<qum> observable) {
        Observable a2 = observable.a(1).a();
        return d().h(new $$Lambda$qvb$EF3UQ1crNBgDuD4pMcPCDF3Mz_I(a2)).c((Consumer<? super Disposable>) new $$Lambda$qvb$e6iKh3MP6fjxF4RjcwCRWtsQgK4<Object>(this, a2)).a((Action) new $$Lambda$qvb$uDvLRkv6W_dQJh8yTzxn8gEtSg(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(qun qun, qum qum) {
        qum f = qun.f();
        if (f == null || !faw.a(f.c(), qum.c())) {
            return Observable.c();
        }
        return Observable.b(qun);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Observable observable, Disposable disposable) {
        this.a.onNext(observable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.a.onNext(Observable.b(qum.f));
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.b.c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(Observable observable) {
        return observable.h(new $$Lambda$qa50o1j32bPyNnmytEcNZRLZIiw(this));
    }

    private Observable<qun> d() {
        if (this.c == null) {
            this.c = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$qvb$DMZwykDPChXO2ZK3F14hKxdAsw<Object>(this)).a(1).a();
        }
        return this.c;
    }

    /* access modifiers changed from: private */
    public Observable<qun> e() {
        BehaviorSubject a2 = BehaviorSubject.a(Integer.valueOf(0));
        return this.a.h($$Lambda$qvb$HrUM9IOSG514xu3SHBiBBnnRiOQ.INSTANCE).e(qum.f).h(new $$Lambda$qvb$ic0WubN7Ij5uPu4Pqq6TmF5mlI(a2)).c(this.d).a(Functions.a()).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$qvb$tgJQv_z9JWMDiaU6gIfFB8D0S0<Object,Object>(this)).b((Consumer<? super T>) new $$Lambda$qvb$J_mmbAvu2ORqpec6U8dSDSgMdc<Object>(a2));
    }
}
