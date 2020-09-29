package defpackage;

import java.util.List;

/* renamed from: lqk reason: default package */
abstract class lqk extends lqs {
    final String a;
    final List<lqv> b;

    lqk(String str, List<lqv> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null tracks");
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final List<lqv> b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Genre{name=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqs) {
            lqs lqs = (lqs) obj;
            return this.a.equals(lqs.a()) && this.b.equals(lqs.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
