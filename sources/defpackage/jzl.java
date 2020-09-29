package defpackage;

/* renamed from: jzl reason: default package */
final class jzl extends kad {
    private final String a;
    private final boolean b;

    /* renamed from: jzl$a */
    static final class a extends defpackage.kad.a {
        private String a;
        private Boolean b;

        a() {
        }

        private a(kad kad) {
            this.a = kad.a();
            this.b = Boolean.valueOf(kad.b());
        }

        /* synthetic */ a(kad kad, byte b2) {
            this(kad);
        }

        public final defpackage.kad.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kad.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final kad a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" preventDisplaySleepDuringVideoPlayback");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new jzl(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private jzl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    /* synthetic */ jzl(String str, boolean z, byte b2) {
        this(str, z);
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final defpackage.kad.a c() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kad) {
            kad kad = (kad) obj;
            String str = this.a;
            if (str != null ? str.equals(kad.a()) : kad.a() == null) {
                if (this.b == kad.b()) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerConfiguration{widevineLicenseUrl=");
        sb.append(this.a);
        sb.append(", preventDisplaySleepDuringVideoPlayback=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
