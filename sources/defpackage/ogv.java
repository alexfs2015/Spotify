package defpackage;

/* renamed from: ogv reason: default package */
final class ogv extends ohg {
    private final boolean a;
    private final boolean b;
    private final ohe c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* renamed from: ogv$a */
    static final class a implements defpackage.ohg.a {
        private Boolean a;
        private Boolean b;
        private ohe c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        /* synthetic */ a(ohg ohg, byte b2) {
            this(ohg);
        }

        a() {
        }

        private a(ohg ohg) {
            this.a = Boolean.valueOf(ohg.a());
            this.b = Boolean.valueOf(ohg.b());
            this.c = ohg.c();
            this.d = Boolean.valueOf(ohg.d());
            this.e = Boolean.valueOf(ohg.e());
            this.f = Boolean.valueOf(ohg.f());
            this.g = Boolean.valueOf(ohg.g());
            this.h = Boolean.valueOf(ohg.h());
        }

        public final defpackage.ohg.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a a(ohe ohe) {
            if (ohe != null) {
                this.c = ohe;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.ohg.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohg.a g(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final ohg a() {
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
                ogv ogv = new ogv(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), 0);
                return ogv;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    /* synthetic */ ogv(boolean z, boolean z2, ohe ohe, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte b2) {
        this(z, z2, ohe, z3, z4, z5, z6, z7);
    }

    private ogv(boolean z, boolean z2, ohe ohe, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = ohe;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final ohe c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohg) {
            ohg ohg = (ohg) obj;
            return this.a == ohg.a() && this.b == ohg.b() && this.c.equals(ohg.c()) && this.d == ohg.d() && this.e == ohg.e() && this.f == ohg.f() && this.g == ohg.g() && this.h == ohg.h();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.ohg.a i() {
        return new a(this, 0);
    }
}
