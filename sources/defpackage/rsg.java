package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;

/* renamed from: rsg reason: default package */
public final class rsg implements wig<rsf> {
    private final wzi<Player> a;
    private final wzi<a> b;
    private final wzi<HomePromotionPlayButtonLogger> c;

    private rsg(wzi<Player> wzi, wzi<a> wzi2, wzi<HomePromotionPlayButtonLogger> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rsg a(wzi<Player> wzi, wzi<a> wzi2, wzi<HomePromotionPlayButtonLogger> wzi3) {
        return new rsg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rsf((Player) this.a.get(), (a) this.b.get(), (HomePromotionPlayButtonLogger) this.c.get());
    }
}
