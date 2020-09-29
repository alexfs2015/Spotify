package defpackage;

import java.util.List;

/* renamed from: jnr reason: default package */
final class jnr extends jnv {
    private final List<jnu> a;

    jnr(List<jnu> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null promotions");
    }

    public final List<jnu> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jnv)) {
            return false;
        }
        return this.a.equals(((jnv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionsResponse{promotions=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
