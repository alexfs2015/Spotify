package defpackage;

/* renamed from: khg reason: default package */
final class khg extends khk {
    private final String b;
    private final boolean c;
    private final long d;
    private final long e;
    private final long f;

    /* renamed from: khg$a */
    static final class a extends defpackage.khk.a {
        String a;
        private Boolean b;
        private Long c;
        private Long d;
        private Long e;

        a() {
        }

        private a(khk khk) {
            this.a = khk.a();
            this.b = Boolean.valueOf(khk.b());
            this.c = Long.valueOf(khk.c());
            this.d = Long.valueOf(khk.d());
            this.e = Long.valueOf(khk.e());
        }

        /* synthetic */ a(khk khk, byte b2) {
            this(khk);
        }

        public final defpackage.khk.a a(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public final defpackage.khk.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.khk.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final khk a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" muted");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playStartTime");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" pauseStartTime");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" accumulatedPauseTime");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                khg khg = new khg(this.a, this.b.booleanValue(), this.c.longValue(), this.d.longValue(), this.e.longValue(), 0);
                return khg;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.khk.a b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final defpackage.khk.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    private khg(String str, boolean z, long j, long j2, long j3) {
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    /* synthetic */ khg(String str, boolean z, long j, long j2, long j3, byte b2) {
        this(str, z, j, j2, j3);
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khk) {
            khk khk = (khk) obj;
            String str = this.b;
            if (str != null ? str.equals(khk.a()) : khk.a() == null) {
                return this.c == khk.b() && this.d == khk.c() && this.e == khk.d() && this.f == khk.e();
            }
        }
    }

    public final defpackage.khk.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        long j = this.d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f;
        return i2 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WrappedPreviewPlayerModel{previewUrl=");
        sb.append(this.b);
        sb.append(", muted=");
        sb.append(this.c);
        sb.append(", playStartTime=");
        sb.append(this.d);
        sb.append(", pauseStartTime=");
        sb.append(this.e);
        sb.append(", accumulatedPauseTime=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
