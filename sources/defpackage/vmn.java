package defpackage;

/* renamed from: vmn reason: default package */
abstract class vmn extends vms {
    final vmt a;
    final boolean b;

    /* renamed from: vmn$a */
    static final class a extends defpackage.vms.a {
        private vmt a;
        private Boolean b;

        /* synthetic */ a(vms vms, byte b2) {
            this(vms);
        }

        a() {
        }

        private a(vms vms) {
            this.a = vms.a();
            this.b = Boolean.valueOf(vms.b());
        }

        public final defpackage.vms.a a(vmt vmt) {
            if (vmt != null) {
                this.a = vmt;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        public final defpackage.vms.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vms a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" passwordState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayHints");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vmo(this.a, this.b.booleanValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    vmn(vmt vmt, boolean z) {
        if (vmt != null) {
            this.a = vmt;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null passwordState");
    }

    public final vmt a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PasswordModel{passwordState=");
        sb.append(this.a);
        sb.append(", displayHints=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vms) {
            vms vms = (vms) obj;
            return this.a.equals(vms.a()) && this.b == vms.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final defpackage.vms.a c() {
        return new a(this, 0);
    }
}
