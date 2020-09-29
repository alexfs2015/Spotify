package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

/* renamed from: qlw reason: default package */
public final class qlw implements qlu {
    private final wzi<Activity> a;
    private final wzi<a> b;
    private final wzi<String> c;
    private final wzi<Boolean> d;
    private final wzi<uxj> e;
    private final wzi<Boolean> f;
    private final wzi<srq> g;
    private final wzi<a> h;
    private final wzi<b> i;
    private final wzi<qhr> j;
    private final wzi<skp> k;
    private final wzi<Picasso> l;
    private final wzi<qkk> m;
    private final wzi<Boolean> n;

    public qlw(wzi<Activity> wzi, wzi<a> wzi2, wzi<String> wzi3, wzi<Boolean> wzi4, wzi<uxj> wzi5, wzi<Boolean> wzi6, wzi<srq> wzi7, wzi<a> wzi8, wzi<b> wzi9, wzi<qhr> wzi10, wzi<skp> wzi11, wzi<Picasso> wzi12, wzi<qkk> wzi13, wzi<Boolean> wzi14) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
        this.j = (wzi) a(wzi10, 10);
        this.k = (wzi) a(wzi11, 11);
        this.l = (wzi) a(wzi12, 12);
        this.m = (wzi) a(wzi13, 13);
        this.n = (wzi) a(wzi14, 14);
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ qlt a(ViewGroup viewGroup) {
        qlv qlv = new qlv((Activity) a(this.a.get(), 1), (a) a(this.b.get(), 2), (String) a(this.c.get(), 3), ((Boolean) a(this.d.get(), 4)).booleanValue(), (uxj) a(this.e.get(), 5), ((Boolean) a(this.f.get(), 6)).booleanValue(), (srq) this.g.get(), (a) a(this.h.get(), 8), (b) a(this.i.get(), 9), (qhr) a(this.j.get(), 10), (skp) a(this.k.get(), 11), (Picasso) a(this.l.get(), 12), (qkk) a(this.m.get(), 13), ((Boolean) a(this.n.get(), 14)).booleanValue(), viewGroup);
        return qlv;
    }
}
