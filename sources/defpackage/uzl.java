package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: uzl reason: default package */
public final class uzl implements wig<uzk> {
    private final wzi<jlr> a;
    private final wzi<PlayerState> b;

    private uzl(wzi<jlr> wzi, wzi<PlayerState> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uzl a(wzi<jlr> wzi, wzi<PlayerState> wzi2) {
        return new uzl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uzk((jlr) this.a.get(), this.b);
    }
}
