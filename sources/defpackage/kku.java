package defpackage;

import java.util.List;

/* renamed from: kku reason: default package */
abstract class kku extends kky {
    final String a;
    final List<kkz> b;
    final String c;

    /* renamed from: kku$a */
    static final class a implements defpackage.kky.a {
        private String a;
        private List<kkz> b;
        private String c;

        a() {
        }

        public final defpackage.kky.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kky.a a(List<kkz> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null cards");
        }

        public final kky a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" caption");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" cards");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" previewUrl");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new kkw(this.a, this.b, this.c);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.kky.a b(String str) {
            this.c = str;
            return this;
        }
    }

    kku(String str, List<kkz> list, String str2) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null previewUrl");
            }
            throw new NullPointerException("Null cards");
        }
        throw new NullPointerException("Null caption");
    }

    public final String a() {
        return this.a;
    }

    public final List<kkz> b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kky) {
            kky kky = (kky) obj;
            return this.a.equals(kky.a()) && this.b.equals(kky.b()) && this.c.equals(kky.c());
        }
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Summary{caption=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", previewUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
