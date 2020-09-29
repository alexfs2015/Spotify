package defpackage;

import java.util.Set;

/* renamed from: kmk reason: default package */
final class kmk<M, F> extends kmw<M, F> {
    private final M a;
    private final Set<F> b;

    kmk(M m, Set<F> set) {
        if (m != null) {
            this.a = m;
            if (set != null) {
                this.b = set;
                return;
            }
            throw new NullPointerException("Null effects");
        }
        throw new NullPointerException("Null model");
    }

    public final M a() {
        return this.a;
    }

    public final Set<F> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmw) {
            kmw kmw = (kmw) obj;
            return this.a.equals(kmw.a()) && this.b.equals(kmw.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("First{model=");
        sb.append(this.a);
        sb.append(", effects=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
