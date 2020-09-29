package defpackage;

/* renamed from: mec reason: default package */
final class mec extends defpackage.med.a {
    private final iot a;
    private final boolean b;

    /* renamed from: mec$a */
    static final class a implements C0055a {
        private iot a;
        private Boolean b;

        a() {
        }

        public final C0055a a(iot iot) {
            if (iot != null) {
                this.a = iot;
                return this;
            }
            throw new NullPointerException("Null artistEntity");
        }

        public final C0055a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.med.a a() {
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
                return new mec(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ mec(iot iot, boolean z, byte b2) {
        this(iot, z);
    }

    private mec(iot iot, boolean z) {
        this.a = iot;
        this.b = z;
    }

    public final iot a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{artistEntity=");
        sb.append(this.a);
        sb.append(", isOnline=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.med.a) {
            defpackage.med.a aVar = (defpackage.med.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
