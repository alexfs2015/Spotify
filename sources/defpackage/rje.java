package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;

/* renamed from: rje reason: default package */
public final class rje implements vua<rjd> {
    private final wlc<Player> a;
    private final wlc<a> b;
    private final wlc<HomePromotionPlayButtonLogger> c;

    private rje(wlc<Player> wlc, wlc<a> wlc2, wlc<HomePromotionPlayButtonLogger> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rje a(wlc<Player> wlc, wlc<a> wlc2, wlc<HomePromotionPlayButtonLogger> wlc3) {
        return new rje(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rjd((Player) this.a.get(), (a) this.b.get(), (HomePromotionPlayButtonLogger) this.c.get());
    }
}
