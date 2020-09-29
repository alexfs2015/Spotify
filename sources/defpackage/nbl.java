package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: nbl reason: default package */
public final class nbl implements vua<nbk> {
    private final wlc<a> a;
    private final wlc<jxn> b;
    private final wlc<nbg> c;
    private final wlc<DisplayMetrics> d;
    private final wlc<Picasso> e;

    private nbl(wlc<a> wlc, wlc<jxn> wlc2, wlc<nbg> wlc3, wlc<DisplayMetrics> wlc4, wlc<Picasso> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static nbl a(wlc<a> wlc, wlc<jxn> wlc2, wlc<nbg> wlc3, wlc<DisplayMetrics> wlc4, wlc<Picasso> wlc5) {
        nbl nbl = new nbl(wlc, wlc2, wlc3, wlc4, wlc5);
        return nbl;
    }

    public final /* synthetic */ Object get() {
        nbk nbk = new nbk((a) this.a.get(), (jxn) this.b.get(), (nbg) this.c.get(), (DisplayMetrics) this.d.get(), (Picasso) this.e.get());
        return nbk;
    }
}
