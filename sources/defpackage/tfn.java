package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tfn reason: default package */
public final class tfn implements wig<tfm> {
    private final wzi<Player> a;

    private tfn(wzi<Player> wzi) {
        this.a = wzi;
    }

    public static tfn a(wzi<Player> wzi) {
        return new tfn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tfm((Player) this.a.get());
    }
}
