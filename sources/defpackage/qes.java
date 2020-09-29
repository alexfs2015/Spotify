package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qes reason: default package */
public final class qes implements wig<qer> {
    private final wzi<sin> a;
    private final wzi<sqb> b;
    private final wzi<squ> c;
    private final wzi<hbl> d;
    private final wzi<Player> e;
    private final wzi<has> f;
    private final wzi<skq> g;

    private qes(wzi<sin> wzi, wzi<sqb> wzi2, wzi<squ> wzi3, wzi<hbl> wzi4, wzi<Player> wzi5, wzi<has> wzi6, wzi<skq> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static qes a(wzi<sin> wzi, wzi<sqb> wzi2, wzi<squ> wzi3, wzi<hbl> wzi4, wzi<Player> wzi5, wzi<has> wzi6, wzi<skq> wzi7) {
        qes qes = new qes(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return qes;
    }

    public final /* synthetic */ Object get() {
        qer qer = new qer((sin) this.a.get(), (sqb) this.b.get(), (squ) this.c.get(), (hbl) this.d.get(), (Player) this.e.get(), (has) this.f.get(), (skq) this.g.get());
        return qer;
    }
}
