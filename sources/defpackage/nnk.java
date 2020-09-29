package defpackage;

/* renamed from: nnk reason: default package */
public final class nnk<T> {
    public final nnj<T> a;

    nnk(nnj<T> nnj) {
        this.a = nnj;
    }

    public static <T> nnk<T> a() {
        return new nnk<>(nnj.a());
    }

    public static <T> nnk<T> a(T t) {
        return new nnk<>(nnj.a(t));
    }

    public static <T> nnk<T> a(Throwable th) {
        return new nnk<>(new a(th));
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

    public static <T, R> nnk<R> a(nnj<wsj<T>> nnj) {
        if (nnj instanceof a) {
            return a(((a) nnj).a);
        }
        return new nnk<>(nnj.a(((c) nnj).a));
    }
}
