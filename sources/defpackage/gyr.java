package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: gyr reason: default package */
public final class gyr implements vua<gyq> {
    private final wlc<Player> a;
    private final wlc<a> b;
    private final wlc<gxz> c;
    private final wlc<gyj> d;
    private final wlc<gzm> e;
    private final wlc<vol> f;

    private gyr(wlc<Player> wlc, wlc<a> wlc2, wlc<gxz> wlc3, wlc<gyj> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static gyr a(wlc<Player> wlc, wlc<a> wlc2, wlc<gxz> wlc3, wlc<gyj> wlc4, wlc<gzm> wlc5, wlc<vol> wlc6) {
        gyr gyr = new gyr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return gyr;
    }

    public final /* synthetic */ Object get() {
        gyq gyq = new gyq((Player) this.a.get(), (a) this.b.get(), (gxz) this.c.get(), (gyj) this.d.get(), (gzm) this.e.get(), (vol) this.f.get());
        return gyq;
    }
}
