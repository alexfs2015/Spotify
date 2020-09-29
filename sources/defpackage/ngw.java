package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: ngw reason: default package */
public final class ngw implements wig<ngv> {
    private final wzi<a> a;
    private final wzi<jzn> b;
    private final wzi<ngr> c;
    private final wzi<DisplayMetrics> d;
    private final wzi<Picasso> e;

    private ngw(wzi<a> wzi, wzi<jzn> wzi2, wzi<ngr> wzi3, wzi<DisplayMetrics> wzi4, wzi<Picasso> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ngw a(wzi<a> wzi, wzi<jzn> wzi2, wzi<ngr> wzi3, wzi<DisplayMetrics> wzi4, wzi<Picasso> wzi5) {
        ngw ngw = new ngw(wzi, wzi2, wzi3, wzi4, wzi5);
        return ngw;
    }

    public final /* synthetic */ Object get() {
        ngv ngv = new ngv((a) this.a.get(), (jzn) this.b.get(), (ngr) this.c.get(), (DisplayMetrics) this.d.get(), (Picasso) this.e.get());
        return ngv;
    }
}
