package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ttq reason: default package */
public final class ttq implements wig<ttp> {
    private final wzi<Player> a;
    private final wzi<a> b;

    private ttq(wzi<Player> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ttq a(wzi<Player> wzi, wzi<a> wzi2) {
        return new ttq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ttp((Player) this.a.get(), (a) this.b.get());
    }
}
