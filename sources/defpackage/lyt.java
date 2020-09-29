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

/* renamed from: lyt reason: default package */
public final class lyt {
    private final kxz a;
    private final Observable<lym> b;
    private final lzb c;
    private final lyz d;
    private final lyk e;
    private final vim<gzz> f;
    private final lyi g;
    private final rfd h;
    private final gzz i;

    lyt(kxz kxz, Observable<lym> observable, lzb lzb, lyz lyz, lyk lyk, vim<gzz> vim, lyi lyi, rfd rfd, gzz gzz) {
        this.a = kxz;
        this.b = observable;
        this.c = lzb;
        this.d = lyz;
        this.e = lyk;
        this.f = vim;
        this.g = lyi;
        this.h = rfd;
        this.i = gzz;
    }

    public final Flowable<gzz> a(Flowable<lys> flowable, gzz gzz) {
        return Flowable.a((wrf<? extends T1>) this.a.a.a(BackpressureStrategy.BUFFER), (wrf<? extends T2>) this.b.a(BackpressureStrategy.LATEST), (wrf<? extends T3>) flowable, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$vxmgm29mjuuNZEcAPlGQUwunJE.INSTANCE).b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$lyt$aBDsYNHCT4Ggo_8E_gLDdjO8Wg<Object,Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.f).a(gzz, (BiFunction<R, ? super T, R>) this.g).a(vun.a((c<T, R>) this.h)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(lyc lyc, c cVar) {
        String str;
        String str2;
        lzb lzb = this.c;
        a aVar = lzb.a;
        aVar.h = lyc.c.b;
        aVar.i = lyc.c.a;
        if (!aVar.h.isEmpty()) {
            str = aVar.h;
        } else {
            String str3 = aVar.a;
            if (lzj.c(str3) || ViewUris.s.b(str3)) {
                String[] split = aVar.a.split(":");
                str = split[split.length - 1];
            } else {
                str = "";
            }
        }
        String str4 = str;
        String str5 = aVar.b;
        boolean z = aVar.d;
        boolean z2 = aVar.e;
        String str6 = aVar.c;
        String str7 = (aVar.f || aVar.g) ? "application:nft" : null;
        if (aVar.i > 0) {
            str2 = Integer.toString(aVar.i);
        } else {
            str2 = null;
        }
        lyd lyd = new lyd(str4, str5, z, z2, str6, str7, str2, 0);
        return lzb.b.a(lyd);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(b bVar) {
        Maybe maybe;
        lyz lyz = this.d;
        OfflineReason offlineReason = bVar.a;
        if (lyz.c) {
            Single a2 = lyz.b.a();
            if (a2 instanceof FuseToMaybe) {
                maybe = ((FuseToMaybe) a2).a();
            } else {
                maybe = RxJavaPlugins.a((Maybe<T>) new MaybeFromSingle<T>(a2));
            }
        } else {
            int i2 = AnonymousClass1.a[offlineReason.ordinal()];
            if (i2 == 1) {
                maybe = Maybe.a(lyz.a.a());
            } else if (i2 == 2 || i2 == 3) {
                maybe = Maybe.a(lyz.a.b());
            } else {
                maybe = Maybe.a();
            }
        }
        return maybe.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable a(a aVar) {
        return Flowable.b(this.i);
    }

    /* access modifiers changed from: private */
    public Flowable<gzz> a(lyc lyc) {
        kxx kxx = lyc.a;
        return ((Flowable) kxx.a((gct<c, R_>) new $$Lambda$lyt$8VJ549ecNoSZVyeoMyjlJruQo5I<c,R_>(this, lyc), (gct<b, R_>) new $$Lambda$lyt$OoDoOADAZzwzGQCCvyCOG9ukSVw<b,R_>(this), (gct<a, R_>) new $$Lambda$lyt$J53fTghzRhcqy5eAF75jgn1oYE<a,R_>(this))).c((Function<? super T, ? extends R>) new $$Lambda$lyt$7V0B9rpQ7Fpu7vghjYhC873Fmo0<Object,Object>(kxx, (lym) fay.a(lyc.b))).a((FlowableTransformer<? super T, ? extends R>) this.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lyb a(kxx kxx, lym lym, gzz gzz) {
        return new lxz(gzz, kxx, lym);
    }
}
