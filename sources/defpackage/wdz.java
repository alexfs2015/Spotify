package defpackage;

/* renamed from: wdz reason: default package */
final class wdz extends wdy {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: wdz$a */
    public static final class a implements defpackage.wdy.a {
        private String a;
        private String b;
        private String c;

        public final defpackage.wdy.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final wdy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" consumer");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" port");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new wdz(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.wdy.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        public final defpackage.wdy.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null port");
        }
    }

    private wdz(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* synthetic */ wdz(String str, String str2, String str3, byte b2) {
        this(str, str2, str3);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdy) {
            wdy wdy = (wdy) obj;
            return this.a.equals(wdy.a()) && this.b.equals(wdy.b()) && this.c.equals(wdy.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLogEvent{id=");
        sb.append(this.a);
        sb.append(", consumer=");
        sb.append(this.b);
        sb.append(", port=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
