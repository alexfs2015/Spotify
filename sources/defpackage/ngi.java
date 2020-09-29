package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: ngi reason: default package */
public final class ngi implements vua<ngh> {
    private final wlc<ImpressionLogger> a;
    private final wlc<rfg> b;

    private ngi(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngi a(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        return new ngi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ngh((ImpressionLogger) this.a.get(), (rfg) this.b.get());
    }
}
