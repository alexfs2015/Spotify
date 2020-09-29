package defpackage;

/* renamed from: oir reason: default package */
final class oir extends ojc {
    private final uyz a;
    private final oiu b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;

    /* renamed from: oir$a */
    static final class a implements defpackage.ojc.a {
        private uyz a;
        private oiu b;
        private Integer c;
        private Long d;
        private Long e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Integer j;
        private Integer k;
        private Integer l;

        a() {
        }

        public final defpackage.ojc.a a(uyz uyz) {
            if (uyz != null) {
                this.a = uyz;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        public final defpackage.ojc.a a(oiu oiu) {
            if (oiu != null) {
                this.b = oiu;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public final defpackage.ojc.a a(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.ojc.a a(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        public final defpackage.ojc.a b(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        public final defpackage.ojc.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ojc.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ojc.a c(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ojc.a d(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ojc.a b(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.ojc.a c(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.ojc.a d(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        public final ojc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" filterAndSort");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" numberOfFollowers");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" lastModification");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" duration");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" hasExplicitContent");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" containsOnlyTracks");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" containsOnlyEpisodes");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" containsAudioEpisodes");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" numberOfEpisodes");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" numberOfTracks");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" numberOfItems");
                str = sb12.toString();
            }
            if (str.isEmpty()) {
                oir oir = new oir(this.a, this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), 0);
                return oir;
            }
            StringBuilder sb13 = new StringBuilder("Missing required properties:");
            sb13.append(str);
            throw new IllegalStateException(sb13.toString());
        }
    }

    /* synthetic */ oir(uyz uyz, oiu oiu, int i2, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, byte b2) {
        this(uyz, oiu, i2, j2, j3, z, z2, z3, z4, i3, i4, i5);
    }

    private oir(uyz uyz, oiu oiu, int i2, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5) {
        this.a = uyz;
        this.b = oiu;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i3;
        this.k = i4;
        this.l = i5;
    }

    public final uyz a() {
        return this.a;
    }

    public final oiu b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final int j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistMetadata{playlist=");
        sb.append(this.a);
        sb.append(", filterAndSort=");
        sb.append(this.b);
        sb.append(", numberOfFollowers=");
        sb.append(this.c);
        sb.append(", lastModification=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", hasExplicitContent=");
        sb.append(this.f);
        sb.append(", containsOnlyTracks=");
        sb.append(this.g);
        sb.append(", containsOnlyEpisodes=");
        sb.append(this.h);
        sb.append(", containsAudioEpisodes=");
        sb.append(this.i);
        sb.append(", numberOfEpisodes=");
        sb.append(this.j);
        sb.append(", numberOfTracks=");
        sb.append(this.k);
        sb.append(", numberOfItems=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojc) {
            ojc ojc = (ojc) obj;
            return this.a.equals(ojc.a()) && this.b.equals(ojc.b()) && this.c == ojc.c() && this.d == ojc.d() && this.e == ojc.e() && this.f == ojc.f() && this.g == ojc.g() && this.h == ojc.h() && this.i == ojc.i() && this.j == ojc.j() && this.k == ojc.k() && this.l == ojc.l();
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        int i2 = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.e;
        int i3 = 1231;
        int i4 = (((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003;
        if (!this.i) {
            i3 = 1237;
        }
        return ((((((i4 ^ i3) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l;
    }
}
