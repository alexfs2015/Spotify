package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: uou reason: default package */
final class uou extends uoy {
    private final boolean b;
    private final long c;
    private final String d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final ImmutableList<Participant> n;
    private final String o;

    /* renamed from: uou$a */
    static final class a extends defpackage.uoy.a {
        private Boolean a;
        private Long b;
        private String c;
        private Integer d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private String l;
        private ImmutableList<Participant> m;
        private String n;

        a() {
        }

        private a(uoy uoy) {
            this.a = Boolean.valueOf(uoy.a());
            this.b = Long.valueOf(uoy.b());
            this.c = uoy.c();
            this.d = Integer.valueOf(uoy.d());
            this.e = Boolean.valueOf(uoy.e());
            this.f = Boolean.valueOf(uoy.f());
            this.g = Boolean.valueOf(uoy.g());
            this.h = Boolean.valueOf(uoy.h());
            this.i = Boolean.valueOf(uoy.i());
            this.j = Boolean.valueOf(uoy.j());
            this.k = Boolean.valueOf(uoy.k());
            this.l = uoy.l();
            this.m = uoy.m();
            this.n = uoy.n();
        }

        /* synthetic */ a(uoy uoy, byte b2) {
            this(uoy);
        }

        public final defpackage.uoy.a a(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.uoy.a a(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        public final defpackage.uoy.a a(ImmutableList<Participant> immutableList) {
            if (immutableList != null) {
                this.m = immutableList;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final defpackage.uoy.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final defpackage.uoy.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final uoy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isInitialized");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" timestamp");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" sessionId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" eventRevision");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isHost");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isObtainingSession");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" obtainSessionFailed");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" isJoiningSession");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" joinSessionFailed");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" isTerminatingSession");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" sessionDeleted");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" joinUri");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" participants");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" currentUsername");
                str = sb14.toString();
            }
            if (str.isEmpty()) {
                uou uou = new uou(this.a.booleanValue(), this.b.longValue(), this.c, this.d.intValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l, this.m, this.n, 0);
                return uou;
            }
            StringBuilder sb15 = new StringBuilder("Missing required properties:");
            sb15.append(str);
            throw new IllegalStateException(sb15.toString());
        }

        public final defpackage.uoy.a b(String str) {
            if (str != null) {
                this.l = str;
                return this;
            }
            throw new NullPointerException("Null joinUri");
        }

        public final defpackage.uoy.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a c(String str) {
            if (str != null) {
                this.n = str;
                return this;
            }
            throw new NullPointerException("Null currentUsername");
        }

        public final defpackage.uoy.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a d(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a f(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a g(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uoy.a h(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }
    }

    private uou(boolean z, long j2, String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, ImmutableList<Participant> immutableList, String str3) {
        this.b = z;
        this.c = j2;
        this.d = str;
        this.e = i2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str2;
        this.n = immutableList;
        this.o = str3;
    }

    /* synthetic */ uou(boolean z, long j2, String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, ImmutableList immutableList, String str3, byte b2) {
        this(z, j2, str, i2, z2, z3, z4, z5, z6, z7, z8, str2, immutableList, str3);
    }

    public final boolean a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoy) {
            uoy uoy = (uoy) obj;
            return this.b == uoy.a() && this.c == uoy.b() && this.d.equals(uoy.c()) && this.e == uoy.d() && this.f == uoy.e() && this.g == uoy.f() && this.h == uoy.g() && this.i == uoy.h() && this.j == uoy.i() && this.k == uoy.j() && this.l == uoy.k() && this.m.equals(uoy.l()) && this.n.equals(uoy.m()) && this.o.equals(uoy.n());
        }
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i2 = 1231;
        int i3 = ((this.b ? 1231 : 1237) ^ 1000003) * 1000003;
        long j2 = this.c;
        int hashCode = (((((((((((((((((i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return ((((((hashCode ^ i2) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final boolean k() {
        return this.l;
    }

    public final String l() {
        return this.m;
    }

    public final ImmutableList<Participant> m() {
        return this.n;
    }

    public final String n() {
        return this.o;
    }

    public final defpackage.uoy.a o() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialListeningHubModel{isInitialized=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", sessionId=");
        sb.append(this.d);
        sb.append(", eventRevision=");
        sb.append(this.e);
        sb.append(", isHost=");
        sb.append(this.f);
        sb.append(", isObtainingSession=");
        sb.append(this.g);
        sb.append(", obtainSessionFailed=");
        sb.append(this.h);
        sb.append(", isJoiningSession=");
        sb.append(this.i);
        sb.append(", joinSessionFailed=");
        sb.append(this.j);
        sb.append(", isTerminatingSession=");
        sb.append(this.k);
        sb.append(", sessionDeleted=");
        sb.append(this.l);
        sb.append(", joinUri=");
        sb.append(this.m);
        sb.append(", participants=");
        sb.append(this.n);
        sb.append(", currentUsername=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }
}
