package defpackage;

/* renamed from: onz reason: default package */
final class onz extends ook {
    private final boolean a;
    private final boolean b;
    private final ooi c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* renamed from: onz$a */
    static final class a implements defpackage.ook.a {
        private Boolean a;
        private Boolean b;
        private ooi c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        a() {
        }

        private a(ook ook) {
            this.a = Boolean.valueOf(ook.a());
            this.b = Boolean.valueOf(ook.b());
            this.c = ook.c();
            this.d = Boolean.valueOf(ook.d());
            this.e = Boolean.valueOf(ook.e());
            this.f = Boolean.valueOf(ook.f());
            this.g = Boolean.valueOf(ook.g());
            this.h = Boolean.valueOf(ook.h());
        }

        /* synthetic */ a(ook ook, byte b2) {
            this(ook);
        }

        public final defpackage.ook.a a(ooi ooi) {
            if (ooi != null) {
                this.c = ooi;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.ook.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ook a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showFollowButton");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" showPlayButton");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playButtonBehavior");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showShuffleLabel");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" showMadeForXAttribution");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showSecondPage");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" useLikesInsteadOfFollowers");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" enableFastScroll");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                onz onz = new onz(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), 0);
                return onz;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }

        public final defpackage.ook.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ook.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ook.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ook.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ook.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ook.a g(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }
    }

    private onz(boolean z, boolean z2, ooi ooi, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = ooi;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    /* synthetic */ onz(boolean z, boolean z2, ooi ooi, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte b2) {
        this(z, z2, ooi, z3, z4, z5, z6, z7);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final ooi c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ook) {
            ook ook = (ook) obj;
            return this.a == ook.a() && this.b == ook.b() && this.c.equals(ook.c()) && this.d == ook.d() && this.e == ook.e() && this.f == ook.f() && this.g == ook.g() && this.h == ook.h();
        }
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

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.ook.a i() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistHeaderConfiguration{showFollowButton=");
        sb.append(this.a);
        sb.append(", showPlayButton=");
        sb.append(this.b);
        sb.append(", playButtonBehavior=");
        sb.append(this.c);
        sb.append(", showShuffleLabel=");
        sb.append(this.d);
        sb.append(", showMadeForXAttribution=");
        sb.append(this.e);
        sb.append(", showSecondPage=");
        sb.append(this.f);
        sb.append(", useLikesInsteadOfFollowers=");
        sb.append(this.g);
        sb.append(", enableFastScroll=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
