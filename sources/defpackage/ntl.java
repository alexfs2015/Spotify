package defpackage;

/* renamed from: ntl reason: default package */
public final class ntl<T> {
    public final ntk<T> a;

    ntl(ntk<T> ntk) {
        this.a = ntk;
    }

    public static <T> ntl<T> a() {
        return new ntl<>(ntk.a());
    }

    public static <T> ntl<T> a(T t) {
        return new ntl<>(ntk.a(t));
    }

    public static <T> ntl<T> a(Throwable th) {
        return new ntl<>(new a(th));
    }

    public static <T, R> ntl<R> a(ntk<xgo<T>> ntk) {
        return ntk instanceof a ? a(((a) ntk).a) : new ntl<>(ntk.a(((c) ntk).a));
    }

    public final boolean b() {
        return this.a instanceof b;
    }

    public final boolean c() {
        return this.a instanceof a;
    }

    public final boolean d() {
        return this.a instanceof c;
    }

    public final boolean e() {
        return this.a instanceof d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RxStatus{mRxState=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
