package defpackage;

/* renamed from: vzt reason: default package */
abstract class vzt extends vzy {
    final vzz a;
    final boolean b;

    /* renamed from: vzt$a */
    static final class a extends defpackage.vzy.a {
        private vzz a;
        private Boolean b;

        a() {
        }

        private a(vzy vzy) {
            this.a = vzy.a();
            this.b = Boolean.valueOf(vzy.b());
        }

        /* synthetic */ a(vzy vzy, byte b2) {
            this(vzy);
        }

        public final defpackage.vzy.a a(vzz vzz) {
            if (vzz != null) {
                this.a = vzz;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        public final defpackage.vzy.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vzy a() {
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
                return new vzu(this.a, this.b.booleanValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    vzt(vzz vzz, boolean z) {
        if (vzz != null) {
            this.a = vzz;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null passwordState");
    }

    public final vzz a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final defpackage.vzy.a c() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzy) {
            vzy vzy = (vzy) obj;
            return this.a.equals(vzy.a()) && this.b == vzy.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PasswordModel{passwordState=");
        sb.append(this.a);
        sb.append(", displayHints=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
