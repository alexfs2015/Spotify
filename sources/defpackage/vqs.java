package defpackage;

import com.spotify.voice.model.ErrorDomain;

/* renamed from: vqs reason: default package */
final class vqs extends vqv {
    private final String a;
    private final String b;
    private final ErrorDomain c;
    private final vrd d;
    private final String e;

    /* renamed from: vqs$a */
    public static final class a implements defpackage.vqv.a {
        private String a;
        private String b;
        private ErrorDomain c;
        private vrd d;
        private String e;

        public final defpackage.vqv.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.vqv.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        public final defpackage.vqv.a a(ErrorDomain errorDomain) {
            if (errorDomain != null) {
                this.c = errorDomain;
                return this;
            }
            throw new NullPointerException("Null domain");
        }

        public final defpackage.vqv.a a(vrd vrd) {
            if (vrd != null) {
                this.d = vrd;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final defpackage.vqv.a c(String str) {
            this.e = str;
            return this;
        }

        public final vqv a() {
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
                sb3.append(" domain");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" type");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                vqs vqs = new vqs(this.a, this.b, this.c, this.d, this.e, 0);
                return vqs;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ vqs(String str, String str2, ErrorDomain errorDomain, vrd vrd, String str3, byte b2) {
        this(str, str2, errorDomain, vrd, str3);
    }

    private vqs(String str, String str2, ErrorDomain errorDomain, vrd vrd, String str3) {
        this.a = str;
        this.b = str2;
        this.c = errorDomain;
        this.d = vrd;
        this.e = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ErrorDomain c() {
        return this.c;
    }

    public final vrd d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorLogEvent{id=");
        sb.append(this.a);
        sb.append(", consumer=");
        sb.append(this.b);
        sb.append(", domain=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqv) {
            vqv vqv = (vqv) obj;
            if (this.a.equals(vqv.a()) && this.b.equals(vqv.b()) && this.c.equals(vqv.c()) && this.d.equals(vqv.d())) {
                String str = this.e;
                return str != null ? str.equals(vqv.e()) : vqv.e() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
