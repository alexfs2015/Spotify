package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: sva reason: default package */
public final class sva implements vua<suz> {
    private final wlc<InteractionLogger> a;
    private final wlc<PlayerState> b;
    private final wlc<String> c;

    private sva(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sva a(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<String> wlc3) {
        return new sva(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new suz((InteractionLogger) this.a.get(), this.b, (String) this.c.get());
    }
}
