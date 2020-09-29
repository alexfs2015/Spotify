package defpackage;

/* renamed from: ho reason: default package */
public final class ho<F, S> {
    public final F a;
    public final S b;

    public ho(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> ho<A, B> a(A a2, B b2) {
        return new ho<>(a2, b2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return hn.a(hoVar.a, this.a) && hn.a(hoVar.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.a));
        sb.append(" ");
        sb.append(String.valueOf(this.b));
        sb.append("}");
        return sb.toString();
    }
}
