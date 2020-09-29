package defpackage;

import java.util.List;

/* renamed from: kie reason: default package */
abstract class kie extends kii {
    final String a;
    final String b;
    final String c;
    final List<kih> d;

    /* renamed from: kie$a */
    static final class a implements defpackage.kii.a {
        private String a;
        private String b;
        private String c;
        private List<kih> d;

        a() {
        }

        public final defpackage.kii.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.kii.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null subTitle");
        }

        public final defpackage.kii.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final defpackage.kii.a a(List<kih> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null genres");
        }

        public final kii a() {
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
                return new kig(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    kie(String str, String str2, String str3, List<kih> list) {
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

    public final List<kih> d() {
        return this.d;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kii) {
            kii kii = (kii) obj;
            return this.a.equals(kii.a()) && this.b.equals(kii.b()) && this.c.equals(kii.c()) && this.d.equals(kii.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
