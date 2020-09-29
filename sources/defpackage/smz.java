package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: smz reason: default package */
public final class smz implements wig<smy> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Player> c;
    private final wzi<slr> d;

    private smz(wzi<Context> wzi, wzi<a> wzi2, wzi<Player> wzi3, wzi<slr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static smz a(wzi<Context> wzi, wzi<a> wzi2, wzi<Player> wzi3, wzi<slr> wzi4) {
        return new smz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new smy((Context) this.a.get(), (a) this.b.get(), (Player) this.c.get(), (slr) this.d.get());
    }
}
