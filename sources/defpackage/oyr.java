package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: oyr reason: default package */
public final class oyr implements vua<oyq> {
    private final wlc<oww> a;
    private final wlc<Boolean> b;
    private final wlc<tme> c;
    private final wlc<ImpressionLogger> d;

    private oyr(wlc<oww> wlc, wlc<Boolean> wlc2, wlc<tme> wlc3, wlc<ImpressionLogger> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static oyr a(wlc<oww> wlc, wlc<Boolean> wlc2, wlc<tme> wlc3, wlc<ImpressionLogger> wlc4) {
        return new oyr(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oyq((oww) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (tme) this.c.get(), (ImpressionLogger) this.d.get());
    }
}
