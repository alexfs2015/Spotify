package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qsb reason: default package */
public final class qsb implements vua<qsa> {
    private final wlc<ImpressionLogger> a;
    private final wlc<InteractionLogger> b;

    private qsb(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qsb a(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        return new qsb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qsa((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
