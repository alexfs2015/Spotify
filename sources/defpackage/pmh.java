package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pmh reason: default package */
public final class pmh implements vua<pmg> {
    private final wlc<InteractionLogger> a;
    private final wlc<PlayerState> b;

    private pmh(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pmh a(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2) {
        return new pmh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pmg((InteractionLogger) this.a.get(), this.b);
    }
}
