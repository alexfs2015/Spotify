package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: lte reason: default package */
public final class lte implements wig<ltd> {
    private final wzi<Picasso> a;
    private final wzi<DisplayMetrics> b;

    private lte(wzi<Picasso> wzi, wzi<DisplayMetrics> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lte a(wzi<Picasso> wzi, wzi<DisplayMetrics> wzi2) {
        return new lte(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ltd((Picasso) this.a.get(), (DisplayMetrics) this.b.get());
    }
}
