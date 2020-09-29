package defpackage;

import java.util.List;

/* renamed from: kgd reason: default package */
abstract class kgd extends kgh {
    final String a;
    final List<kgl> b;

    /* renamed from: kgd$a */
    static final class a implements defpackage.kgh.a {
        private String a;
        private List<kgl> b;

        a() {
        }

        public final defpackage.kgh.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.kgh.a a(List<kgl> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null years");
        }

        public final kgh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" years");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kgf(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    kgd(String str, List<kgl> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null years");
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final List<kgl> b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecadeTopData{title=");
        sb.append(this.a);
        sb.append(", years=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgh) {
            kgh kgh = (kgh) obj;
            return this.a.equals(kgh.a()) && this.b.equals(kgh.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
