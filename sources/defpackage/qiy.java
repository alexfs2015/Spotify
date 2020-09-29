package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qiy reason: default package */
public final class qiy implements vua<qix> {
    private final wlc<jjf> a;
    private final wlc<InteractionLogger> b;
    private final wlc<ImpressionLogger> c;
    private final wlc<qmd> d;

    private qiy(wlc<jjf> wlc, wlc<InteractionLogger> wlc2, wlc<ImpressionLogger> wlc3, wlc<qmd> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qiy a(wlc<jjf> wlc, wlc<InteractionLogger> wlc2, wlc<ImpressionLogger> wlc3, wlc<qmd> wlc4) {
        return new qiy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qix((jjf) this.a.get(), (InteractionLogger) this.b.get(), (ImpressionLogger) this.c.get(), (qmd) this.d.get());
    }
}
