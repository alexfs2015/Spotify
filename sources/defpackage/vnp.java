package defpackage;

/* renamed from: vnp reason: default package */
abstract class vnp extends vns {
    final String a;
    final boolean b;
    final vns c;

    /* renamed from: vnp$a */
    static final class a implements defpackage.vns.a {
        private String a;
        private Boolean b;
        private vns c;

        /* synthetic */ a(vns vns, byte b2) {
            this(vns);
        }

        a() {
        }

        private a(vns vns) {
            this.a = vns.a();
            this.b = Boolean.valueOf(vns.b());
            this.c = vns.c();
        }

        public final defpackage.vns.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public final defpackage.vns.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vns.a a(vns vns) {
            this.c = vns;
            return this;
        }

        public final vns a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" key");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" reversed");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vnq(this.a, this.b.booleanValue(), this.c);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    vnp(String str, boolean z, vns vns) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = vns;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final vns c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SortOrder{key=");
        sb.append(this.a);
        sb.append(", reversed=");
        sb.append(this.b);
        sb.append(", secondary=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vns) {
            vns vns = (vns) obj;
            if (this.a.equals(vns.a()) && this.b == vns.b()) {
                vns vns2 = this.c;
                return vns2 != null ? vns2.equals(vns.c()) : vns.c() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        vns vns = this.c;
        return hashCode ^ (vns == null ? 0 : vns.hashCode());
    }

    public final defpackage.vns.a d() {
        return new a(this, 0);
    }
}
