package defpackage;

import java.util.Set;

/* renamed from: kml reason: default package */
final class kml<M, F> extends kng<M, F> {
    private final M a;
    private final Set<F> b;

    kml(M m, Set<F> set) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kng) {
            kng kng = (kng) obj;
            M m = this.a;
            if (m != null ? m.equals(kng.a()) : kng.a() == null) {
                if (this.b.equals(kng.b())) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Next{model=");
        sb.append(this.a);
        sb.append(", effects=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
