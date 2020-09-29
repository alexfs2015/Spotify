package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: noz reason: default package */
public final class noz implements vua<nop> {
    private final wlc<DisplayMetrics> a;
    private final wlc<Picasso> b;
    private final wlc<Integer> c;
    private final wlc<Integer> d;
    private final wlc<nph> e;

    private noz(wlc<DisplayMetrics> wlc, wlc<Picasso> wlc2, wlc<Integer> wlc3, wlc<Integer> wlc4, wlc<nph> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static noz a(wlc<DisplayMetrics> wlc, wlc<Picasso> wlc2, wlc<Integer> wlc3, wlc<Integer> wlc4, wlc<nph> wlc5) {
        noz noz = new noz(wlc, wlc2, wlc3, wlc4, wlc5);
        return noz;
    }

    public final /* synthetic */ Object get() {
        nop nop = new nop((DisplayMetrics) this.a.get(), (Picasso) this.b.get(), (nph) this.e.get(), ((Integer) this.c.get()).intValue(), ((Integer) this.d.get()).intValue());
        return (nop) vuf.a(nop, "Cannot return null from a non-@Nullable @Provides method");
    }
}
