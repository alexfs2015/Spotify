package defpackage;

/* renamed from: owm reason: default package */
final class owm extends defpackage.owo.a {
    private final hdb a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    /* renamed from: owm$a */
    static final class a implements C0072a {
        private hdb a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        a() {
        }

        private a(defpackage.owo.a aVar) {
            this.a = aVar.a();
            this.b = Boolean.valueOf(aVar.b());
            this.c = Boolean.valueOf(aVar.c());
            this.d = Boolean.valueOf(aVar.d());
        }

        /* synthetic */ a(defpackage.owo.a aVar, byte b2) {
            this(aVar);
        }

        public final C0072a a(hdb hdb) {
            if (hdb != null) {
                this.a = hdb;
                return this;
            }
            throw new NullPointerException("Null moreLikeThisData");
        }

        public final C0072a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.owo.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" moreLikeThisData");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" shouldLoadData");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isLoadingData");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" filterActive");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                owm owm = new owm(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), 0);
                return owm;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final C0072a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final C0072a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private owm(hdb hdb, boolean z, boolean z2, boolean z3) {
        this.a = hdb;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* synthetic */ owm(hdb hdb, boolean z, boolean z2, boolean z3, byte b2) {
        this(hdb, z, z2, z3);
    }

    public final hdb a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final C0072a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.owo.a) {
            defpackage.owo.a aVar = (defpackage.owo.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b() && this.c == aVar.c() && this.d == aVar.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{moreLikeThisData=");
        sb.append(this.a);
        sb.append(", shouldLoadData=");
        sb.append(this.b);
        sb.append(", isLoadingData=");
        sb.append(this.c);
        sb.append(", filterActive=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
