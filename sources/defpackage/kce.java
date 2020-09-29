package defpackage;

/* renamed from: kce reason: default package */
final class kce extends kcj {
    private final kaa a;
    private final long b;
    private final Long c;
    private final Long d;
    private final boolean e;
    private final float f;
    private final boolean g;

    /* renamed from: kce$a */
    static final class a extends defpackage.kcj.a {
        private kaa a;
        private Long b;
        private Long c;
        private Long d;
        private Boolean e;
        private Float f;
        private Boolean g;

        a() {
        }

        public final defpackage.kcj.a a(float f2) {
            this.f = Float.valueOf(f2);
            return this;
        }

        public final defpackage.kcj.a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public final defpackage.kcj.a a(Long l) {
            this.c = l;
            return this;
        }

        public final defpackage.kcj.a a(kaa kaa) {
            if (kaa != null) {
                this.a = kaa;
                return this;
            }
            throw new NullPointerException("Null playbackIdentity");
        }

        public final defpackage.kcj.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final kcj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playbackIdentity");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" timestampMs");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isBuffering");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" playbackSpeed");
                str = sb4.toString();
            }
            if (this.g == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isPaused");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                kce kce = new kce(this.a, this.b.longValue(), this.c, this.d, this.e.booleanValue(), this.f.floatValue(), this.g.booleanValue(), 0);
                return kce;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.kcj.a b(Long l) {
            this.d = l;
            return this;
        }

        public final defpackage.kcj.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    private kce(kaa kaa, long j, Long l, Long l2, boolean z, float f2, boolean z2) {
        this.a = kaa;
        this.b = j;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = f2;
        this.g = z2;
    }

    /* synthetic */ kce(kaa kaa, long j, Long l, Long l2, boolean z, float f2, boolean z2, byte b2) {
        this(kaa, j, l, l2, z, f2, z2);
    }

    public final kaa a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcj) {
            kcj kcj = (kcj) obj;
            if (this.a.equals(kcj.a()) && this.b == kcj.b()) {
                Long l = this.c;
                if (l != null ? l.equals(kcj.c()) : kcj.c() == null) {
                    Long l2 = this.d;
                    if (l2 != null ? l2.equals(kcj.d()) : kcj.d() == null) {
                        return this.e == kcj.e() && Float.floatToIntBits(this.f) == Float.floatToIntBits(kcj.f()) && this.g == kcj.g();
                    }
                }
            }
        }
    }

    public final float f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.c;
        int i2 = 0;
        int hashCode2 = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.d;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        int i4 = 1231;
        int floatToIntBits = (((i3 ^ (this.e ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003;
        if (!this.g) {
            i4 = 1237;
        }
        return floatToIntBits ^ i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState{playbackIdentity=");
        sb.append(this.a);
        sb.append(", timestampMs=");
        sb.append(this.b);
        sb.append(", positionAsOfTimestamp=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", isBuffering=");
        sb.append(this.e);
        sb.append(", playbackSpeed=");
        sb.append(this.f);
        sb.append(", isPaused=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
