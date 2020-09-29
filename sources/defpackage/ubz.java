package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: ubz reason: default package */
final class ubz extends ucd {
    private final boolean b;
    private final String c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final String l;
    private final ImmutableList<Participant> m;
    private final String n;

    /* renamed from: ubz$a */
    static final class a extends defpackage.ucd.a {
        private Boolean a;
        private String b;
        private Integer c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private String k;
        private ImmutableList<Participant> l;
        private String m;

        /* synthetic */ a(ucd ucd, byte b2) {
            this(ucd);
        }

        a() {
        }

        private a(ucd ucd) {
            this.a = Boolean.valueOf(ucd.a());
            this.b = ucd.b();
            this.c = Integer.valueOf(ucd.c());
            this.d = Boolean.valueOf(ucd.d());
            this.e = Boolean.valueOf(ucd.e());
            this.f = Boolean.valueOf(ucd.f());
            this.g = Boolean.valueOf(ucd.g());
            this.h = Boolean.valueOf(ucd.h());
            this.i = Boolean.valueOf(ucd.i());
            this.j = Boolean.valueOf(ucd.j());
            this.k = ucd.k();
            this.l = ucd.l();
            this.m = ucd.m();
        }

        public final defpackage.ucd.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final defpackage.ucd.a a(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.ucd.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a f(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a h(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ucd.a b(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null joinUri");
        }

        public final defpackage.ucd.a a(ImmutableList<Participant> immutableList) {
            if (immutableList != null) {
                this.l = immutableList;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final defpackage.ucd.a c(String str) {
            if (str != null) {
                this.m = str;
                return this;
            }
            throw new NullPointerException("Null currentUsername");
        }

        public final ucd a() {
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
                sb2.append(" sessionId");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventRevision");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isHost");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isObtainingSession");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" obtainSessionFailed");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" isJoiningSession");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" joinSessionFailed");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" isTerminatingSession");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" sessionDeleted");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" joinUri");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" participants");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" currentUsername");
                str = sb13.toString();
            }
            if (str.isEmpty()) {
                ubz ubz = new ubz(this.a.booleanValue(), this.b, this.c.intValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l, this.m, 0);
                return ubz;
            }
            StringBuilder sb14 = new StringBuilder("Missing required properties:");
            sb14.append(str);
            throw new IllegalStateException(sb14.toString());
        }
    }

    /* synthetic */ ubz(boolean z, String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, ImmutableList immutableList, String str3, byte b2) {
        this(z, str, i2, z2, z3, z4, z5, z6, z7, z8, str2, immutableList, str3);
    }

    private ubz(boolean z, String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, ImmutableList<Participant> immutableList, String str3) {
        this.b = z;
        this.c = str;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = str2;
        this.m = immutableList;
        this.n = str3;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
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

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final String k() {
        return this.l;
    }

    public final ImmutableList<Participant> l() {
        return this.m;
    }

    public final String m() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialListeningHubModel{isInitialized=");
        sb.append(this.b);
        sb.append(", sessionId=");
        sb.append(this.c);
        sb.append(", eventRevision=");
        sb.append(this.d);
        sb.append(", isHost=");
        sb.append(this.e);
        sb.append(", isObtainingSession=");
        sb.append(this.f);
        sb.append(", obtainSessionFailed=");
        sb.append(this.g);
        sb.append(", isJoiningSession=");
        sb.append(this.h);
        sb.append(", joinSessionFailed=");
        sb.append(this.i);
        sb.append(", isTerminatingSession=");
        sb.append(this.j);
        sb.append(", sessionDeleted=");
        sb.append(this.k);
        sb.append(", joinUri=");
        sb.append(this.l);
        sb.append(", participants=");
        sb.append(this.m);
        sb.append(", currentUsername=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucd) {
            ucd ucd = (ucd) obj;
            return this.b == ucd.a() && this.c.equals(ucd.b()) && this.d == ucd.c() && this.e == ucd.d() && this.f == ucd.e() && this.g == ucd.f() && this.h == ucd.g() && this.i == ucd.h() && this.j == ucd.i() && this.k == ucd.j() && this.l.equals(ucd.k()) && this.m.equals(ucd.l()) && this.n.equals(ucd.m());
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003;
        if (!this.k) {
            i2 = 1237;
        }
        return ((((((hashCode ^ i2) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final defpackage.ucd.a n() {
        return new a(this, 0);
    }
}
