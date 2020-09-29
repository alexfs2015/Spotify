package defpackage;

/* renamed from: kjz reason: default package */
abstract class kjz extends kkd {
    final String a;
    final String b;
    final String c;
    private final String d;

    /* renamed from: kjz$a */
    static final class a extends defpackage.kkd.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.kkd.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null artistImageUrl");
        }

        public final kkd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artistImageUrl");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" artistName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" artistRank");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" previewUrl");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new kkb(this.a, this.b, this.c, this.d);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.kkd.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null artistName");
        }

        public final defpackage.kkd.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null artistRank");
        }

        public final defpackage.kkd.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }
    }

    kjz(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.d = str;
            if (str2 != null) {
                this.a = str2;
                if (str3 != null) {
                    this.b = str3;
                    if (str4 != null) {
                        this.c = str4;
                        return;
                    }
                    throw new NullPointerException("Null previewUrl");
                }
                throw new NullPointerException("Null artistRank");
            }
            throw new NullPointerException("Null artistName");
        }
        throw new NullPointerException("Null artistImageUrl");
    }

    public String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
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
        if (obj instanceof kkd) {
            kkd kkd = (kkd) obj;
            return this.d.equals(kkd.a()) && this.a.equals(kkd.b()) && this.b.equals(kkd.c()) && this.c.equals(kkd.d());
        }
    }

    public int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OtherTopArtist{artistImageUrl=");
        sb.append(this.d);
        sb.append(", artistName=");
        sb.append(this.a);
        sb.append(", artistRank=");
        sb.append(this.b);
        sb.append(", previewUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
