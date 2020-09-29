package defpackage;

/* renamed from: tqk reason: default package */
final class tqk extends tqm {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: tqk$a */
    public static final class a implements defpackage.tqm.a {
        private String a;
        private String b;
        private String c;
        private String d;

        public final defpackage.tqm.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final tqm a() {
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
                sb2.append(" subtitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" imageUri");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" contextUri");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                tqk tqk = new tqk(this.a, this.b, this.c, this.d, 0);
                return tqk;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.tqm.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final defpackage.tqm.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public final defpackage.tqm.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }
    }

    private tqk(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* synthetic */ tqk(String str, String str2, String str3, String str4, byte b2) {
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
        if (obj instanceof tqm) {
            tqm tqm = (tqm) obj;
            return this.a.equals(tqm.a()) && this.b.equals(tqm.b()) && this.c.equals(tqm.c()) && this.d.equals(tqm.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceResultItem{title=");
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
