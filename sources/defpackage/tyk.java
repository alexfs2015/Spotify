package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tyk reason: default package */
public final class tyk implements wig<tyj> {
    private final wzi<tyl> a;
    private final wzi<vje> b;
    private final wzi<tym> c;
    private final wzi<Player> d;
    private final wzi<PlayOrigin> e;
    private final wzi<xil> f;

    private tyk(wzi<tyl> wzi, wzi<vje> wzi2, wzi<tym> wzi3, wzi<Player> wzi4, wzi<PlayOrigin> wzi5, wzi<xil> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static tyk a(wzi<tyl> wzi, wzi<vje> wzi2, wzi<tym> wzi3, wzi<Player> wzi4, wzi<PlayOrigin> wzi5, wzi<xil> wzi6) {
        tyk tyk = new tyk(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return tyk;
    }

    public final /* synthetic */ Object get() {
        tyj tyj = new tyj((tyl) this.a.get(), (vje) this.b.get(), (tym) this.c.get(), (Player) this.d.get(), (PlayOrigin) this.e.get(), (xil) this.f.get());
        return tyj;
    }
}
