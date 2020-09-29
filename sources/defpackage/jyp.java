package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: jyp reason: default package */
public final class jyp implements vua<jxn> {
    private final wlc<Context> a;
    private final wlc<Looper> b;
    private final wlc<gho> c;
    private final wlc<Picasso> d;
    private final wlc<kbt> e;
    private final wlc<gbd> f;
    private final wlc<Handler> g;
    private final wlc<kcp> h;
    private final wlc<kcl> i;
    private final wlc<jzd> j;
    private final wlc<kct> k;
    private final wlc<kbp> l;
    private final wlc<kbs> m;

    private jyp(wlc<Context> wlc, wlc<Looper> wlc2, wlc<gho> wlc3, wlc<Picasso> wlc4, wlc<kbt> wlc5, wlc<gbd> wlc6, wlc<Handler> wlc7, wlc<kcp> wlc8, wlc<kcl> wlc9, wlc<jzd> wlc10, wlc<kct> wlc11, wlc<kbp> wlc12, wlc<kbs> wlc13) {
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
    }

    public static jyp a(wlc<Context> wlc, wlc<Looper> wlc2, wlc<gho> wlc3, wlc<Picasso> wlc4, wlc<kbt> wlc5, wlc<gbd> wlc6, wlc<Handler> wlc7, wlc<kcp> wlc8, wlc<kcl> wlc9, wlc<jzd> wlc10, wlc<kct> wlc11, wlc<kbp> wlc12, wlc<kbs> wlc13) {
        jyp jyp = new jyp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13);
        return jyp;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        Looper looper = (Looper) this.b.get();
        wlc<gho> wlc = this.c;
        Picasso picasso = (Picasso) this.d.get();
        kbt kbt = (kbt) this.e.get();
        gbd gbd = (gbd) this.f.get();
        Handler handler = (Handler) this.g.get();
        kcp kcp = (kcp) this.h.get();
        kcl kcl = (kcl) this.i.get();
        jzd jzd = (jzd) this.j.get();
        kct kct = (kct) this.k.get();
        kbp kbp = (kbp) this.l.get();
        kbs kbs = (kbs) this.m.get();
        jxn jxn = r2;
        jxn jxn2 = new jxn(context, looper, ((gho) wlc.get()).b, picasso, kbt, gbd, handler, kcp, kcl);
        jxn.d = "context-player";
        jxn.b = jzd;
        jxn.c = kct;
        jxn.e = true;
        return (jxn) vuf.a(jxn.b(Arrays.asList(new kbm[]{kbp, kbs})), "Cannot return null from a non-@Nullable @Provides method");
    }
}
