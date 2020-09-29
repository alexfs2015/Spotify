package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: sit reason: default package */
public final class sit implements vua<InteractionLogger> {
    private final wlc<jjf> a;
    private final wlc<sih> b;
    private final wlc<gjf> c;

    private sit(wlc<jjf> wlc, wlc<sih> wlc2, wlc<gjf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sit a(wlc<jjf> wlc, wlc<sih> wlc2, wlc<gjf> wlc3) {
        return new sit(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new InteractionLogger((jjf) this.a.get(), (sih) this.b.get(), (gjf) this.c.get());
    }
}
