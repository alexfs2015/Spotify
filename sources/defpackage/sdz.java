package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;

/* renamed from: sdz reason: default package */
public final class sdz {
    private final Flowable<kxx> a;
    private final Flowable<sfa> b;
    private final sex c;
    private final seq d;
    private final rzh e;
    private final sgx f;
    private final vim<gzz> g;
    private final vim<gzz> h;
    private final lky i;

    sdz(Observable<kxx> observable, Observable<sfa> observable2, sex sex, seq seq, rzh rzh, sgx sgx, vim<gzz> vim, lky lky, vim<gzz> vim2) {
        this.a = ((Observable) fay.a(observable)).a(BackpressureStrategy.LATEST);
        this.b = ((Observable) fay.a(observable2)).a(BackpressureStrategy.LATEST);
        this.c = (sex) fay.a(sex);
        this.d = (seq) fay.a(seq);
        this.e = (rzh) fay.a(rzh);
        this.f = (sgx) fay.a(sgx);
        this.g = vim;
        this.i = lky;
        this.h = vim2;
    }

    public final Flowable<gzz> a(Flowable<sgc> flowable, gzz gzz) {
        return Flowable.a((wrf<? extends T1>) flowable, (wrf<? extends T2>) this.b, (wrf<? extends T3>) this.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$YWgQ6o9nLnJFUIV5i4URBXZt418.INSTANCE).b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$sdz$u4JRGscRSk3JqIkU18QOeqVbLmo<Object,Object>(this)).a(vun.a((c<T, R>) this.i)).a(gzz, (BiFunction<R, ? super T, R>) this.d).a(Functions.a()).c((Function<? super T, ? extends R>) this.f).a((FlowableTransformer<? super T, ? extends R>) this.g).a((FlowableTransformer<? super T, ? extends R>) this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(sgd sgd, c cVar) {
        return Flowable.b(sgd).b((Function<? super T, ? extends wrf<? extends R>>) this.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(sgd sgd, b bVar) {
        return Flowable.b(this.e.a(sgd.a.b()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(a aVar) {
        return Flowable.b(this.e.a());
    }

    /* access modifiers changed from: private */
    public Flowable<gzz> a(sgd sgd) {
        return (Flowable) sgd.c.a((gct<c, R_>) new $$Lambda$sdz$EGEp_ZPppUekkeFVgc1vMBAdY<c,R_>(this, sgd), (gct<b, R_>) new $$Lambda$sdz$1xaLu6rAReMkUCpIXvm2RKvl0g<b,R_>(this, sgd), (gct<a, R_>) new $$Lambda$sdz$iuchBokleNVzIvNdDu54mAN98Dw<a,R_>(this));
    }
}
