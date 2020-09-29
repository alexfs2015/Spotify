package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tka reason: default package */
public final class tka implements wig<tjz> {
    private final wzi<Player> a;
    private final wzi<vcq> b;
    private final wzi<lar> c;
    private final wzi<vei> d;
    private final wzi<tkd> e;

    private tka(wzi<Player> wzi, wzi<vcq> wzi2, wzi<lar> wzi3, wzi<vei> wzi4, wzi<tkd> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tka a(wzi<Player> wzi, wzi<vcq> wzi2, wzi<lar> wzi3, wzi<vei> wzi4, wzi<tkd> wzi5) {
        tka tka = new tka(wzi, wzi2, wzi3, wzi4, wzi5);
        return tka;
    }

    public final /* synthetic */ Object get() {
        tjz tjz = new tjz((Player) this.a.get(), (vcq) this.b.get(), (lar) this.c.get(), (vei) this.d.get(), (tkd) this.e.get());
        return tjz;
    }
}
