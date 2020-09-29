package defpackage;

/* renamed from: kih reason: default package */
abstract class kih extends kii {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;

    /* renamed from: kih$a */
    static final class a implements defpackage.kii.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        a() {
        }

        public final defpackage.kii.a a(String str) {
            this.a = str;
            return this;
        }

        public final kii a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" introText");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" subtitle");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" artistName");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" imageUrl");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" previewUrl");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                kim kim = new kim(this.a, this.b, this.c, this.d, this.e, this.f);
                return kim;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.kii.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.kii.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.kii.a d(String str) {
            this.d = str;
            return this;
        }

        public final defpackage.kii.a e(String str) {
            this.e = str;
            return this;
        }

        public final defpackage.kii.a f(String str) {
            this.f = str;
            return this;
        }
    }

    kih(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (str5 != null) {
                            this.e = str5;
                            if (str6 != null) {
                                this.f = str6;
                                return;
                            }
                            throw new NullPointerException("Null previewUrl");
                        }
                        throw new NullPointerException("Null imageUrl");
                    }
                    throw new NullPointerException("Null artistName");
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null introText");
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

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kii) {
            kii kii = (kii) obj;
            return this.a.equals(kii.a()) && this.b.equals(kii.b()) && this.c.equals(kii.c()) && this.d.equals(kii.d()) && this.e.equals(kii.e()) && this.f.equals(kii.f());
        }
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistOfTheDecade{introText=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", artistName=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", previewUrl=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
