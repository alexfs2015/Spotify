package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: gyp reason: default package */
public final class gyp implements vua<gyo> {
    private final wlc<Context> a;
    private final wlc<fpt> b;
    private final wlc<Player> c;
    private final wlc<a> d;

    private gyp(wlc<Context> wlc, wlc<fpt> wlc2, wlc<Player> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static gyp a(wlc<Context> wlc, wlc<fpt> wlc2, wlc<Player> wlc3, wlc<a> wlc4) {
        return new gyp(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new gyo((Context) this.a.get(), (fpt) this.b.get(), (Player) this.c.get(), (a) this.d.get());
    }
}
