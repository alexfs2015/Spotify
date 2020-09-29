package defpackage;

import java.util.List;

/* renamed from: kji reason: default package */
abstract class kji extends kjo {
    final List<kjk> a;
    final String b;
    final String c;
    final kjp d;

    kji(List<kjk> list, String str, String str2, kjp kjp) {
        if (list != null) {
            this.a = list;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (kjp != null) {
                        this.d = kjp;
                        return;
                    }
                    throw new NullPointerException("Null stats");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null caption");
        }
        throw new NullPointerException("Null artists");
    }

    public final List<kjk> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final kjp d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjo) {
            kjo kjo = (kjo) obj;
            return this.a.equals(kjo.a()) && this.b.equals(kjo.b()) && this.c.equals(kjo.c()) && this.d.equals(kjo.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GlobalCitizen{artists=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", stats=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
