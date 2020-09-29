package defpackage;

/* renamed from: nhv reason: default package */
final class nhv extends nia {
    private final gzz b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: nhv$a */
    static final class a implements defpackage.nia.a {
        private gzz a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        /* synthetic */ a(nia nia, byte b2) {
            this(nia);
        }

        a() {
        }

        private a(nia nia) {
            this.a = nia.a();
            this.b = Boolean.valueOf(nia.b());
            this.c = Boolean.valueOf(nia.c());
            this.d = Boolean.valueOf(nia.d());
            this.e = Boolean.valueOf(nia.e());
        }

        public final defpackage.nia.a a(gzz gzz) {
            if (gzz != null) {
                this.a = gzz;
                return this;
            }
            throw new NullPointerException("Null hubsViewModel");
        }

        public final defpackage.nia.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.nia.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.nia.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.nia.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final nia a() {
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
                sb2.append(" onlineView");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" cachedView");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" offlineView");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" placeholderView");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                nhv nhv = new nhv(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), 0);
                return nhv;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ nhv(gzz gzz, boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(gzz, z, z2, z3, z4);
    }

    private nhv(gzz gzz, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = gzz;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final gzz a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeViewState{hubsViewModel=");
        sb.append(this.b);
        sb.append(", onlineView=");
        sb.append(this.c);
        sb.append(", cachedView=");
        sb.append(this.d);
        sb.append(", offlineView=");
        sb.append(this.e);
        sb.append(", placeholderView=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nia) {
            nia nia = (nia) obj;
            return this.b.equals(nia.a()) && this.c == nia.b() && this.d == nia.c() && this.e == nia.d() && this.f == nia.e();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.nia.a f() {
        return new a(this, 0);
    }
}
