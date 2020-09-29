package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;

/* renamed from: sog reason: default package */
public final class sog {
    private final Flowable<lbg> a;
    private final Flowable<sph> b;
    private final spe c;
    private final sox d;
    private final siv e;
    private final sre f;
    private final vvr<hcs> g;
    private final vvr<hcs> h;
    private final loy i;

    sog(Observable<lbg> observable, Observable<sph> observable2, spe spe, sox sox, siv siv, sre sre, vvr<hcs> vvr, loy loy, vvr<hcs> vvr2) {
        this.a = ((Observable) fbp.a(observable)).a(BackpressureStrategy.LATEST);
        this.b = ((Observable) fbp.a(observable2)).a(BackpressureStrategy.LATEST);
        this.c = (spe) fbp.a(spe);
        this.d = (sox) fbp.a(sox);
        this.e = (siv) fbp.a(siv);
        this.f = (sre) fbp.a(sre);
        this.g = vvr;
        this.i = loy;
        this.h = vvr2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(a aVar) {
        return Flowable.b(this.e.a());
    }

    /* access modifiers changed from: private */
    public Flowable<hcs> a(sqk sqk) {
        return (Flowable) sqk.c.a((gee<c, R_>) new $$Lambda$sog$KqCcK_zsEVnyNITrZ4YP3y9bXYU<c,R_>(this, sqk), (gee<b, R_>) new $$Lambda$sog$5BmcvJCRtPQx0TaKUq3JxcpVKg<b,R_>(this, sqk), (gee<a, R_>) new $$Lambda$sog$h04scdgWm_ipstWSLubtyYNptcw<a,R_>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(sqk sqk, b bVar) {
        return Flowable.b(this.e.a(sqk.a.b()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(sqk sqk, c cVar) {
        return Flowable.b(sqk).b((Function<? super T, ? extends xfk<? extends R>>) this.c);
    }

    public final Flowable<hcs> a(Flowable<sqj> flowable, hcs hcs) {
        return Flowable.a((xfk<? extends T1>) flowable, (xfk<? extends T2>) this.b, (xfk<? extends T3>) this.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$qamgLeyGBz8T4uboHjJIaTGeec.INSTANCE).b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$sog$QCW0aoPifvCJiIc_Odsq0RM38E<Object,Object>(this)).a(wit.a((c<T, R>) this.i)).a(hcs, (BiFunction<R, ? super T, R>) this.d).a(Functions.a()).c((Function<? super T, ? extends R>) this.f).a((FlowableTransformer<? super T, ? extends R>) this.g).a((FlowableTransformer<? super T, ? extends R>) this.h);
    }
}
