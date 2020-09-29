package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tml reason: default package */
public final class tml implements vua<tmk> {
    private final wlc<kxi> a;
    private final wlc<gjf> b;
    private final wlc<InteractionLogger> c;

    private tml(wlc<kxi> wlc, wlc<gjf> wlc2, wlc<InteractionLogger> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tml a(wlc<kxi> wlc, wlc<gjf> wlc2, wlc<InteractionLogger> wlc3) {
        return new tml(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tmk((kxi) this.a.get(), (gjf) this.b.get(), (InteractionLogger) this.c.get());
    }
}
