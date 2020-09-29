package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: mtm reason: default package */
public final class mtm implements vua<rfi> {
    private final wlc<ImpressionLogger> a;
    private final wlc<rfg> b;

    private mtm(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mtm a(wlc<ImpressionLogger> wlc, wlc<rfg> wlc2) {
        return new mtm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rfi) vuf.a(new rfi((ImpressionLogger) this.a.get(), (rfg) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
