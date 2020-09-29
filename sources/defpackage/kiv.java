package defpackage;

/* renamed from: kiv reason: default package */
abstract class kiv extends kiz {
    final String a;
    final String b;
    final String c;
    final String d;

    /* renamed from: kiv$a */
    static final class a implements defpackage.kiz.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.kiz.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kiz.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.kiz.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.kiz.a d(String str) {
            this.d = str;
            return this;
        }

        public final kiz a() {
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
                sb2.append(" imageUrl");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" spotifyUri");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" buttonText");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new kix(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    kiv(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        return;
                    }
                    throw new NullPointerException("Null buttonText");
                }
                throw new NullPointerException("Null spotifyUri");
            }
            throw new NullPointerException("Null imageUrl");
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

    public final String d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopSongsPlaylist{title=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", spotifyUri=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kiz) {
            kiz kiz = (kiz) obj;
            return this.a.equals(kiz.a()) && this.b.equals(kiz.b()) && this.c.equals(kiz.c()) && this.d.equals(kiz.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
