package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: szk reason: default package */
public final class szk implements vua<szj> {
    private final wlc<Context> a;
    private final wlc<Player> b;
    private final wlc<use> c;

    private szk(wlc<Context> wlc, wlc<Player> wlc2, wlc<use> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static szk a(wlc<Context> wlc, wlc<Player> wlc2, wlc<use> wlc3) {
        return new szk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new szj((Context) this.a.get(), (Player) this.b.get(), (use) this.c.get());
    }
}
