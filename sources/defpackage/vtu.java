package defpackage;

/* renamed from: vtu reason: default package */
final class vtu extends vsu {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;

    /* renamed from: vtu$a */
    static final class a extends defpackage.vsu.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        public final defpackage.vsu.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vsu.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final vsu a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" badViewLoadTime");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" goodViewLoadTime");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" logTrimMemorySampleInterval");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" logTrimMemoryThreshold");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" shouldLogTrimMemoryWarnings");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" shouldWakelockingBeEnabled");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                vtu vtu = new vtu(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return vtu;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.vsu.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vsu.a b(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vsu.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vsu.a d(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    private vtu(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
    }

    /* synthetic */ vtu(int i, int i2, int i3, int i4, boolean z, boolean z2, byte b2) {
        this(i, i2, i3, i4, z, z2);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsu) {
            vsu vsu = (vsu) obj;
            return this.a == vsu.a() && this.b == vsu.b() && this.c == vsu.c() && this.d == vsu.d() && this.e == vsu.e() && this.f == vsu.f();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = (((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidPerfTrackingProperties{badViewLoadTime=");
        sb.append(this.a);
        sb.append(", goodViewLoadTime=");
        sb.append(this.b);
        sb.append(", logTrimMemorySampleInterval=");
        sb.append(this.c);
        sb.append(", logTrimMemoryThreshold=");
        sb.append(this.d);
        sb.append(", shouldLogTrimMemoryWarnings=");
        sb.append(this.e);
        sb.append(", shouldWakelockingBeEnabled=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
