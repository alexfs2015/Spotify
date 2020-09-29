package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: npi reason: default package */
public final class npi implements vua<nph> {
    private final wlc<ImpressionLogger> a;
    private final wlc<InteractionLogger> b;

    private npi(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static npi a(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        return new npi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nph((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
