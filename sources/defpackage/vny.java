package defpackage;

/* renamed from: vny reason: default package */
abstract class vny extends vof {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final String e;

    /* renamed from: vny$a */
    static final class a implements defpackage.vof.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private String e;

        a() {
        }

        private a(vof vof) {
            this.a = vof.a();
            this.b = vof.b();
            this.c = vof.c();
            this.d = Boolean.valueOf(vof.d());
            this.e = vof.e();
        }

        /* synthetic */ a(vof vof, byte b2) {
            this(vof);
        }

        public final defpackage.vof.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final vof a() {
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
                vob vob = new vob(this.a, this.b, this.c, this.d.booleanValue(), this.e);
                return vob;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    vny(String str, String str2, String str3, boolean z, String str4) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vof) {
            vof vof = (vof) obj;
            if (this.a.equals(vof.a()) && this.b.equals(vof.b()) && this.c.equals(vof.c()) && this.d == vof.d()) {
                String str = this.e;
                return str != null ? str.equals(vof.e()) : vof.e() == null;
            }
        }
    }

    public final defpackage.vof.a f() {
        return new a(this, 0);
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
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
}
