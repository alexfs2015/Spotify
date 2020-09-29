package defpackage;

/* renamed from: vyd reason: default package */
abstract class vyd extends vyl {
    final vyh a;
    final boolean b;
    final int c;
    private final vys e;
    private final vzy f;
    private final vxp g;
    private final vzg h;
    private final vzo i;

    /* renamed from: vyd$a */
    static final class a implements defpackage.vyl.a {
        private vyh a;
        private vys b;
        private vzy c;
        private vxp d;
        private vzg e;
        private vzo f;
        private Boolean g;
        private Integer h;

        a() {
        }

        private a(vyl vyl) {
            this.a = vyl.a();
            this.b = vyl.b();
            this.c = vyl.c();
            this.d = vyl.d();
            this.e = vyl.e();
            this.f = vyl.f();
            this.g = Boolean.valueOf(vyl.g());
            this.h = Integer.valueOf(vyl.h());
        }

        /* synthetic */ a(vyl vyl, byte b2) {
            this(vyl);
        }

        public final defpackage.vyl.a a(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vyl.a a(vxp vxp) {
            if (vxp != null) {
                this.d = vxp;
                return this;
            }
            throw new NullPointerException("Null ageModel");
        }

        public final defpackage.vyl.a a(vyh vyh) {
            if (vyh != null) {
                this.a = vyh;
                return this;
            }
            throw new NullPointerException("Null signupConfigurationState");
        }

        public final defpackage.vyl.a a(vys vys) {
            if (vys != null) {
                this.b = vys;
                return this;
            }
            throw new NullPointerException("Null emailModel");
        }

        public final defpackage.vyl.a a(vzg vzg) {
            if (vzg != null) {
                this.e = vzg;
                return this;
            }
            throw new NullPointerException("Null genderModel");
        }

        public final defpackage.vyl.a a(vzo vzo) {
            if (vzo != null) {
                this.f = vzo;
                return this;
            }
            throw new NullPointerException("Null nameModel");
        }

        public final defpackage.vyl.a a(vzy vzy) {
            if (vzy != null) {
                this.c = vzy;
                return this;
            }
            throw new NullPointerException("Null passwordModel");
        }

        public final defpackage.vyl.a a(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final vyl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" signupConfigurationState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" emailModel");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" passwordModel");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" ageModel");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" genderModel");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" nameModel");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" hasConnection");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" page");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                vyf vyf = new vyf(this.a, this.b, this.c, this.d, this.e, this.f, this.g.booleanValue(), this.h.intValue());
                return vyf;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    vyd(vyh vyh, vys vys, vzy vzy, vxp vxp, vzg vzg, vzo vzo, boolean z, int i2) {
        if (vyh != null) {
            this.a = vyh;
            if (vys != null) {
                this.e = vys;
                if (vzy != null) {
                    this.f = vzy;
                    if (vxp != null) {
                        this.g = vxp;
                        if (vzg != null) {
                            this.h = vzg;
                            if (vzo != null) {
                                this.i = vzo;
                                this.b = z;
                                this.c = i2;
                                return;
                            }
                            throw new NullPointerException("Null nameModel");
                        }
                        throw new NullPointerException("Null genderModel");
                    }
                    throw new NullPointerException("Null ageModel");
                }
                throw new NullPointerException("Null passwordModel");
            }
            throw new NullPointerException("Null emailModel");
        }
        throw new NullPointerException("Null signupConfigurationState");
    }

    public final vyh a() {
        return this.a;
    }

    public vys b() {
        return this.e;
    }

    public vzy c() {
        return this.f;
    }

    public vxp d() {
        return this.g;
    }

    public vzg e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyl) {
            vyl vyl = (vyl) obj;
            return this.a.equals(vyl.a()) && this.e.equals(vyl.b()) && this.f.equals(vyl.c()) && this.g.equals(vyl.d()) && this.h.equals(vyl.e()) && this.i.equals(vyl.f()) && this.b == vyl.g() && this.c == vyl.h();
        }
    }

    public vzo f() {
        return this.i;
    }

    public final boolean g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c;
    }

    public final defpackage.vyl.a i() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignupModel{signupConfigurationState=");
        sb.append(this.a);
        sb.append(", emailModel=");
        sb.append(this.e);
        sb.append(", passwordModel=");
        sb.append(this.f);
        sb.append(", ageModel=");
        sb.append(this.g);
        sb.append(", genderModel=");
        sb.append(this.h);
        sb.append(", nameModel=");
        sb.append(this.i);
        sb.append(", hasConnection=");
        sb.append(this.b);
        sb.append(", page=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
