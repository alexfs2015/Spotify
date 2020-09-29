package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: kgz reason: default package */
public final class kgz implements wig<kgy> {
    private final wzi<Player> a;

    private kgz(wzi<Player> wzi) {
        this.a = wzi;
    }

    public static kgz a(wzi<Player> wzi) {
        return new kgz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kgy((Player) this.a.get());
    }
}
