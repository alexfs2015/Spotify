package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: uoh reason: default package */
public final class uoh implements vua<uog> {
    private final wlc<jjf> a;
    private final wlc<PlayerState> b;

    private uoh(wlc<jjf> wlc, wlc<PlayerState> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uoh a(wlc<jjf> wlc, wlc<PlayerState> wlc2) {
        return new uoh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uog((jjf) this.a.get(), this.b);
    }
}
