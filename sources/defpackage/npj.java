package defpackage;

/* renamed from: npj reason: default package */
final class npj extends npk {
    private final hcs a;
    private final boolean b;
    private final boolean c;

    /* renamed from: npj$a */
    public static final class a implements defpackage.npk.a {
        private hcs a;
        private Boolean b;
        private Boolean c;

        public a() {
        }

        private a(npk npk) {
            this.a = npk.a();
            this.b = Boolean.valueOf(npk.b());
            this.c = Boolean.valueOf(npk.c());
        }

        /* synthetic */ a(npk npk, byte b2) {
            this(npk);
        }

        public final defpackage.npk.a a(hcs hcs) {
            if (hcs != null) {
                this.a = hcs;
                return this;
            }
            throw new NullPointerException("Null hubsViewModel");
        }

        public final defpackage.npk.a a(boolean z) {
            this.b = Boolean.FALSE;
            return this;
        }

        public final npk a() {
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
                return new npj(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.npk.a b(boolean z) {
            this.c = Boolean.FALSE;
            return this;
        }
    }

    private npj(hcs hcs, boolean z, boolean z2) {
        this.a = hcs;
        this.b = z;
        this.c = z2;
    }

    /* synthetic */ npj(hcs hcs, boolean z, boolean z2, byte b2) {
        this(hcs, z, z2);
    }

    public final hcs a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final defpackage.npk.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof npk) {
            npk npk = (npk) obj;
            return this.a.equals(npk.a()) && this.b == npk.b() && this.c == npk.c();
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
}
