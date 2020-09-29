package defpackage;

/* renamed from: kiw reason: default package */
abstract class kiw extends kja {
    final String a;
    final String b;
    final String c;
    private final String d;

    /* renamed from: kiw$a */
    static final class a implements defpackage.kja.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.kja.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kja.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.kja.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.kja.a d(String str) {
            this.d = str;
            return this;
        }

        public final kja a() {
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
                return new kiy(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    kiw(String str, String str2, String str3, String str4) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kja) {
            kja kja = (kja) obj;
            return this.a.equals(kja.a()) && this.d.equals(kja.b()) && this.b.equals(kja.c()) && this.c.equals(kja.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
