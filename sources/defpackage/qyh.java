package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qyh reason: default package */
public final class qyh implements wig<qyg> {
    private final wzi<Player> a;

    private qyh(wzi<Player> wzi) {
        this.a = wzi;
    }

    public static qyh a(wzi<Player> wzi) {
        return new qyh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qyg((Player) this.a.get());
    }
}
