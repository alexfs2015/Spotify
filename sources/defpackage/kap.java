package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: kap reason: default package */
public final class kap implements wig<jzn> {
    private final wzi<Context> a;
    private final wzi<Looper> b;
    private final wzi<giz> c;
    private final wzi<Picasso> d;
    private final wzi<kdt> e;
    private final wzi<gcb> f;
    private final wzi<Handler> g;
    private final wzi<keh> h;
    private final wzi<kep> i;
    private final wzi<kbd> j;
    private final wzi<keu> k;
    private final wzi<kdp> l;
    private final wzi<kds> m;

    private kap(wzi<Context> wzi, wzi<Looper> wzi2, wzi<giz> wzi3, wzi<Picasso> wzi4, wzi<kdt> wzi5, wzi<gcb> wzi6, wzi<Handler> wzi7, wzi<keh> wzi8, wzi<kep> wzi9, wzi<kbd> wzi10, wzi<keu> wzi11, wzi<kdp> wzi12, wzi<kds> wzi13) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
    }

    public static kap a(wzi<Context> wzi, wzi<Looper> wzi2, wzi<giz> wzi3, wzi<Picasso> wzi4, wzi<kdt> wzi5, wzi<gcb> wzi6, wzi<Handler> wzi7, wzi<keh> wzi8, wzi<kep> wzi9, wzi<kbd> wzi10, wzi<keu> wzi11, wzi<kdp> wzi12, wzi<kds> wzi13) {
        kap kap = new kap(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13);
        return kap;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        Looper looper = (Looper) this.b.get();
        wzi<giz> wzi = this.c;
        Picasso picasso = (Picasso) this.d.get();
        kdt kdt = (kdt) this.e.get();
        gcb gcb = (gcb) this.f.get();
        Handler handler = (Handler) this.g.get();
        keh keh = (keh) this.h.get();
        kep kep = (kep) this.i.get();
        kbd kbd = (kbd) this.j.get();
        keu keu = (keu) this.k.get();
        kdp kdp = (kdp) this.l.get();
        kds kds = (kds) this.m.get();
        jzn jzn = r2;
        jzn jzn2 = new jzn(context, looper, ((giz) wzi.get()).b, picasso, kdt, gcb, handler, keh, kep);
        jzn.d = "context-player";
        jzn.b = kbd;
        jzn.c = keu;
        jzn.e = true;
        return (jzn) wil.a(jzn.b(Arrays.asList(new kdm[]{kdp, kds})), "Cannot return null from a non-@Nullable @Provides method");
    }
}
