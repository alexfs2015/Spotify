package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: skx reason: default package */
public final class skx implements vua<ImpressionLogger> {
    private final wlc<jjf> a;

    public static ImpressionLogger a(jjf jjf) {
        return (ImpressionLogger) vuf.a(CC.a(jjf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jjf) this.a.get());
    }
}
