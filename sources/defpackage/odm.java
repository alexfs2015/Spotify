package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: odm reason: default package */
public final class odm {
    private final wlc<Picasso> a;
    private final wlc<twz> b;
    private final wlc<a> c;
    private final wlc<vti<jmf<odk>>> d;
    private final wlc<a<odk>> e;
    private final wlc<tui> f;

    public odm(wlc<Picasso> wlc, wlc<twz> wlc2, wlc<a> wlc3, wlc<vti<jmf<odk>>> wlc4, wlc<a<odk>> wlc5, wlc<tui> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
    }

    public final odl a(odh odh) {
        odl odl = new odl((Picasso) a(this.a.get(), 1), (twz) a(this.b.get(), 2), (a) a(this.c.get(), 3), (vti) a(this.d.get(), 4), (a) a(this.e.get(), 5), (tui) a(this.f.get(), 6), odh);
        return odl;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
