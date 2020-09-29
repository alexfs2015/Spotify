package defpackage;

import java.util.List;

/* renamed from: sez reason: default package */
final class sez extends sfc {
    private final String a;
    private final String b;
    private final String c;
    private final List<String> d;
    private final String e;
    private final long f;
    private final long g;
    private final long h;

    /* renamed from: sez$a */
    static final class a implements defpackage.sfc.a {
        String a;
        private String b;
        private String c;
        private List<String> d;
        private String e;
        private Long f;
        private Long g;
        private Long h;

        a() {
        }

        private a(sfc sfc) {
            this.a = sfc.a();
            this.b = sfc.b();
            this.c = sfc.c();
            this.d = sfc.d();
            this.e = sfc.e();
            this.f = Long.valueOf(sfc.f());
            this.g = Long.valueOf(sfc.g());
            this.h = Long.valueOf(sfc.h());
        }

        /* synthetic */ a(sfc sfc, byte b2) {
            this(sfc);
        }

        public final defpackage.sfc.a a(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public final defpackage.sfc.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null reasonType");
        }

        public final defpackage.sfc.a a(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null shownApps");
        }

        public final sfc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" bannerSessionId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" reasonType");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" sessionType");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" shownApps");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" connectedApp");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" bannerSessionStartMillis");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" bannerSessionResumedMillis");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" bannerSessionLength");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                sez sez = new sez(this.a, this.b, this.c, this.d, this.e, this.f.longValue(), this.g.longValue(), this.h.longValue(), 0);
                return sez;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }

        public final defpackage.sfc.a b(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        public final defpackage.sfc.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null sessionType");
        }

        public final defpackage.sfc.a c(long j) {
            this.h = Long.valueOf(j);
            return this;
        }

        public final defpackage.sfc.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null connectedApp");
        }
    }

    private sez(String str, String str2, String str3, List<String> list, String str4, long j, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = j3;
    }

    /* synthetic */ sez(String str, String str2, String str3, List list, String str4, long j, long j2, long j3, byte b2) {
        this(str, str2, str3, list, str4, j, j2, j3);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final List<String> d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sfc) {
            sfc sfc = (sfc) obj;
            return this.a.equals(sfc.a()) && this.b.equals(sfc.b()) && this.c.equals(sfc.c()) && this.d.equals(sfc.d()) && this.e.equals(sfc.e()) && this.f == sfc.f() && this.g == sfc.g() && this.h == sfc.h();
        }
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.h;
        return i2 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final defpackage.sfc.a i() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerBannerSession{bannerSessionId=");
        sb.append(this.a);
        sb.append(", reasonType=");
        sb.append(this.b);
        sb.append(", sessionType=");
        sb.append(this.c);
        sb.append(", shownApps=");
        sb.append(this.d);
        sb.append(", connectedApp=");
        sb.append(this.e);
        sb.append(", bannerSessionStartMillis=");
        sb.append(this.f);
        sb.append(", bannerSessionResumedMillis=");
        sb.append(this.g);
        sb.append(", bannerSessionLength=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
