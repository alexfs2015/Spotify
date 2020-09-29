package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: nhm reason: default package */
public final class nhm implements vua<ImpressionLogger> {
    private final wlc<jjf> a;
    private final wlc<a> b;
    private final wlc<udr> c;

    private nhm(wlc<jjf> wlc, wlc<a> wlc2, wlc<udr> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nhm a(wlc<jjf> wlc, wlc<a> wlc2, wlc<udr> wlc3) {
        return new nhm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (ImpressionLogger) vuf.a(new ImpressionLogger((jjf) this.a.get(), ((a) this.b.get()).ae_(), ((udr) this.c.get()).toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
