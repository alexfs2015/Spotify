package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tae reason: default package */
public final class tae implements vua<tad> {
    private final wlc<InteractionLogger> a;
    private final wlc<PlayerState> b;
    private final wlc<String> c;

    private tae(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tae a(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<String> wlc3) {
        return new tae(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tad((InteractionLogger) this.a.get(), this.b, (String) this.c.get());
    }
}
