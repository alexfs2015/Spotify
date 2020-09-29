package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tkc reason: default package */
public final class tkc implements wig<tkb> {
    private final wzi<Player> a;
    private final wzi<vcq> b;
    private final wzi<sso> c;
    private final wzi<lar> d;
    private final wzi<rka> e;
    private final wzi<vei> f;
    private final wzi<tkd> g;

    private tkc(wzi<Player> wzi, wzi<vcq> wzi2, wzi<sso> wzi3, wzi<lar> wzi4, wzi<rka> wzi5, wzi<vei> wzi6, wzi<tkd> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static tkc a(wzi<Player> wzi, wzi<vcq> wzi2, wzi<sso> wzi3, wzi<lar> wzi4, wzi<rka> wzi5, wzi<vei> wzi6, wzi<tkd> wzi7) {
        tkc tkc = new tkc(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return tkc;
    }

    public final /* synthetic */ Object get() {
        tkb tkb = new tkb((Player) this.a.get(), (vcq) this.b.get(), (sso) this.c.get(), (lar) this.d.get(), (rka) this.e.get(), (vei) this.f.get(), (tkd) this.g.get());
        return tkb;
    }
}
