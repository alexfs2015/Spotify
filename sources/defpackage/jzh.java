package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: jzh reason: default package */
public final class jzh implements vua<jxn> {
    private final wlc<Context> a;
    private final wlc<Looper> b;
    private final wlc<Picasso> c;
    private final wlc<kbt> d;
    private final wlc<gbd> e;
    private final wlc<Handler> f;
    private final wlc<kcp> g;
    private final wlc<kcl> h;
    private final wlc<gho> i;
    private final wlc<jyd> j;
    private final wlc<kbp> k;
    private final wlc<kbs> l;

    private jzh(wlc<Context> wlc, wlc<Looper> wlc2, wlc<Picasso> wlc3, wlc<kbt> wlc4, wlc<gbd> wlc5, wlc<Handler> wlc6, wlc<kcp> wlc7, wlc<kcl> wlc8, wlc<gho> wlc9, wlc<jyd> wlc10, wlc<kbp> wlc11, wlc<kbs> wlc12) {
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

    public static jzh a(wlc<Context> wlc, wlc<Looper> wlc2, wlc<Picasso> wlc3, wlc<kbt> wlc4, wlc<gbd> wlc5, wlc<Handler> wlc6, wlc<kcp> wlc7, wlc<kcl> wlc8, wlc<gho> wlc9, wlc<jyd> wlc10, wlc<kbp> wlc11, wlc<kbs> wlc12) {
        jzh jzh = new jzh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12);
        return jzh;
    }

    public final /* synthetic */ Object get() {
        jyd jyd = (jyd) this.j.get();
        kbp kbp = (kbp) this.k.get();
        kbs kbs = (kbs) this.l.get();
        jxn jxn = new jxn((Context) this.a.get(), (Looper) this.b.get(), ((gho) this.i.get()).b, (Picasso) this.c.get(), (kbt) this.d.get(), (gbd) this.e.get(), (Handler) this.f.get(), (kcp) this.g.get(), (kcl) this.h.get());
        jxn.g = jyd;
        return (jxn) vuf.a(jxn.b(Arrays.asList(new kbm[]{kbp, kbs})), "Cannot return null from a non-@Nullable @Provides method");
    }
}
