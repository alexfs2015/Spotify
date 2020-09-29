package defpackage;

/* renamed from: slp reason: default package */
final class slp extends slr {
    private final boolean b;
    private final boolean c;
    private final String d;

    /* renamed from: slp$a */
    static final class a extends defpackage.slr.a {
        private Boolean a;
        private Boolean b;
        private String c;

        a() {
        }

        public final defpackage.slr.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final defpackage.slr.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final slr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" autocompleteEnabled");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" onDemandEnabled");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" sessionId");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new slp(this.a.booleanValue(), this.b.booleanValue(), this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.slr.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    private slp(boolean z, boolean z2, String str) {
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    /* synthetic */ slp(boolean z, boolean z2, String str, byte b2) {
        this(z, z2, str);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slr) {
            slr slr = (slr) obj;
            return this.b == slr.a() && this.c == slr.b() && this.d.equals(slr.c());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.b ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchConfig{autocompleteEnabled=");
        sb.append(this.b);
        sb.append(", onDemandEnabled=");
        sb.append(this.c);
        sb.append(", sessionId=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
