package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tku reason: default package */
public final class tku implements vua<tkt> {
    private final wlc<InteractionLogger> a;
    private final wlc<String> b;

    private tku(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tku a(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        return new tku(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tkt((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
