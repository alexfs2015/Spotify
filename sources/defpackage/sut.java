package defpackage;

/* renamed from: sut reason: default package */
final class sut extends suu {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: sut$a */
    static final class a implements defpackage.suu.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.suu.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.suu.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.suu.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.suu.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public final suu a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" contextUri");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                sut sut = new sut(this.a, this.b, this.c, this.d, 0);
                return sut;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ sut(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
    }

    private sut(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("PivotModel{title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", imageUri=");
        sb.append(this.c);
        sb.append(", contextUri=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof suu) {
            suu suu = (suu) obj;
            if (this.a.equals(suu.a())) {
                String str = this.b;
                if (str != null ? str.equals(suu.b()) : suu.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(suu.c()) : suu.c() == null) {
                        if (this.d.equals(suu.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.d.hashCode();
    }
}
