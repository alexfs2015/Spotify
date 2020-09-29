package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: oxw reason: default package */
public final class oxw implements vua<oxv> {
    private final wlc<InteractionLogger> a;
    private final wlc<String> b;

    private oxw(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oxw a(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        return new oxw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oxv((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
