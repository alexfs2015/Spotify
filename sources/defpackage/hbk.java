package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hbk reason: default package */
public final class hbk implements wig<hbj> {
    private final wzi<Player> a;
    private final wzi<a> b;
    private final wzi<has> c;
    private final wzi<hbc> d;
    private final wzi<hcf> e;
    private final wzi<wbt> f;

    private hbk(wzi<Player> wzi, wzi<a> wzi2, wzi<has> wzi3, wzi<hbc> wzi4, wzi<hcf> wzi5, wzi<wbt> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static hbk a(wzi<Player> wzi, wzi<a> wzi2, wzi<has> wzi3, wzi<hbc> wzi4, wzi<hcf> wzi5, wzi<wbt> wzi6) {
        hbk hbk = new hbk(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return hbk;
    }

    public final /* synthetic */ Object get() {
        hbj hbj = new hbj((Player) this.a.get(), (a) this.b.get(), (has) this.c.get(), (hbc) this.d.get(), (hcf) this.e.get(), (wbt) this.f.get());
        return hbj;
    }
}
