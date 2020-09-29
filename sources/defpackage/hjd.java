package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hjd reason: default package */
public final class hjd implements wig<hjc> {
    private final wzi<hpn> a;
    private final wzi<Resources> b;
    private final wzi<ConnectManager> c;
    private final wzi<Player> d;
    private final wzi<jkp> e;
    private final wzi<jiy> f;
    private final wzi<hkj> g;

    private hjd(wzi<hpn> wzi, wzi<Resources> wzi2, wzi<ConnectManager> wzi3, wzi<Player> wzi4, wzi<jkp> wzi5, wzi<jiy> wzi6, wzi<hkj> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static hjd a(wzi<hpn> wzi, wzi<Resources> wzi2, wzi<ConnectManager> wzi3, wzi<Player> wzi4, wzi<jkp> wzi5, wzi<jiy> wzi6, wzi<hkj> wzi7) {
        hjd hjd = new hjd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return hjd;
    }

    public final /* synthetic */ Object get() {
        hjc hjc = new hjc((hpn) this.a.get(), (Resources) this.b.get(), (ConnectManager) this.c.get(), (Player) this.d.get(), (jkp) this.e.get(), (jiy) this.f.get(), (hkj) this.g.get());
        return hjc;
    }
}
