package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.util.SensorRecorder;
import com.squareup.picasso.Picasso;

/* renamed from: jhx reason: default package */
public final class jhx implements vua<jhw> {
    private final wlc<gub> A;
    private final wlc<hzb> B;
    private final wlc<hyv> C;
    private final wlc<ugk> D;
    private final wlc<rlj> E;
    private final wlc<rku> F;
    private final wlc<hwy> G;
    private final wlc<vjp> H;
    private final wlc<rwf> I;
    private final wlc<ggk> J;
    private final wlc<SpotifyService> a;
    private final wlc<Handler> b;
    private final wlc<vjs> c;
    private final wlc<hmw> d;
    private final wlc<jhz> e;
    private final wlc<jhu> f;
    private final wlc<rur> g;
    private final wlc<hhs> h;
    private final wlc<ConnectManager> i;
    private final wlc<jha> j;
    private final wlc<igd> k;
    private final wlc<iga> l;
    private final wlc<ifq> m;
    private final wlc<hyx> n;
    private final wlc<jgj> o;
    private final wlc<jgo> p;
    private final wlc<hll> q;
    private final wlc<SensorRecorder> r;
    private final wlc<iep> s;
    private final wlc<AdRules> t;
    private final wlc<pqn> u;
    private final wlc<gtk> v;
    private final wlc<kmb> w;
    private final wlc<tjv> x;
    private final wlc<hxd> y;
    private final wlc<Picasso> z;

    private jhx(wlc<SpotifyService> wlc, wlc<Handler> wlc2, wlc<vjs> wlc3, wlc<hmw> wlc4, wlc<jhz> wlc5, wlc<jhu> wlc6, wlc<rur> wlc7, wlc<hhs> wlc8, wlc<ConnectManager> wlc9, wlc<jha> wlc10, wlc<igd> wlc11, wlc<iga> wlc12, wlc<ifq> wlc13, wlc<hyx> wlc14, wlc<jgj> wlc15, wlc<jgo> wlc16, wlc<hll> wlc17, wlc<SensorRecorder> wlc18, wlc<iep> wlc19, wlc<AdRules> wlc20, wlc<pqn> wlc21, wlc<gtk> wlc22, wlc<kmb> wlc23, wlc<tjv> wlc24, wlc<hxd> wlc25, wlc<Picasso> wlc26, wlc<gub> wlc27, wlc<hzb> wlc28, wlc<hyv> wlc29, wlc<ugk> wlc30, wlc<rlj> wlc31, wlc<rku> wlc32, wlc<hwy> wlc33, wlc<vjp> wlc34, wlc<rwf> wlc35, wlc<ggk> wlc36) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
        this.n = wlc14;
        this.o = wlc15;
        this.p = wlc16;
        this.q = wlc17;
        this.r = wlc18;
        this.s = wlc19;
        this.t = wlc20;
        this.u = wlc21;
        this.v = wlc22;
        this.w = wlc23;
        this.x = wlc24;
        this.y = wlc25;
        this.z = wlc26;
        this.A = wlc27;
        this.B = wlc28;
        this.C = wlc29;
        this.D = wlc30;
        this.E = wlc31;
        this.F = wlc32;
        this.G = wlc33;
        this.H = wlc34;
        this.I = wlc35;
        this.J = wlc36;
    }

    public static jhx a(wlc<SpotifyService> wlc, wlc<Handler> wlc2, wlc<vjs> wlc3, wlc<hmw> wlc4, wlc<jhz> wlc5, wlc<jhu> wlc6, wlc<rur> wlc7, wlc<hhs> wlc8, wlc<ConnectManager> wlc9, wlc<jha> wlc10, wlc<igd> wlc11, wlc<iga> wlc12, wlc<ifq> wlc13, wlc<hyx> wlc14, wlc<jgj> wlc15, wlc<jgo> wlc16, wlc<hll> wlc17, wlc<SensorRecorder> wlc18, wlc<iep> wlc19, wlc<AdRules> wlc20, wlc<pqn> wlc21, wlc<gtk> wlc22, wlc<kmb> wlc23, wlc<tjv> wlc24, wlc<hxd> wlc25, wlc<Picasso> wlc26, wlc<gub> wlc27, wlc<hzb> wlc28, wlc<hyv> wlc29, wlc<ugk> wlc30, wlc<rlj> wlc31, wlc<rku> wlc32, wlc<hwy> wlc33, wlc<vjp> wlc34, wlc<rwf> wlc35, wlc<ggk> wlc36) {
        jhx jhx = new jhx(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18, wlc19, wlc20, wlc21, wlc22, wlc23, wlc24, wlc25, wlc26, wlc27, wlc28, wlc29, wlc30, wlc31, wlc32, wlc33, wlc34, wlc35, wlc36);
        return jhx;
    }

    public final /* synthetic */ Object get() {
        jhw jhw = new jhw((SpotifyService) this.a.get(), (Handler) this.b.get(), (vjs) this.c.get(), (hmw) this.d.get(), (jhz) this.e.get(), (jhu) this.f.get(), (rur) this.g.get(), (hhs) this.h.get(), (ConnectManager) this.i.get(), (jha) this.j.get(), (igd) this.k.get(), (iga) this.l.get(), (ifq) this.m.get(), (hyx) this.n.get(), (jgj) this.o.get(), (jgo) this.p.get(), (hll) this.q.get(), (SensorRecorder) this.r.get(), (iep) this.s.get(), (AdRules) this.t.get(), (pqn) this.u.get(), (gtk) this.v.get(), (kmb) this.w.get(), (tjv) this.x.get(), (hxd) this.y.get(), (Picasso) this.z.get(), (gub) this.A.get(), (hzb) this.B.get(), (hyv) this.C.get(), (ugk) this.D.get(), (rlj) this.E.get(), (rku) this.F.get(), (hwy) this.G.get(), (vjp) this.H.get(), (rwf) this.I.get(), (ggk) this.J.get());
        return jhw;
    }
}
