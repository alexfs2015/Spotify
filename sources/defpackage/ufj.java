package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ufj reason: default package */
public final class ufj implements wig<ufi> {
    private final wzi<sso> a;
    private final wzi<Player> b;
    private final wzi<uhz> c;

    private ufj(wzi<sso> wzi, wzi<Player> wzi2, wzi<uhz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ufj a(wzi<sso> wzi, wzi<Player> wzi2, wzi<uhz> wzi3) {
        return new ufj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ufi((sso) this.a.get(), (Player) this.b.get(), (uhz) this.c.get());
    }
}
