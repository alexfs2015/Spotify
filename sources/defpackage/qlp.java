package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: qlp reason: default package */
public final class qlp implements vua<qlo> {
    private final wlc<jjf> a;
    private final wlc<ImpressionLogger> b;
    private final wlc<qmd> c;
    private final wlc<qlq> d;

    private qlp(wlc<jjf> wlc, wlc<ImpressionLogger> wlc2, wlc<qmd> wlc3, wlc<qlq> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qlp a(wlc<jjf> wlc, wlc<ImpressionLogger> wlc2, wlc<qmd> wlc3, wlc<qlq> wlc4) {
        return new qlp(wlc, wlc2, wlc3, wlc4);
    }

    public static qlo a(jjf jjf, ImpressionLogger impressionLogger, qmd qmd, qlq qlq) {
        return new qlo(jjf, impressionLogger, qmd, qlq);
    }

    public final /* synthetic */ Object get() {
        return new qlo((jjf) this.a.get(), (ImpressionLogger) this.b.get(), (qmd) this.c.get(), (qlq) this.d.get());
    }
}
