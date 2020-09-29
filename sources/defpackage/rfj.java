package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: rfj reason: default package */
public final class rfj implements vua<rfi> {
    private final wlc<ImpressionLogger> a;
    private final wlc<rfg> b;

    private rfj(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rfj a(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        return new rfj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rfi((ImpressionLogger) this.a.get(), (rfg) this.b.get());
    }
}
