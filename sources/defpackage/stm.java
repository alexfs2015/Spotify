package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: stm reason: default package */
public final class stm implements wig<stl> {
    private final wzi<String> a;
    private final wzi<Player> b;
    private final wzi<gwz> c;
    private final wzi<suc> d;
    private final wzi<sue> e;

    private stm(wzi<String> wzi, wzi<Player> wzi2, wzi<gwz> wzi3, wzi<suc> wzi4, wzi<sue> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static stm a(wzi<String> wzi, wzi<Player> wzi2, wzi<gwz> wzi3, wzi<suc> wzi4, wzi<sue> wzi5) {
        stm stm = new stm(wzi, wzi2, wzi3, wzi4, wzi5);
        return stm;
    }

    public final /* synthetic */ Object get() {
        stl stl = new stl((String) this.a.get(), (Player) this.b.get(), (gwz) this.c.get(), (suc) this.d.get(), (sue) this.e.get());
        return stl;
    }
}
