package defpackage;

/* renamed from: vkx reason: default package */
abstract class vkx extends vlf {
    final vlb a;
    final boolean b;
    final int c;
    private final vlm e;
    private final vms f;
    private final vkj g;
    private final vma h;
    private final vmi i;

    /* renamed from: vkx$a */
    static final class a implements defpackage.vlf.a {
        private vlb a;
        private vlm b;
        private vms c;
        private vkj d;
        private vma e;
        private vmi f;
        private Boolean g;
        private Integer h;

        /* synthetic */ a(vlf vlf, byte b2) {
            this(vlf);
        }

        a() {
        }

        private a(vlf vlf) {
            this.a = vlf.a();
            this.b = vlf.b();
            this.c = vlf.c();
            this.d = vlf.d();
            this.e = vlf.e();
            this.f = vlf.f();
            this.g = Boolean.valueOf(vlf.g());
            this.h = Integer.valueOf(vlf.h());
        }

        public final defpackage.vlf.a a(vlb vlb) {
            if (vlb != null) {
                this.a = vlb;
                return this;
            }
            throw new NullPointerException("Null signupConfigurationState");
        }

        public final defpackage.vlf.a a(vlm vlm) {
            if (vlm != null) {
                this.b = vlm;
                return this;
            }
            throw new NullPointerException("Null emailModel");
        }

        public final defpackage.vlf.a a(vms vms) {
            if (vms != null) {
                this.c = vms;
                return this;
            }
            throw new NullPointerException("Null passwordModel");
        }

        public final defpackage.vlf.a a(vkj vkj) {
            if (vkj != null) {
                this.d = vkj;
                return this;
            }
            throw new NullPointerException("Null ageModel");
        }

        public final defpackage.vlf.a a(vma vma) {
            if (vma != null) {
                this.e = vma;
                return this;
            }
            throw new NullPointerException("Null genderModel");
        }

        public final defpackage.vlf.a a(vmi vmi) {
            if (vmi != null) {
                this.f = vmi;
                return this;
            }
            throw new NullPointerException("Null nameModel");
        }

        public final defpackage.vlf.a a(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vlf.a a(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public final vlf a() {
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
                vkz vkz = new vkz(this.a, this.b, this.c, this.d, this.e, this.f, this.g.booleanValue(), this.h.intValue());
                return vkz;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    vkx(vlb vlb, vlm vlm, vms vms, vkj vkj, vma vma, vmi vmi, boolean z, int i2) {
        if (vlb != null) {
            this.a = vlb;
            if (vlm != null) {
                this.e = vlm;
                if (vms != null) {
                    this.f = vms;
                    if (vkj != null) {
                        this.g = vkj;
                        if (vma != null) {
                            this.h = vma;
                            if (vmi != null) {
                                this.i = vmi;
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

    public final vlb a() {
        return this.a;
    }

    public vlm b() {
        return this.e;
    }

    public vms c() {
        return this.f;
    }

    public vkj d() {
        return this.g;
    }

    public vma e() {
        return this.h;
    }

    public vmi f() {
        return this.i;
    }

    public final boolean g() {
        return this.b;
    }

    public final int h() {
        return this.c;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlf) {
            vlf vlf = (vlf) obj;
            return this.a.equals(vlf.a()) && this.e.equals(vlf.b()) && this.f.equals(vlf.c()) && this.g.equals(vlf.d()) && this.h.equals(vlf.e()) && this.i.equals(vlf.f()) && this.b == vlf.g() && this.c == vlf.h();
        }
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c;
    }

    public final defpackage.vlf.a i() {
        return new a(this, 0);
    }
}
