package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: rqk reason: default package */
public final class rqk implements vua<rqj> {
    private final wlc<gkw> a;
    private final wlc<AudioManager> b;
    private final wlc<rql> c;
    private final wlc<Player> d;

    private rqk(wlc<gkw> wlc, wlc<AudioManager> wlc2, wlc<rql> wlc3, wlc<Player> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rqk a(wlc<gkw> wlc, wlc<AudioManager> wlc2, wlc<rql> wlc3, wlc<Player> wlc4) {
        return new rqk(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rqj((gkw) this.a.get(), vtz.b(this.b), (rql) this.c.get(), (Player) this.d.get());
    }
}
