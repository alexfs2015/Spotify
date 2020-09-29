package defpackage;

import java.util.List;

/* renamed from: jlf reason: default package */
final class jlf extends jlj {
    private final List<jli> a;

    jlf(List<jli> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null promotions");
    }

    public final List<jli> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionsResponse{promotions=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jlj)) {
            return false;
        }
        return this.a.equals(((jlj) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
