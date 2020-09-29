package defpackage;

import java.util.List;

/* renamed from: luj reason: default package */
abstract class luj extends lur {
    final String a;
    final List<luu> b;

    luj(String str, List<luu> list) {
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

    public final List<luu> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lur) {
            lur lur = (lur) obj;
            return this.a.equals(lur.a()) && this.b.equals(lur.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Genre{name=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
