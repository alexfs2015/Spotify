package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: ixl reason: default package */
public final class ixl implements wig<ixk> {
    private final wzi<InteractionLogger> a;
    private final wzi<PlayerState> b;
    private final wzi<rym> c;
    private final wzi<gkq> d;
    private final wzi<sso> e;

    private ixl(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2, wzi<rym> wzi3, wzi<gkq> wzi4, wzi<sso> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ixl a(wzi<InteractionLogger> wzi, wzi<PlayerState> wzi2, wzi<rym> wzi3, wzi<gkq> wzi4, wzi<sso> wzi5) {
        ixl ixl = new ixl(wzi, wzi2, wzi3, wzi4, wzi5);
        return ixl;
    }

    public final /* synthetic */ Object get() {
        ixk ixk = new ixk((InteractionLogger) this.a.get(), this.b, (rym) this.c.get(), (gkq) this.d.get(), (sso) this.e.get());
        return ixk;
    }
}
