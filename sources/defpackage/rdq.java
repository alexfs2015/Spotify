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

/* renamed from: rdq reason: default package */
public abstract class rdq implements rda {
    private final BehaviorSubject<Observable<rdb>> a = BehaviorSubject.a();
    final rbg b;
    private Observable<rdc> c;
    private final Function<rdb, rdb> d = new Function<rdb, rdb>() {
        private int a;

        public final /* synthetic */ Object apply(Object obj) {
            int i;
            int i2;
            rdb rdb = (rdb) obj;
            int c = rdq.this.c();
            int i3 = this.a;
            int i4 = rdq.this.b.f;
            int i5 = rdq.this.b.g;
            int a2 = rdb.a();
            if (rdb.b() + a2 >= (i3 + c) - i5) {
                i = c - i4;
                i2 = a2 / i;
            } else {
                if (i3 > 0 && a2 < i3 + i5) {
                    i = c - i4;
                    i2 = (a2 - i5) / i;
                }
                this.a = i3;
                return rdb.h().a(i3).b(c).a();
            }
            i3 = i * i2;
            this.a = i3;
            return rdb.h().a(i3).b(c).a();
        }
    };

    public rdq(rbg rbg) {
        this.b = rbg;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(rdc rdc, rdb rdb) {
        rdb f = rdc.f();
        return (f == null || !fbn.a(f.c(), rdb.c())) ? Observable.c() : Observable.b(rdc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Observable observable, Disposable disposable) {
        this.a.onNext(observable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Observable observable) {
        return observable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(Observable observable) {
        return observable.h(new $$Lambda$qVTZrF_FBdZ_187xUZEXxYGlEU(this));
    }

    private Observable<rdc> d() {
        if (this.c == null) {
            this.c = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$rdq$SdmA8DfkTN9DESyE2ChuPeIFwg<Object>(this)).a(1).a();
        }
        return this.c;
    }

    /* access modifiers changed from: private */
    public Observable<rdc> e() {
        BehaviorSubject a2 = BehaviorSubject.a(Integer.valueOf(0));
        return this.a.h($$Lambda$rdq$dkgDUZHiWBBr4XJeuc4pOiSYYZ8.INSTANCE).e(rdb.f).h(new $$Lambda$rdq$90FhaxVUuWHroc7KfLo1scp0w(a2)).c(this.d).a(Functions.a()).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$rdq$ISP8I6QTRBBsTHjhGXiMVI8eDy0<Object,Object>(this)).b((Consumer<? super T>) new $$Lambda$rdq$3VZWK0ttqueeUX6hO5l8DuWWoc<Object>(a2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.a.onNext(Observable.b(rdb.f));
    }

    public final Observable<Boolean> a() {
        return d().c((Function<? super T, ? extends R>) $$Lambda$rdq$fY6Itnd5KUosPp1NYJU1z_oodN4.INSTANCE).a(Functions.a());
    }

    public final Observable<rdc> a(Observable<rdb> observable) {
        Observable a2 = observable.a(1).a();
        return d().h(new $$Lambda$rdq$d9b_h9Mlye7a_RZ5ph4d9MkeJk(a2)).c((Consumer<? super Disposable>) new $$Lambda$rdq$IDj2ADgKSfEnzktmz4N3pDKVGo<Object>(this, a2)).a((Action) new $$Lambda$rdq$MkxVnhaMr0YL8fWsW3_ExT8kDnw(this));
    }

    /* access modifiers changed from: protected */
    public abstract Observable<rdc> a(rdb rdb);

    public final Observable<rdc> b() {
        return d();
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.b.e;
    }
}
