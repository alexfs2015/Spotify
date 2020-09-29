package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hgh reason: default package */
public final class hgh implements vua<hgg> {
    private final wlc<hmw> a;
    private final wlc<Resources> b;
    private final wlc<ConnectManager> c;
    private final wlc<Player> d;
    private final wlc<jhz> e;
    private final wlc<jgj> f;
    private final wlc<hhp> g;

    private hgh(wlc<hmw> wlc, wlc<Resources> wlc2, wlc<ConnectManager> wlc3, wlc<Player> wlc4, wlc<jhz> wlc5, wlc<jgj> wlc6, wlc<hhp> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static hgh a(wlc<hmw> wlc, wlc<Resources> wlc2, wlc<ConnectManager> wlc3, wlc<Player> wlc4, wlc<jhz> wlc5, wlc<jgj> wlc6, wlc<hhp> wlc7) {
        hgh hgh = new hgh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return hgh;
    }

    public final /* synthetic */ Object get() {
        hgg hgg = new hgg((hmw) this.a.get(), (Resources) this.b.get(), (ConnectManager) this.c.get(), (Player) this.d.get(), (jhz) this.e.get(), (jgj) this.f.get(), (hhp) this.g.get());
        return hgg;
    }
}
