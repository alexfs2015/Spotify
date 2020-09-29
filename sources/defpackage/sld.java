package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: sld reason: default package */
public final class sld implements vua<ImpressionLogger> {
    private final wlc<jjf> a;
    private final wlc<sih> b;

    private sld(wlc<jjf> wlc, wlc<sih> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sld a(wlc<jjf> wlc, wlc<sih> wlc2) {
        return new sld(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ImpressionLogger) vuf.a(new ImpressionLogger((jjf) this.a.get(), (sih) this.b.get(), "com.spotify.feature.lyrics"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
