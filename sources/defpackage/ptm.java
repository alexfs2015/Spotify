package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: ptm reason: default package */
public final class ptm implements vua<ptg> {
    private final wlc<InteractionLogger> a;

    public static ptg a(InteractionLogger interactionLogger) {
        return (ptg) vuf.a(CC.a(interactionLogger), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((InteractionLogger) this.a.get());
    }
}
