package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: sis reason: default package */
public final class sis implements vua<ImpressionLogger> {
    private final wlc<jjf> a;
    private final wlc<sih> b;
    private final wlc<gjf> c;

    private sis(wlc<jjf> wlc, wlc<sih> wlc2, wlc<gjf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sis a(wlc<jjf> wlc, wlc<sih> wlc2, wlc<gjf> wlc3) {
        return new sis(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ImpressionLogger((jjf) this.a.get(), (sih) this.b.get(), (gjf) this.c.get());
    }
}
