package defpackage;

/* renamed from: vmd reason: default package */
abstract class vmd extends vmi {
    final vmj a;
    final boolean b;
    final boolean c;

    /* renamed from: vmd$a */
    static final class a implements defpackage.vmi.a {
        private vmj a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(vmi vmi, byte b2) {
            this(vmi);
        }

        a() {
        }

        private a(vmi vmi) {
            this.a = vmi.a();
            this.b = Boolean.valueOf(vmi.b());
            this.c = Boolean.valueOf(vmi.c());
        }

        public final defpackage.vmi.a a(vmj vmj) {
            if (vmj != null) {
                this.a = vmj;
                return this;
            }
            throw new NullPointerException("Null nameState");
        }

        public final defpackage.vmi.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vmi.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final vmi a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" nameState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isLoading");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" requiresMarketingOptInText");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new vme(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    vmd(vmj vmj, boolean z, boolean z2) {
        if (vmj != null) {
            this.a = vmj;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null nameState");
    }

    public final vmj a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NameModel{nameState=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", requiresMarketingOptInText=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmi) {
            vmi vmi = (vmi) obj;
            return this.a.equals(vmi.a()) && this.b == vmi.b() && this.c == vmi.c();
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.vmi.a d() {
        return new a(this, 0);
    }
}
