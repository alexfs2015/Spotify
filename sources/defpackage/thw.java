package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: thw reason: default package */
public final class thw implements wig<thv> {
    private final wzi<Player> a;
    private final wzi<vcq> b;
    private final wzi<rka> c;
    private final wzi<vde> d;
    private final wzi<thq> e;
    private final wzi<sso> f;

    private thw(wzi<Player> wzi, wzi<vcq> wzi2, wzi<rka> wzi3, wzi<vde> wzi4, wzi<thq> wzi5, wzi<sso> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static thw a(wzi<Player> wzi, wzi<vcq> wzi2, wzi<rka> wzi3, wzi<vde> wzi4, wzi<thq> wzi5, wzi<sso> wzi6) {
        thw thw = new thw(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return thw;
    }

    public final /* synthetic */ Object get() {
        thv thv = new thv((Player) this.a.get(), (vcq) this.b.get(), (rka) this.c.get(), (vde) this.d.get(), (thq) this.e.get(), (sso) this.f.get());
        return thv;
    }
}
