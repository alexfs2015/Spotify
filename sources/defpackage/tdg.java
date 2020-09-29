package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tdg reason: default package */
public final class tdg implements vua<tdi> {
    private final wlc<InteractionLogger> a;
    private final wlc<String> b;

    public static tdi a(InteractionLogger interactionLogger, String str) {
        return (tdi) vuf.a(CC.a(interactionLogger, str), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
