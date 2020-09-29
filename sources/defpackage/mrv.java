package defpackage;

import java.util.List;

/* renamed from: mrv reason: default package */
final class mrv extends msa {
    private final List<msb> a;
    private final List<msb> b;

    mrv(List<msb> list, List<msb> list2) {
        if (list != null) {
            this.a = list;
            if (list2 != null) {
                this.b = list2;
                return;
            }
            throw new NullPointerException("Null deletions");
        }
        throw new NullPointerException("Null insertions");
    }

    public final List<msb> a() {
        return this.a;
    }

    public final List<msb> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutations{insertions=");
        sb.append(this.a);
        sb.append(", deletions=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msa) {
            msa msa = (msa) obj;
            return this.a.equals(msa.a()) && this.b.equals(msa.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
