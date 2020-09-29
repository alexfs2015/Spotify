package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: nis reason: default package */
public final class nis implements vua<ImpressionLogger> {
    private final wlc<jjf> a;
    private final wlc<a> b;
    private final wlc<udr> c;

    private nis(wlc<jjf> wlc, wlc<a> wlc2, wlc<udr> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nis a(wlc<jjf> wlc, wlc<a> wlc2, wlc<udr> wlc3) {
        return new nis(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (ImpressionLogger) vuf.a(new ImpressionLogger((jjf) this.a.get(), ((a) this.b.get()).ae_(), ((udr) this.c.get()).toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
