package defpackage;

import android.content.res.Resources;
import com.squareup.picasso.Picasso;

/* renamed from: pch reason: default package */
public final class pch implements vua<pcg> {
    private final wlc<Resources> a;
    private final wlc<tsp> b;
    private final wlc<Picasso> c;
    private final wlc<fxn> d;
    private final wlc<a> e;
    private final wlc<a> f;

    private pch(wlc<Resources> wlc, wlc<tsp> wlc2, wlc<Picasso> wlc3, wlc<fxn> wlc4, wlc<a> wlc5, wlc<a> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static pch a(wlc<Resources> wlc, wlc<tsp> wlc2, wlc<Picasso> wlc3, wlc<fxn> wlc4, wlc<a> wlc5, wlc<a> wlc6) {
        pch pch = new pch(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return pch;
    }

    public final /* synthetic */ Object get() {
        pcg pcg = new pcg((Resources) this.a.get(), (tsp) this.b.get(), (Picasso) this.c.get(), vtz.b(this.d), vtz.b(this.e), vtz.b(this.f));
        return pcg;
    }
}
