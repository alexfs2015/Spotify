package defpackage;

import android.app.Application;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader;
import com.spotify.music.internal.util.process.ProcessType;
import java.util.Random;

/* renamed from: klg reason: default package */
public final class klg implements vua<klf> {
    private final wlc<Application> a;
    private final wlc<jha> b;
    private final wlc<rdf> c;
    private final wlc<igw> d;
    private final wlc<rqu> e;
    private final wlc<gho> f;
    private final wlc<vfr> g;
    private final wlc<kmb> h;
    private final wlc<lud> i;
    private final wlc<jvy> j;
    private final wlc<ujc> k;
    private final wlc<ProcessType> l;
    private final wlc<jsz> m;
    private final wlc<Random> n;
    private final wlc<ppt> o;
    private final wlc<OrbitLibraryLoader> p;

    private klg(wlc<Application> wlc, wlc<jha> wlc2, wlc<rdf> wlc3, wlc<igw> wlc4, wlc<rqu> wlc5, wlc<gho> wlc6, wlc<vfr> wlc7, wlc<kmb> wlc8, wlc<lud> wlc9, wlc<jvy> wlc10, wlc<ujc> wlc11, wlc<ProcessType> wlc12, wlc<jsz> wlc13, wlc<Random> wlc14, wlc<ppt> wlc15, wlc<OrbitLibraryLoader> wlc16) {
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
    }

    public static klg a(wlc<Application> wlc, wlc<jha> wlc2, wlc<rdf> wlc3, wlc<igw> wlc4, wlc<rqu> wlc5, wlc<gho> wlc6, wlc<vfr> wlc7, wlc<kmb> wlc8, wlc<lud> wlc9, wlc<jvy> wlc10, wlc<ujc> wlc11, wlc<ProcessType> wlc12, wlc<jsz> wlc13, wlc<Random> wlc14, wlc<ppt> wlc15, wlc<OrbitLibraryLoader> wlc16) {
        klg klg = new klg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16);
        return klg;
    }

    public final /* synthetic */ Object get() {
        klf klf = new klf((Application) this.a.get(), (jha) this.b.get(), (rdf) this.c.get(), (igw) this.d.get(), (rqu) this.e.get(), (gho) this.f.get(), this.g, (kmb) this.h.get(), (lud) this.i.get(), (jvy) this.j.get(), (ujc) this.k.get(), (ProcessType) this.l.get(), (jsz) this.m.get(), (Random) this.n.get(), this.o, (OrbitLibraryLoader) this.p.get());
        return klf;
    }
}
