package defpackage;

/* renamed from: tfa reason: default package */
final class tfa extends tfb {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: tfa$a */
    static final class a implements defpackage.tfb.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.tfb.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final tfb a() {
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
                tfa tfa = new tfa(this.a, this.b, this.c, this.d, 0);
                return tfa;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.tfb.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.tfb.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.tfb.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }
    }

    private tfa(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* synthetic */ tfa(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfb) {
            tfb tfb = (tfb) obj;
            if (this.a.equals(tfb.a())) {
                String str = this.b;
                if (str != null ? str.equals(tfb.b()) : tfb.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(tfb.c()) : tfb.c() == null) {
                        if (this.d.equals(tfb.d())) {
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
}
