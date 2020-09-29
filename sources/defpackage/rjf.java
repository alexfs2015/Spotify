package defpackage;

/* renamed from: rjf reason: default package */
public final class rjf {
    public final wzi<rbx> a;
    public final wzi<rfi> b;
    public final wzi<Object> c;
    public final wzi<rgm> d;
    public final wzi<rgo> e;
    public final wzi<rgu> f;
    public final wzi<rdl> g;
    public final wzi<res> h;
    public final wzi<rbp> i;
    public final wzi<rio> j;
    public final wzi<rjc> k;
    public final wzi<rir> l;
    public final wzi<rfo> m;
    public final wzi<rbg> n;

    public rjf(wzi<rbx> wzi, wzi<rfi> wzi2, wzi<Object> wzi3, wzi<rgm> wzi4, wzi<rgo> wzi5, wzi<rgu> wzi6, wzi<rdl> wzi7, wzi<res> wzi8, wzi<rbp> wzi9, wzi<rio> wzi10, wzi<rjc> wzi11, wzi<rir> wzi12, wzi<rfo> wzi13, wzi<rbg> wzi14) {
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

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
