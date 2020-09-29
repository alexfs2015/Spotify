package defpackage;

/* renamed from: mpz reason: default package */
final class mpz extends mqa {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    /* renamed from: mpz$a */
    public static final class a implements defpackage.mqa.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        public a() {
        }

        private a(mqa mqa) {
            this.a = Boolean.valueOf(mqa.a());
            this.b = Boolean.valueOf(mqa.b());
            this.c = Boolean.valueOf(mqa.c());
        }

        /* synthetic */ a(mqa mqa, byte b2) {
            this(mqa);
        }

        public final defpackage.mqa.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final mqa a() {
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
                return new mpz(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.mqa.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.mqa.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    private mpz(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* synthetic */ mpz(boolean z, boolean z2, boolean z3, byte b2) {
        this(z, z2, z3);
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

    public final defpackage.mqa.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mqa) {
            mqa mqa = (mqa) obj;
            return this.a == mqa.a() && this.b == mqa.b() && this.c == mqa.c();
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
}
