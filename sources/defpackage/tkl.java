package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tkl reason: default package */
public final class tkl implements wig<tkk> {
    private final wzi<InteractionLogger> a;
    private final wzi<PlayerState> b;
    private final wzi<String> c;

    private tkl(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tkl a(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2, wzi<String> wzi3) {
        return new tkl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tkk((InteractionLogger) this.a.get(), this.b, (String) this.c.get());
    }
}
