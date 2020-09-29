package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

/* renamed from: qct reason: default package */
public final class qct implements qcr {
    private final wlc<Activity> a;
    private final wlc<a> b;
    private final wlc<String> c;
    private final wlc<Boolean> d;
    private final wlc<umf> e;
    private final wlc<Boolean> f;
    private final wlc<shj> g;
    private final wlc<a> h;
    private final wlc<b> i;
    private final wlc<pyt> j;
    private final wlc<sai> k;
    private final wlc<Picasso> l;
    private final wlc<qbm> m;
    private final wlc<Boolean> n;

    public qct(wlc<Activity> wlc, wlc<a> wlc2, wlc<String> wlc3, wlc<Boolean> wlc4, wlc<umf> wlc5, wlc<Boolean> wlc6, wlc<shj> wlc7, wlc<a> wlc8, wlc<b> wlc9, wlc<pyt> wlc10, wlc<sai> wlc11, wlc<Picasso> wlc12, wlc<qbm> wlc13, wlc<Boolean> wlc14) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
        this.j = (wlc) a(wlc10, 10);
        this.k = (wlc) a(wlc11, 11);
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ qcq a(ViewGroup viewGroup) {
        qcs qcs = new qcs((Activity) a(this.a.get(), 1), (a) a(this.b.get(), 2), (String) a(this.c.get(), 3), ((Boolean) a(this.d.get(), 4)).booleanValue(), (umf) a(this.e.get(), 5), ((Boolean) a(this.f.get(), 6)).booleanValue(), (shj) this.g.get(), (a) a(this.h.get(), 8), (b) a(this.i.get(), 9), (pyt) a(this.j.get(), 10), (sai) a(this.k.get(), 11), (Picasso) a(this.l.get(), 12), (qbm) a(this.m.get(), 13), ((Boolean) a(this.n.get(), 14)).booleanValue(), viewGroup);
        return qcs;
    }
}
