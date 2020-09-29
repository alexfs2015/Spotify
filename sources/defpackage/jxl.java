package defpackage;

/* renamed from: jxl reason: default package */
final class jxl extends jyd {
    private final String a;
    private final boolean b;

    /* renamed from: jxl$a */
    static final class a extends defpackage.jyd.a {
        private String a;
        private Boolean b;

        /* synthetic */ a(jyd jyd, byte b2) {
            this(jyd);
        }

        a() {
        }

        private a(jyd jyd) {
            this.a = jyd.a();
            this.b = Boolean.valueOf(jyd.b());
        }

        public final defpackage.jyd.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.jyd.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final jyd a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" preventDisplaySleepDuringVideoPlayback");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new jxl(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ jxl(String str, boolean z, byte b2) {
        this(str, z);
    }

    private jxl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerConfiguration{widevineLicenseUrl=");
        sb.append(this.a);
        sb.append(", preventDisplaySleepDuringVideoPlayback=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jyd) {
            jyd jyd = (jyd) obj;
            String str = this.a;
            if (str != null ? str.equals(jyd.a()) : jyd.a() == null) {
                if (this.b == jyd.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final defpackage.jyd.a c() {
        return new a(this, 0);
    }
}
