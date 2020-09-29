package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: ozh reason: default package */
public final class ozh implements vua<ozg> {
    private final wlc<InteractionLogger> a;

    private ozh(wlc<InteractionLogger> wlc) {
        this.a = wlc;
    }

    public static ozh a(wlc<InteractionLogger> wlc) {
        return new ozh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ozg((InteractionLogger) this.a.get());
    }
}
