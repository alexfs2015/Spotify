package defpackage;

import com.spotify.music.connection.OfflineReason;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: mcu reason: default package */
public final class mcu {
    private final lbi a;
    private final Observable<mcn> b;
    private final mdc c;
    private final mda d;
    private final mcl e;
    private final vvr<hcs> f;
    private final mcj g;
    private final rof h;
    private final hcs i;

    mcu(lbi lbi, Observable<mcn> observable, mdc mdc, mda mda, mcl mcl, vvr<hcs> vvr, mcj mcj, rof rof, hcs hcs) {
        this.a = lbi;
        this.b = observable;
        this.c = mdc;
        this.d = mda;
        this.e = mcl;
        this.f = vvr;
        this.g = mcj;
        this.h = rof;
        this.i = hcs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(a aVar) {
        return Flowable.b(this.i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(b bVar) {
        Maybe maybe;
        mda mda = this.d;
        OfflineReason offlineReason = bVar.a;
        if (mda.c) {
            Single a2 = mda.b.a();
            maybe = a2 instanceof FuseToMaybe ? ((FuseToMaybe) a2).a() : RxJavaPlugins.a((Maybe<T>) new MaybeFromSingle<T>(a2));
        } else {
            int i2 = AnonymousClass1.a[offlineReason.ordinal()];
            maybe = i2 != 1 ? (i2 == 2 || i2 == 3) ? Maybe.a(mda.a.b()) : Maybe.a() : Maybe.a(mda.a.a());
        }
        return maybe.b();
    }

    /* access modifiers changed from: private */
    public Flowable<hcs> a(mcd mcd) {
        lbg lbg = mcd.a;
        return ((Flowable) lbg.a((gee<c, R_>) new $$Lambda$mcu$mWnQI6yRf3IEmaeZGDKMFt1xTZ8<c,R_>(this, mcd), (gee<b, R_>) new $$Lambda$mcu$NQmrdtRfsl9h2HxsfT3eHPX_Q<b,R_>(this), (gee<a, R_>) new $$Lambda$mcu$e9t8LzBVsot4IIB0JH7Q1p8e_lI<a,R_>(this))).c((Function<? super T, ? extends R>) new $$Lambda$mcu$fio8ZcCAKeFVXTKX2qpAJ9OWCA<Object,Object>(lbg, (mcn) fbp.a(mcd.b))).a((FlowableTransformer<? super T, ? extends R>) this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(mcd mcd, c cVar) {
        String str;
        mdc mdc = this.c;
        a aVar = mdc.a;
        aVar.h = mcd.c.b;
        aVar.i = mcd.c.a;
        if (!aVar.h.isEmpty()) {
            str = aVar.h;
        } else {
            String str2 = aVar.a;
            if (mdk.c(str2) || ViewUris.r.b(str2)) {
                String[] split = aVar.a.split(":");
                str = split[split.length - 1];
            } else {
                str = "";
            }
        }
        mce mce = new mce(str, aVar.b, aVar.d, aVar.e, aVar.c, (aVar.f || aVar.g) ? "application:nft" : null, aVar.i > 0 ? Integer.toString(aVar.i) : null, 0);
        return mdc.b.a(mce);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mcc a(lbg lbg, mcn mcn, hcs hcs) {
        return new mca(hcs, lbg, mcn);
    }

    public final Flowable<hcs> a(Flowable<mct> flowable, hcs hcs) {
        return Flowable.a((xfk<? extends T1>) this.a.a.a(BackpressureStrategy.BUFFER), (xfk<? extends T2>) this.b.a(BackpressureStrategy.LATEST), (xfk<? extends T3>) flowable, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$D_XL5tVJ2dWwstPapRqbxFHhZSk.INSTANCE).b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$mcu$wD9sPkVC33BtPnFWimrvqGoAHo<Object,Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.f).a(hcs, (BiFunction<R, ? super T, R>) this.g).a(wit.a((c<T, R>) this.h)).a(Functions.a());
    }
}
