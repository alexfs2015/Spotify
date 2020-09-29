package defpackage;

/* renamed from: vyn reason: default package */
abstract class vyn extends vys {
    final vyt a;
    final boolean b;
    final boolean c;

    /* renamed from: vyn$a */
    static final class a extends defpackage.vys.a {
        private vyt a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        private a(vys vys) {
            this.a = vys.a();
            this.b = Boolean.valueOf(vys.b());
            this.c = Boolean.valueOf(vys.c());
        }

        /* synthetic */ a(vys vys, byte b2) {
            this(vys);
        }

        public final defpackage.vys.a a(vyt vyt) {
            if (vyt != null) {
                this.a = vyt;
                return this;
            }
            throw new NullPointerException("Null emailState");
        }

        public final defpackage.vys.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vys a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" emailState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" hasConnection");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" useHints");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new vyo(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.vys.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    vyn(vyt vyt, boolean z, boolean z2) {
        if (vyt != null) {
            this.a = vyt;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null emailState");
    }

    public final vyt a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final defpackage.vys.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vys) {
            vys vys = (vys) obj;
            return this.a.equals(vys.a()) && this.b == vys.b() && this.c == vys.c();
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

    public String toString() {
        StringBuilder sb = new StringBuilder("EmailModel{emailState=");
        sb.append(this.a);
        sb.append(", hasConnection=");
        sb.append(this.b);
        sb.append(", useHints=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
