package defpackage;

/* renamed from: kfu reason: default package */
abstract class kfu extends kfv {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;

    /* renamed from: kfu$a */
    static final class a implements defpackage.kfv.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        a() {
        }

        public final defpackage.kfv.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kfv.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.kfv.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.kfv.a d(String str) {
            this.d = str;
            return this;
        }

        public final defpackage.kfv.a e(String str) {
            this.e = str;
            return this;
        }

        public final kfv a() {
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
                sb2.append(" detailTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" detailText");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" imageUrl");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" previewUrl");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                kfz kfz = new kfz(this.a, this.b, this.c, this.d, this.e);
                return kfz;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    kfu(String str, String str2, String str3, String str4, String str5) {
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
                            return;
                        }
                        throw new NullPointerException("Null previewUrl");
                    }
                    throw new NullPointerException("Null imageUrl");
                }
                throw new NullPointerException("Null detailText");
            }
            throw new NullPointerException("Null detailTitle");
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

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistOfTheDecade{introText=");
        sb.append(this.a);
        sb.append(", detailTitle=");
        sb.append(this.b);
        sb.append(", detailText=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", previewUrl=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfv) {
            kfv kfv = (kfv) obj;
            return this.a.equals(kfv.a()) && this.b.equals(kfv.b()) && this.c.equals(kfv.c()) && this.d.equals(kfv.d()) && this.e.equals(kfv.e());
        }
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
