package defpackage;

/* renamed from: nnr reason: default package */
final class nnr extends nnw {
    private final hcs b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: nnr$a */
    static final class a implements defpackage.nnw.a {
        private hcs a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        a() {
        }

        private a(nnw nnw) {
            this.a = nnw.a();
            this.b = Boolean.valueOf(nnw.b());
            this.c = Boolean.valueOf(nnw.c());
            this.d = Boolean.valueOf(nnw.d());
            this.e = Boolean.valueOf(nnw.e());
        }

        /* synthetic */ a(nnw nnw, byte b2) {
            this(nnw);
        }

        public final defpackage.nnw.a a(hcs hcs) {
            if (hcs != null) {
                this.a = hcs;
                return this;
            }
            throw new NullPointerException("Null hubsViewModel");
        }

        public final defpackage.nnw.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final nnw a() {
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
                nnr nnr = new nnr(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), 0);
                return nnr;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.nnw.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.nnw.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.nnw.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    private nnr(hcs hcs, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = hcs;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    /* synthetic */ nnr(hcs hcs, boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(hcs, z, z2, z3, z4);
    }

    public final hcs a() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nnw) {
            nnw nnw = (nnw) obj;
            return this.b.equals(nnw.a()) && this.c == nnw.b() && this.d == nnw.c() && this.e == nnw.d() && this.f == nnw.e();
        }
    }

    public final defpackage.nnw.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
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
}
