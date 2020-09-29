package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pvd reason: default package */
public final class pvd implements wig<pvc> {
    private final wzi<InteractionLogger> a;
    private final wzi<PlayerState> b;

    private pvd(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pvd a(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2) {
        return new pvd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pvc((InteractionLogger) this.a.get(), this.b);
    }
}
