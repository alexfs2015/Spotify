package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: pbl reason: default package */
public final class pbl implements vua<pbk> {
    private final wlc<ImpressionLogger> a;

    private pbl(wlc<ImpressionLogger> wlc) {
        this.a = wlc;
    }

    public static pbl a(wlc<ImpressionLogger> wlc) {
        return new pbl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pbk((ImpressionLogger) this.a.get());
    }
}
