package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lgj reason: default package */
public final class lgj implements wig<tnq> {
    private final wzi<InteractionLogger> a;
    private final wzi<PlayerState> b;
    private final wzi<String> c;

    public static tnq a(InteractionLogger interactionLogger, wzi<PlayerState> wzi, String str) {
        return (tnq) wil.a(CC.a(interactionLogger, wzi, str), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((InteractionLogger) this.a.get(), this.b, (String) this.c.get());
    }
}
