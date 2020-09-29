package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hbi reason: default package */
public final class hbi implements wig<hbh> {
    private final wzi<Context> a;
    private final wzi<fqn> b;
    private final wzi<Player> c;
    private final wzi<a> d;

    private hbi(wzi<Context> wzi, wzi<fqn> wzi2, wzi<Player> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hbi a(wzi<Context> wzi, wzi<fqn> wzi2, wzi<Player> wzi3, wzi<a> wzi4) {
        return new hbi(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hbh((Context) this.a.get(), (fqn) this.b.get(), (Player) this.c.get(), (a) this.d.get());
    }
}
