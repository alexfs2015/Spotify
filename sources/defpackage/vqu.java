package defpackage;

/* renamed from: vqu reason: default package */
final class vqu extends vqx {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final String e;

    /* renamed from: vqu$a */
    public static final class a implements defpackage.vqx.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private String e;

        public final defpackage.vqx.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.vqx.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        public final defpackage.vqx.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vqx.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vqx.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null connectivityType");
        }

        public final vqx a() {
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
                sb3.append(" isMicGranted");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isOffline");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" connectivityType");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                vqu vqu = new vqu(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e, 0);
                return vqu;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ vqu(String str, String str2, boolean z, boolean z2, String str3, byte b2) {
        this(str, str2, z, z2, str3);
    }

    private vqu(String str, String str2, boolean z, boolean z2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusLogEvent{id=");
        sb.append(this.a);
        sb.append(", consumer=");
        sb.append(this.b);
        sb.append(", isMicGranted=");
        sb.append(this.c);
        sb.append(", isOffline=");
        sb.append(this.d);
        sb.append(", connectivityType=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqx) {
            vqx vqx = (vqx) obj;
            return this.a.equals(vqx.a()) && this.b.equals(vqx.b()) && this.c == vqx.c() && this.d == vqx.d() && this.e.equals(vqx.e());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.e.hashCode();
    }
}
