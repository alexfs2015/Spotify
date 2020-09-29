package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: uno reason: default package */
final class uno extends uns {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final ImmutableList<Participant> l;

    /* renamed from: uno$a */
    static final class a extends defpackage.uns.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private String j;
        private ImmutableList<Participant> k;

        a() {
        }

        public final defpackage.uns.a a(ImmutableList<Participant> immutableList) {
            if (immutableList != null) {
                this.k = immutableList;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final defpackage.uns.a a(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null joinUri");
        }

        public final defpackage.uns.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final uns a() {
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
                sb2.append(" isActive");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isHost");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isObtainingSession");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isJoiningSession");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isTerminatingSession");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" wasDeletedByHost");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" failedToJoin");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" failedToObtain");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" joinUri");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" participants");
                str = sb11.toString();
            }
            if (str.isEmpty()) {
                uno uno = new uno(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j, this.k, 0);
                return uno;
            }
            StringBuilder sb12 = new StringBuilder("Missing required properties:");
            sb12.append(str);
            throw new IllegalStateException(sb12.toString());
        }

        public final defpackage.uns.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uns.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }
    }

    private uno(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, ImmutableList<Participant> immutableList) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = str;
        this.l = immutableList;
    }

    /* synthetic */ uno(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, ImmutableList immutableList, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, str, immutableList);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uns) {
            uns uns = (uns) obj;
            return this.b == uns.a() && this.c == uns.b() && this.d == uns.c() && this.e == uns.d() && this.f == uns.e() && this.g == uns.f() && this.h == uns.g() && this.i == uns.h() && this.j == uns.i() && this.k.equals(uns.j()) && this.l.equals(uns.k());
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
        int i3 = ((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003;
        if (!this.j) {
            i2 = 1237;
        }
        return ((((i3 ^ i2) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final boolean i() {
        return this.j;
    }

    public final String j() {
        return this.k;
    }

    public final ImmutableList<Participant> k() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialListeningState{isInitialized=");
        sb.append(this.b);
        sb.append(", isActive=");
        sb.append(this.c);
        sb.append(", isHost=");
        sb.append(this.d);
        sb.append(", isObtainingSession=");
        sb.append(this.e);
        sb.append(", isJoiningSession=");
        sb.append(this.f);
        sb.append(", isTerminatingSession=");
        sb.append(this.g);
        sb.append(", wasDeletedByHost=");
        sb.append(this.h);
        sb.append(", failedToJoin=");
        sb.append(this.i);
        sb.append(", failedToObtain=");
        sb.append(this.j);
        sb.append(", joinUri=");
        sb.append(this.k);
        sb.append(", participants=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
}
