package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qbh reason: default package */
public final class qbh implements vua<qbg> {
    private final wlc<Player> a;
    private final wlc<sih> b;
    private final wlc<gxz> c;

    private qbh(wlc<Player> wlc, wlc<sih> wlc2, wlc<gxz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qbh a(wlc<Player> wlc, wlc<sih> wlc2, wlc<gxz> wlc3) {
        return new qbh(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qbg((Player) this.a.get(), (sih) this.b.get(), (gxz) this.c.get());
    }
}
