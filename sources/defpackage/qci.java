package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qci reason: default package */
public final class qci implements wig<qcc> {
    private final wzi<InteractionLogger> a;

    public static qcc a(InteractionLogger interactionLogger) {
        return (qcc) wil.a(CC.a(interactionLogger), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((InteractionLogger) this.a.get());
    }
}
