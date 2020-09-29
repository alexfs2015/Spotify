package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: oxb reason: default package */
public final class oxb implements vua<oxa> {
    private final wlc<InteractionLogger> a;
    private final wlc<String> b;

    private oxb(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oxb a(wlc<InteractionLogger> wlc, wlc<String> wlc2) {
        return new oxb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oxa((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
