package defpackage;

/* renamed from: glb reason: default package */
final class glb<T> extends glg<T> {
    private final gli<T> a;
    private final gld<T> b;

    glb(gli<T> gli, gld<T> gld) {
        if (gli != null) {
            this.a = gli;
            if (gld != null) {
                this.b = gld;
                return;
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null matcher");
    }

    public final gli<T> a() {
        return this.a;
    }

    public final gld<T> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glg) {
            glg glg = (glg) obj;
            return this.a.equals(glg.a()) && this.b.equals(glg.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommandRoute{matcher=");
        sb.append(this.a);
        sb.append(", factory=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
