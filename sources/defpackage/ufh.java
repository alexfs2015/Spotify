package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ufh reason: default package */
public final class ufh implements wig<ufg> {
    private final wzi<ufi> a;
    private final wzi<Player> b;
    private final wzi<uhz> c;
    private final wzi<sso> d;
    private final wzi<ufy> e;

    private ufh(wzi<ufi> wzi, wzi<Player> wzi2, wzi<uhz> wzi3, wzi<sso> wzi4, wzi<ufy> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ufh a(wzi<ufi> wzi, wzi<Player> wzi2, wzi<uhz> wzi3, wzi<sso> wzi4, wzi<ufy> wzi5) {
        ufh ufh = new ufh(wzi, wzi2, wzi3, wzi4, wzi5);
        return ufh;
    }

    public final /* synthetic */ Object get() {
        ufg ufg = new ufg((ufi) this.a.get(), (Player) this.b.get(), (uhz) this.c.get(), (sso) this.d.get(), (ufy) this.e.get());
        return ufg;
    }
}
