package defpackage;

import com.spotify.rcs.model.proto.Platform;

/* renamed from: rxg reason: default package */
final class rxg extends rxl {
    private final String a;
    private final String b;
    private final String c;
    private final Platform d;

    /* renamed from: rxg$a */
    public static final class a extends defpackage.rxl.a {
        private String a;
        private String b;
        private String c;
        private Platform d;

        public final defpackage.rxl.a a(Platform platform) {
            if (platform != null) {
                this.d = platform;
                return this;
            }
            throw new NullPointerException("Null platform");
        }

        public final defpackage.rxl.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null clientId");
        }

        public final rxl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" clientId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" clientVersion");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" installationId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" platform");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                rxg rxg = new rxg(this.a, this.b, this.c, this.d, 0);
                return rxg;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.rxl.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null clientVersion");
        }

        public final defpackage.rxl.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null installationId");
        }
    }

    private rxg(String str, String str2, String str3, Platform platform) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = platform;
    }

    /* synthetic */ rxg(String str, String str2, String str3, Platform platform, byte b2) {
        this(str, str2, str3, platform);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final String c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final Platform d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rxl) {
            rxl rxl = (rxl) obj;
            return this.a.equals(rxl.a()) && this.b.equals(rxl.b()) && this.c.equals(rxl.c()) && this.d.equals(rxl.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientData{clientId=");
        sb.append(this.a);
        sb.append(", clientVersion=");
        sb.append(this.b);
        sb.append(", installationId=");
        sb.append(this.c);
        sb.append(", platform=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
