package defpackage;

/* renamed from: hnb reason: default package */
final class hnb extends hnd {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: hnb$a */
    public static final class a implements defpackage.hnd.a {
        private String a;
        private String b;
        private String c;

        public final defpackage.hnd.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null parentId");
        }

        public final defpackage.hnd.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null packageName");
        }

        public final defpackage.hnd.a c(String str) {
            this.c = str;
            return this;
        }

        public final hnd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" parentId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" packageName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" clientId");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new hnb(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ hnb(String str, String str2, String str3, byte b2) {
        this(str, str2, str3);
    }

    private hnb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalIntegrationDetails{parentId=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", clientId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hnd) {
            hnd hnd = (hnd) obj;
            return this.a.equals(hnd.a()) && this.b.equals(hnd.b()) && this.c.equals(hnd.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
