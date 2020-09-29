package defpackage;

import java.util.List;

/* renamed from: mrw reason: default package */
final class mrw extends msb {
    private final String a;
    private final List<mry> b;

    mrw(String str, List<mry> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null feedItems");
        }
        throw new NullPointerException("Null precedingItemId");
    }

    public final String a() {
        return this.a;
    }

    public final List<mry> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation{precedingItemId=");
        sb.append(this.a);
        sb.append(", feedItems=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msb) {
            msb msb = (msb) obj;
            return this.a.equals(msb.a()) && this.b.equals(msb.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
