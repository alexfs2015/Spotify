package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.settings.adapter.SettingsAdapter;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;

/* renamed from: qdp reason: default package */
public final class qdp implements vua<SettingsAdapter> {
    private final wlc<rnf> A;
    private final wlc<gdz<fko>> B;
    private final wlc<rpg> C;
    private final wlc<gts> D;
    private final wlc<jtw> E;
    private final wlc<Context> a;
    private final wlc<Resources> b;
    private final wlc<fpt> c;
    private final wlc<jro> d;
    private final wlc<jjf> e;
    private final wlc<jrp> f;
    private final wlc<rgz> g;
    private final wlc<rqd> h;
    private final wlc<mlj> i;
    private final wlc<kuj> j;
    private final wlc<jjj> k;
    private final wlc<lmj> l;
    private final wlc<SpSharedPreferences<Object>> m;
    private final wlc<AppsMusicLibsRemoteconfigProperties> n;
    private final wlc<grq> o;
    private final wlc<vnk> p;
    private final wlc<RxResolver> q;
    private final wlc<kdl> r;
    private final wlc<rka> s;
    private final wlc<jsz> t;
    private final wlc<ihg> u;
    private final wlc<jug> v;
    private final wlc<vjo> w;
    private final wlc<tcn> x;
    private final wlc<gud> y;
    private final wlc<gam> z;

    private qdp(wlc<Context> wlc, wlc<Resources> wlc2, wlc<fpt> wlc3, wlc<jro> wlc4, wlc<jjf> wlc5, wlc<jrp> wlc6, wlc<rgz> wlc7, wlc<rqd> wlc8, wlc<mlj> wlc9, wlc<kuj> wlc10, wlc<jjj> wlc11, wlc<lmj> wlc12, wlc<SpSharedPreferences<Object>> wlc13, wlc<AppsMusicLibsRemoteconfigProperties> wlc14, wlc<grq> wlc15, wlc<vnk> wlc16, wlc<RxResolver> wlc17, wlc<kdl> wlc18, wlc<rka> wlc19, wlc<jsz> wlc20, wlc<ihg> wlc21, wlc<jug> wlc22, wlc<vjo> wlc23, wlc<tcn> wlc24, wlc<gud> wlc25, wlc<gam> wlc26, wlc<rnf> wlc27, wlc<gdz<fko>> wlc28, wlc<rpg> wlc29, wlc<gts> wlc30, wlc<jtw> wlc31) {
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
    }

    public static qdp a(wlc<Context> wlc, wlc<Resources> wlc2, wlc<fpt> wlc3, wlc<jro> wlc4, wlc<jjf> wlc5, wlc<jrp> wlc6, wlc<rgz> wlc7, wlc<rqd> wlc8, wlc<mlj> wlc9, wlc<kuj> wlc10, wlc<jjj> wlc11, wlc<lmj> wlc12, wlc<SpSharedPreferences<Object>> wlc13, wlc<AppsMusicLibsRemoteconfigProperties> wlc14, wlc<grq> wlc15, wlc<vnk> wlc16, wlc<RxResolver> wlc17, wlc<kdl> wlc18, wlc<rka> wlc19, wlc<jsz> wlc20, wlc<ihg> wlc21, wlc<jug> wlc22, wlc<vjo> wlc23, wlc<tcn> wlc24, wlc<gud> wlc25, wlc<gam> wlc26, wlc<rnf> wlc27, wlc<gdz<fko>> wlc28, wlc<rpg> wlc29, wlc<gts> wlc30, wlc<jtw> wlc31) {
        qdp qdp = new qdp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18, wlc19, wlc20, wlc21, wlc22, wlc23, wlc24, wlc25, wlc26, wlc27, wlc28, wlc29, wlc30, wlc31);
        return qdp;
    }

    public final /* synthetic */ Object get() {
        SettingsAdapter settingsAdapter = new SettingsAdapter((Context) this.a.get(), (Resources) this.b.get(), (fpt) this.c.get(), (jro) this.d.get(), (jjf) this.e.get(), (jrp) this.f.get(), (rgz) this.g.get(), (rqd) this.h.get(), (mlj) this.i.get(), (kuj) this.j.get(), (jjj) this.k.get(), (lmj) this.l.get(), (SpSharedPreferences) this.m.get(), (AppsMusicLibsRemoteconfigProperties) this.n.get(), (grq) this.o.get(), (vnk) this.p.get(), (RxResolver) this.q.get(), (kdl) this.r.get(), (rka) this.s.get(), (jsz) this.t.get(), (ihg) this.u.get(), (jug) this.v.get(), (vjo) this.w.get(), (tcn) this.x.get(), (gud) this.y.get(), (gam) this.z.get(), (rnf) this.A.get(), (gdz) this.B.get(), (rpg) this.C.get(), (gts) this.D.get(), (jtw) this.E.get());
        return settingsAdapter;
    }
}
