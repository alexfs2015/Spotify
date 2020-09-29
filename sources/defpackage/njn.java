package defpackage;

/* renamed from: njn reason: default package */
final class njn extends njo {
    private final gzz a;
    private final boolean b;
    private final boolean c;

    /* renamed from: njn$a */
    public static final class a implements defpackage.njo.a {
        private gzz a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(njo njo, byte b2) {
            this(njo);
        }

        public a() {
        }

        private a(njo njo) {
            this.a = njo.a();
            this.b = Boolean.valueOf(njo.b());
            this.c = Boolean.valueOf(njo.c());
        }

        public final defpackage.njo.a a(gzz gzz) {
            if (gzz != null) {
                this.a = gzz;
                return this;
            }
            throw new NullPointerException("Null hubsViewModel");
        }

        public final defpackage.njo.a a(boolean z) {
            this.b = Boolean.FALSE;
            return this;
        }

        public final defpackage.njo.a b(boolean z) {
            this.c = Boolean.FALSE;
            return this;
        }

        public final njo a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" hubsViewModel");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" scrollToTop");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showUpdateButton");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new njn(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ njn(gzz gzz, boolean z, boolean z2, byte b2) {
        this(gzz, z, z2);
    }

    private njn(gzz gzz, boolean z, boolean z2) {
        this.a = gzz;
        this.b = z;
        this.c = z2;
    }

    public final gzz a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HubsViewModelState{hubsViewModel=");
        sb.append(this.a);
        sb.append(", scrollToTop=");
        sb.append(this.b);
        sb.append(", showUpdateButton=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof njo) {
            njo njo = (njo) obj;
            return this.a.equals(njo.a()) && this.b == njo.b() && this.c == njo.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.njo.a d() {
        return new a(this, 0);
    }
}
