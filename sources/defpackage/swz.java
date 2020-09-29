package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: swz reason: default package */
public final class swz {
    public static ObservableTransformer<sws, swt> a(sxa sxa, sxc sxc, swx swx, swy swy, sxb sxb, sww sww) {
        sxc.getClass();
        sxb.getClass();
        return kok.a().a(b.class, (Action) new $$Lambda$swz$u3HYG7T3GTgbBvGMSjsw4RONpQY(sww)).a(e.class, (Consumer<G>) new $$Lambda$swz$jmky_jChuIgPNwrpbGSBlEvXZzs<G>(sxa, sxc, swx, swy)).a(g.class, (Action) new $$Lambda$6bHzxI_ukMq83agKESW4UL2yqy8(sxc)).a(c.class, (Consumer<G>) new $$Lambda$swz$S4WRaxb8tBZmyUW0pLhuBgPKoo<G>(swx)).a(d.class, (Consumer<G>) new $$Lambda$swz$lJOm1iQ1jgGZR_ySYhMfmfyGAh8<G>(swy)).a(f.class, (Action) new $$Lambda$qMDgUHkaoaskkD0EmVkVbIP6SDM(sxb)).a(a.class, (Consumer<G>) new $$Lambda$swz$Quv1Xz7A3btILd9iPPe2dLHyMyk<G>(sxb, sww)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(sxa sxa, sxc sxc, swx swx, swy swy, e eVar) {
        fqn fqn = eVar.a;
        SessionState sessionState = eVar.b;
        sxa.startLoggedInSession(fqn, sessionState);
        sxc.onUiVisible();
        swx.onFlagsChanged(fqn);
        swy.onSessionStateChanged(sessionState);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(sxb sxb, sww sww, a aVar) {
        sxb.onUiHidden();
        sww.goToLogin(true);
    }
}
