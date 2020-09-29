package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qlm reason: default package */
public final class qlm implements wig<qll> {
    private final wzi<skq> a;
    private final wzi<Player> b;

    private qlm(wzi<skq> wzi, wzi<Player> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qlm a(wzi<skq> wzi, wzi<Player> wzi2) {
        return new qlm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qll((skq) this.a.get(), (Player) this.b.get());
    }
}
