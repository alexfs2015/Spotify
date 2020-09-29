package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: ocf reason: default package */
public final class ocf implements vua<oce> {
    private final wlc<Resources> a;
    private final wlc<gnj> b;
    private final wlc<a> c;
    private final wlc<Scheduler> d;
    private final wlc<Scheduler> e;
    private final wlc<Observable<SignupConfigurationResponse>> f;
    private final wlc<ocb> g;
    private final wlc<oaz> h;
    private final wlc<glw<oas>> i;
    private final wlc<b> j;
    private final wlc<oap> k;
    private final wlc<gme<oas>> l;
    private final wlc<gmi<oas, oau>> m;
    private final wlc<oav> n;
    private final wlc<a> o;
    private final wlc<obx> p;
    private final wlc<gmb> q;
    private final wlc<gkg> r;
    private final wlc<gkl> s;

    private ocf(wlc<Resources> wlc, wlc<gnj> wlc2, wlc<a> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<Observable<SignupConfigurationResponse>> wlc6, wlc<ocb> wlc7, wlc<oaz> wlc8, wlc<glw<oas>> wlc9, wlc<b> wlc10, wlc<oap> wlc11, wlc<gme<oas>> wlc12, wlc<gmi<oas, oau>> wlc13, wlc<oav> wlc14, wlc<a> wlc15, wlc<obx> wlc16, wlc<gmb> wlc17, wlc<gkg> wlc18, wlc<gkl> wlc19) {
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
    }

    public static ocf a(wlc<Resources> wlc, wlc<gnj> wlc2, wlc<a> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<Observable<SignupConfigurationResponse>> wlc6, wlc<ocb> wlc7, wlc<oaz> wlc8, wlc<glw<oas>> wlc9, wlc<b> wlc10, wlc<oap> wlc11, wlc<gme<oas>> wlc12, wlc<gmi<oas, oau>> wlc13, wlc<oav> wlc14, wlc<a> wlc15, wlc<obx> wlc16, wlc<gmb> wlc17, wlc<gkg> wlc18, wlc<gkl> wlc19) {
        ocf ocf = new ocf(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18, wlc19);
        return ocf;
    }

    public final /* synthetic */ Object get() {
        oce oce = new oce((Resources) this.a.get(), (gnj) this.b.get(), (a) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get(), (Observable) this.f.get(), (ocb) this.g.get(), (oaz) this.h.get(), (glw) this.i.get(), (b) this.j.get(), (oap) this.k.get(), (gme) this.l.get(), (gmi) this.m.get(), (oav) this.n.get(), (a) this.o.get(), (obx) this.p.get(), (gmb) this.q.get(), (gkg) this.r.get(), (gkl) this.s.get());
        return oce;
    }
}
