package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;
import java.util.Set;

/* renamed from: hnh reason: default package */
public final class hnh implements vua<hng> {
    private final wlc<Context> a;
    private final wlc<hmo> b;
    private final wlc<hou> c;
    private final wlc<hoz> d;
    private final wlc<RxResolver> e;
    private final wlc<Scheduler> f;
    private final wlc<hry> g;
    private final wlc<hsn> h;
    private final wlc<hpb> i;
    private final wlc<jrp> j;
    private final wlc<gsy> k;
    private final wlc<Set<hpx>> l;

    private hnh(wlc<Context> wlc, wlc<hmo> wlc2, wlc<hou> wlc3, wlc<hoz> wlc4, wlc<RxResolver> wlc5, wlc<Scheduler> wlc6, wlc<hry> wlc7, wlc<hsn> wlc8, wlc<hpb> wlc9, wlc<jrp> wlc10, wlc<gsy> wlc11, wlc<Set<hpx>> wlc12) {
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
    }

    public static hnh a(wlc<Context> wlc, wlc<hmo> wlc2, wlc<hou> wlc3, wlc<hoz> wlc4, wlc<RxResolver> wlc5, wlc<Scheduler> wlc6, wlc<hry> wlc7, wlc<hsn> wlc8, wlc<hpb> wlc9, wlc<jrp> wlc10, wlc<gsy> wlc11, wlc<Set<hpx>> wlc12) {
        hnh hnh = new hnh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12);
        return hnh;
    }

    public final /* synthetic */ Object get() {
        hng hng = new hng((Context) this.a.get(), (hmo) this.b.get(), (hou) this.c.get(), (hoz) this.d.get(), (RxResolver) this.e.get(), (Scheduler) this.f.get(), (hry) this.g.get(), (hsn) this.h.get(), (hpb) this.i.get(), (jrp) this.j.get(), (gsy) this.k.get(), (Set) this.l.get());
        return hng;
    }
}
