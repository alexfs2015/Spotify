package defpackage;

/* renamed from: vbk reason: default package */
abstract class vbk extends vbr {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final String e;

    /* renamed from: vbk$a */
    static final class a implements defpackage.vbr.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private String e;

        /* synthetic */ a(vbr vbr, byte b2) {
            this(vbr);
        }

        a() {
        }

        private a(vbr vbr) {
            this.a = vbr.a();
            this.b = vbr.b();
            this.c = vbr.c();
            this.d = Boolean.valueOf(vbr.d());
            this.e = vbr.e();
        }

        public final defpackage.vbr.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final vbr a() {
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
                sb2.append(" name");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" color");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" selected");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                vbn vbn = new vbn(this.a, this.b, this.c, this.d.booleanValue(), this.e);
                return vbn;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    vbk(String str, String str2, String str3, boolean z, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    this.e = str4;
                    return;
                }
                throw new NullPointerException("Null color");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
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

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pill{id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", selected=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbr) {
            vbr vbr = (vbr) obj;
            if (this.a.equals(vbr.a()) && this.b.equals(vbr.b()) && this.c.equals(vbr.c()) && this.d == vbr.d()) {
                String str = this.e;
                return str != null ? str.equals(vbr.e()) : vbr.e() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final defpackage.vbr.a f() {
        return new a(this, 0);
    }
}
