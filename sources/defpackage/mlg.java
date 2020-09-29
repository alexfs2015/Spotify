package defpackage;

/* renamed from: mlg reason: default package */
final class mlg extends mlh {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    /* renamed from: mlg$a */
    public static final class a implements defpackage.mlh.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(mlh mlh, byte b2) {
            this(mlh);
        }

        public a() {
        }

        private a(mlh mlh) {
            this.a = Boolean.valueOf(mlh.a());
            this.b = Boolean.valueOf(mlh.b());
            this.c = Boolean.valueOf(mlh.c());
        }

        public final defpackage.mlh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mlh.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mlh.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final mlh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" update");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" enabled");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" userSet");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new mlg(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ mlg(boolean z, boolean z2, boolean z3, byte b2) {
        this(z, z2, z3);
    }

    private mlg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSaverModeConfiguration{update=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", userSet=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlh) {
            mlh mlh = (mlh) obj;
            return this.a == mlh.a() && this.b == mlh.b() && this.c == mlh.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final defpackage.mlh.a d() {
        return new a(this, 0);
    }
}
