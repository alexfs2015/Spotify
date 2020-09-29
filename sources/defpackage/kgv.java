package defpackage;

import java.util.List;

/* renamed from: kgv reason: default package */
abstract class kgv extends khb {
    final List<kgx> a;
    final String b;
    final String c;
    final khc d;

    kgv(List<kgx> list, String str, String str2, khc khc) {
        if (list != null) {
            this.a = list;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (khc != null) {
                        this.d = khc;
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

    public final List<kgx> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final khc d() {
        return this.d;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khb) {
            khb khb = (khb) obj;
            return this.a.equals(khb.a()) && this.b.equals(khb.b()) && this.c.equals(khb.c()) && this.d.equals(khb.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
