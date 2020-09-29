package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: ucj reason: default package */
public final class ucj implements vua<uci> {
    private final wlc<ImpressionLogger> a;
    private final wlc<InteractionLogger> b;

    private ucj(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ucj a(wlc<ImpressionLogger> wlc, wlc<InteractionLogger> wlc2) {
        return new ucj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uci((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
