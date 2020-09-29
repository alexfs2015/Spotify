package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;

/* renamed from: hfl reason: default package */
public final class hfl implements vua<hfk> {
    private final wlc<Context> a;
    private final wlc<hft> b;
    private final wlc<hfu> c;
    private final wlc<hfi> d;
    private final wlc<hga> e;
    private final wlc<hhs> f;
    private final wlc<hgo> g;
    private final wlc<hfx> h;
    private final wlc<glm> i;
    private final wlc<unt> j;
    private final wlc<StateRestoreFileDeleter> k;
    private final wlc<hha> l;
    private final wlc<hhu> m;
    private final wlc<hfh> n;
    private final wlc<rla> o;
    private final wlc<Looper> p;
    private final wlc<Handler> q;
    private final wlc<Optional<OrbitServiceInterface>> r;

    private hfl(wlc<Context> wlc, wlc<hft> wlc2, wlc<hfu> wlc3, wlc<hfi> wlc4, wlc<hga> wlc5, wlc<hhs> wlc6, wlc<hgo> wlc7, wlc<hfx> wlc8, wlc<glm> wlc9, wlc<unt> wlc10, wlc<StateRestoreFileDeleter> wlc11, wlc<hha> wlc12, wlc<hhu> wlc13, wlc<hfh> wlc14, wlc<rla> wlc15, wlc<Looper> wlc16, wlc<Handler> wlc17, wlc<Optional<OrbitServiceInterface>> wlc18) {
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
    }

    public static hfl a(wlc<Context> wlc, wlc<hft> wlc2, wlc<hfu> wlc3, wlc<hfi> wlc4, wlc<hga> wlc5, wlc<hhs> wlc6, wlc<hgo> wlc7, wlc<hfx> wlc8, wlc<glm> wlc9, wlc<unt> wlc10, wlc<StateRestoreFileDeleter> wlc11, wlc<hha> wlc12, wlc<hhu> wlc13, wlc<hfh> wlc14, wlc<rla> wlc15, wlc<Looper> wlc16, wlc<Handler> wlc17, wlc<Optional<OrbitServiceInterface>> wlc18) {
        hfl hfl = new hfl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18);
        return hfl;
    }

    public final /* synthetic */ Object get() {
        hfk hfk = new hfk((Context) this.a.get(), (hft) this.b.get(), (hfu) this.c.get(), (hfi) this.d.get(), (hga) this.e.get(), (hhs) this.f.get(), (hgo) this.g.get(), (hfx) this.h.get(), (glm) this.i.get(), (unt) this.j.get(), (StateRestoreFileDeleter) this.k.get(), (hha) this.l.get(), (hhu) this.m.get(), (hfh) this.n.get(), (rla) this.o.get(), (Looper) this.p.get(), (Handler) this.q.get(), (Optional) this.r.get());
        return hfk;
    }
}
