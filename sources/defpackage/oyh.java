package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: oyh reason: default package */
public final class oyh implements wig<oyg> {
    private final wzi<Player> a;
    private final wzi<String> b;

    private oyh(wzi<Player> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oyh a(wzi<Player> wzi, wzi<String> wzi2) {
        return new oyh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new oyg(this.a, this.b);
    }
}
