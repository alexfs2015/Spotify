package defpackage;

/* renamed from: mif reason: default package */
final class mif extends defpackage.mig.a {
    private final irg a;
    private final boolean b;

    /* renamed from: mif$a */
    static final class a implements C0056a {
        private irg a;
        private Boolean b;

        a() {
        }

        public final C0056a a(irg irg) {
            if (irg != null) {
                this.a = irg;
                return this;
            }
            throw new NullPointerException("Null artistEntity");
        }

        public final C0056a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mig.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artistEntity");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isOnline");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new mif(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private mif(irg irg, boolean z) {
        this.a = irg;
        this.b = z;
    }

    /* synthetic */ mif(irg irg, boolean z, byte b2) {
        this(irg, z);
    }

    public final irg a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mig.a) {
            defpackage.mig.a aVar = (defpackage.mig.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{artistEntity=");
        sb.append(this.a);
        sb.append(", isOnline=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
