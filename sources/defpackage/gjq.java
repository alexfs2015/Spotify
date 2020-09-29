package defpackage;

/* renamed from: gjq reason: default package */
final class gjq<T> extends gjv<T> {
    private final gjx<T> a;
    private final gjs<T> b;

    gjq(gjx<T> gjx, gjs<T> gjs) {
        if (gjx != null) {
            this.a = gjx;
            if (gjs != null) {
                this.b = gjs;
                return;
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null matcher");
    }

    public final gjx<T> a() {
        return this.a;
    }

    public final gjs<T> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommandRoute{matcher=");
        sb.append(this.a);
        sb.append(", factory=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjv) {
            gjv gjv = (gjv) obj;
            return this.a.equals(gjv.a()) && this.b.equals(gjv.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
