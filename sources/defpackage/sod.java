package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;

/* renamed from: sod reason: default package */
public final class sod {
    private final Flowable<lbg> a;
    private final Flowable<sph> b;
    private final spe c;
    private final snj d = new snj();
    private final sre e;
    private final loy f;
    private final vvr<hcs> g;
    private final spl h;

    public sod(Observable<lbg> observable, Observable<sph> observable2, spe spe, sre sre, loy loy, vvr<hcs> vvr, spl spl) {
        this.a = observable.a(BackpressureStrategy.LATEST);
        this.b = observable2.a(BackpressureStrategy.LATEST);
        this.c = (spe) fbp.a(spe);
        this.e = (sre) fbp.a(sre);
        this.f = (loy) fbp.a(loy);
        this.g = (vvr) fbp.a(vvr);
        this.h = spl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sqk sqk) {
        this.h.a(sqk.e);
    }

    public final Flowable<hcs> a(Flowable<sql> flowable) {
        return Flowable.a((xfk<? extends T1>) flowable, (xfk<? extends T2>) this.b, (xfk<? extends T3>) this.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$owj9JaBin6aY9d7jJdYz4QLAPs.INSTANCE).a((Consumer<? super T>) new $$Lambda$sod$J5PNM94fYkHBRnfUZ7vWwl685iI<Object>(this)).a((FlowableTransformer<? super T, ? extends R>) new hhp<Object,Object>(this.c, this.d)).a(wit.a((c<T, R>) this.f)).c((Function<? super T, ? extends R>) this.e).a((FlowableTransformer<? super T, ? extends R>) this.g);
    }
}
