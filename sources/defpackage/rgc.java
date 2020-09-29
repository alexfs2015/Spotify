package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: rgc reason: default package */
public final class rgc implements vua<ImpressionLogger> {
    private final wlc<jjf> a;
    private final wlc<sih> b;
    private final wlc<String> c;

    public static ImpressionLogger a(jjf jjf, sih sih, String str) {
        return (ImpressionLogger) vuf.a(CC.a(jjf, sih, str), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jjf) this.a.get(), (sih) this.b.get(), (String) this.c.get());
    }
}
