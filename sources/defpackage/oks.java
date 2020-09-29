package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: oks reason: default package */
public final class oks {
    private final wzi<Picasso> a;
    private final wzi<ujc> b;
    private final wzi<a> c;
    private final wzi<who<jor<okq>>> d;
    private final wzi<a<okq>> e;
    private final wzi<ugl> f;

    public oks(wzi<Picasso> wzi, wzi<ujc> wzi2, wzi<a> wzi3, wzi<who<jor<okq>>> wzi4, wzi<a<okq>> wzi5, wzi<ugl> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final okr a(okn okn) {
        okr okr = new okr((Picasso) a(this.a.get(), 1), (ujc) a(this.b.get(), 2), (a) a(this.c.get(), 3), (who) a(this.d.get(), 4), (a) a(this.e.get(), 5), (ugl) a(this.f.get(), 6), okn);
        return okr;
    }
}
