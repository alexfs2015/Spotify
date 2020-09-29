package defpackage;

/* renamed from: vbl reason: default package */
abstract class vbl extends vbs {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;

    /* renamed from: vbl$a */
    static final class a implements defpackage.vbs.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private String e;
        private String f;

        /* synthetic */ a(vbs vbs, byte b2) {
            this(vbs);
        }

        a() {
        }

        private a(vbs vbs) {
            this.a = vbs.a();
            this.b = vbs.b();
            this.c = vbs.c();
            this.d = Boolean.valueOf(vbs.d());
            this.e = vbs.e();
            this.f = vbs.f();
        }

        public final defpackage.vbs.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final vbs a() {
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
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" image");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                vbo vbo = new vbo(this.a, this.b, this.c, this.d.booleanValue(), this.e, this.f);
                return vbo;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    vbl(String str, String str2, String str3, boolean z, String str4, String str5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    this.e = str4;
                    if (str5 != null) {
                        this.f = str5;
                        return;
                    }
                    throw new NullPointerException("Null image");
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

    public final String f() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pillow{id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", selected=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbs) {
            vbs vbs = (vbs) obj;
            if (this.a.equals(vbs.a()) && this.b.equals(vbs.b()) && this.c.equals(vbs.c()) && this.d == vbs.d()) {
                String str = this.e;
                if (str != null ? str.equals(vbs.e()) : vbs.e() == null) {
                    if (this.f.equals(vbs.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        String str = this.e;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode();
    }

    public final defpackage.vbs.a g() {
        return new a(this, 0);
    }
}
