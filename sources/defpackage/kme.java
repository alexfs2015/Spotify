package defpackage;

/* renamed from: kme reason: default package */
abstract class kme extends kmg {
    final String a;
    final String b;
    final String c;
    private final String d;

    /* renamed from: kme$a */
    static final class a implements defpackage.kmg.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.kmg.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final kmg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" previewUrl");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" imageUrl");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" name");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" artist");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new kmf(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.kmg.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }

        public final defpackage.kmg.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.kmg.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null artist");
        }
    }

    kme(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.d = str2;
                if (str3 != null) {
                    this.b = str3;
                    if (str4 != null) {
                        this.c = str4;
                        return;
                    }
                    throw new NullPointerException("Null artist");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null previewUrl");
    }

    public final String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmg) {
            kmg kmg = (kmg) obj;
            return this.a.equals(kmg.a()) && this.d.equals(kmg.b()) && this.b.equals(kmg.c()) && this.c.equals(kmg.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopSongsTrack{previewUrl=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", artist=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
