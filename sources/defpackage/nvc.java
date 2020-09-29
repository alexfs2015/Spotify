package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: nvc reason: default package */
public final class nvc implements wig<nus> {
    private final wzi<DisplayMetrics> a;
    private final wzi<Picasso> b;
    private final wzi<Integer> c;
    private final wzi<Integer> d;
    private final wzi<nvk> e;

    private nvc(wzi<DisplayMetrics> wzi, wzi<Picasso> wzi2, wzi<Integer> wzi3, wzi<Integer> wzi4, wzi<nvk> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nvc a(wzi<DisplayMetrics> wzi, wzi<Picasso> wzi2, wzi<Integer> wzi3, wzi<Integer> wzi4, wzi<nvk> wzi5) {
        nvc nvc = new nvc(wzi, wzi2, wzi3, wzi4, wzi5);
        return nvc;
    }

    public final /* synthetic */ Object get() {
        nus nus = new nus((DisplayMetrics) this.a.get(), (Picasso) this.b.get(), (nvk) this.e.get(), ((Integer) this.c.get()).intValue(), ((Integer) this.d.get()).intValue());
        return (nus) wil.a(nus, "Cannot return null from a non-@Nullable @Provides method");
    }
}
