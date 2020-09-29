package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: msx reason: default package */
public final class msx implements vua<msw> {
    private final wlc<Player> a;
    private final wlc<String> b;
    private final wlc<String> c;
    private final wlc<guz> d;

    private msx(wlc<Player> wlc, wlc<String> wlc2, wlc<String> wlc3, wlc<guz> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static msx a(wlc<Player> wlc, wlc<String> wlc2, wlc<String> wlc3, wlc<guz> wlc4) {
        return new msx(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new msw((Player) this.a.get(), (String) this.b.get(), (String) this.c.get(), (guz) this.d.get());
    }
}
