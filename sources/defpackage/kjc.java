package defpackage;

import java.util.Set;

/* renamed from: kjc reason: default package */
final class kjc<M, F> extends kjx<M, F> {
    private final M a;
    private final Set<F> b;

    kjc(M m, Set<F> set) {
        this.a = m;
        if (set != null) {
            this.b = set;
            return;
        }
        throw new NullPointerException("Null effects");
    }

    /* access modifiers changed from: protected */
    public final M a() {
        return this.a;
    }

    public final Set<F> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Next{model=");
        sb.append(this.a);
        sb.append(", effects=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjx) {
            kjx kjx = (kjx) obj;
            M m = this.a;
            if (m != null ? m.equals(kjx.a()) : kjx.a() == null) {
                if (this.b.equals(kjx.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        M m = this.a;
        return (((m == null ? 0 : m.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
