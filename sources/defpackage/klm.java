package defpackage;

import java.util.List;

/* renamed from: klm reason: default package */
abstract class klm extends kls {
    final String a;
    final String b;
    final String c;
    final List<klq> d;

    /* renamed from: klm$a */
    static final class a implements defpackage.kls.a {
        private String a;
        private String b;
        private String c;
        private List<klq> d;

        a() {
        }

        public final defpackage.kls.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.kls.a a(List<klq> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null genres");
        }

        public final kls a() {
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
                sb2.append(" subTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" previewUrl");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" genres");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new klp(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.kls.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null subTitle");
        }

        public final defpackage.kls.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }
    }

    klm(String str, String str2, String str3, List<klq> list) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (list != null) {
                        this.d = list;
                        return;
                    }
                    throw new NullPointerException("Null genres");
                }
                throw new NullPointerException("Null previewUrl");
            }
            throw new NullPointerException("Null subTitle");
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final List<klq> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kls) {
            kls kls = (kls) obj;
            return this.a.equals(kls.a()) && this.b.equals(kls.b()) && this.c.equals(kls.c()) && this.d.equals(kls.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopGenres{title=");
        sb.append(this.a);
        sb.append(", subTitle=");
        sb.append(this.b);
        sb.append(", previewUrl=");
        sb.append(this.c);
        sb.append(", genres=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
