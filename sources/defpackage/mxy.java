package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: mxy reason: default package */
public final class mxy implements wig<mxx> {
    private final wzi<Player> a;
    private final wzi<String> b;
    private final wzi<String> c;
    private final wzi<gwz> d;

    private mxy(wzi<Player> wzi, wzi<String> wzi2, wzi<String> wzi3, wzi<gwz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mxy a(wzi<Player> wzi, wzi<String> wzi2, wzi<String> wzi3, wzi<gwz> wzi4) {
        return new mxy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mxx((Player) this.a.get(), (String) this.b.get(), (String) this.c.get(), (gwz) this.d.get());
    }
}
