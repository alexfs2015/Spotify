package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: scs reason: default package */
public final class scs implements vua<scr> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<Player> c;
    private final wlc<sbk> d;

    private scs(wlc<Context> wlc, wlc<a> wlc2, wlc<Player> wlc3, wlc<sbk> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static scs a(wlc<Context> wlc, wlc<a> wlc2, wlc<Player> wlc3, wlc<sbk> wlc4) {
        return new scs(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new scr((Context) this.a.get(), (a) this.b.get(), (Player) this.c.get(), (sbk) this.d.get());
    }
}
