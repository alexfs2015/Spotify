package defpackage;

/* renamed from: ogw reason: default package */
final class ogw extends ohh {
    private final boolean a;
    private final boolean b;
    private final ohe c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    /* renamed from: ogw$a */
    static final class a implements defpackage.ohh.a {
        private Boolean a;
        private Boolean b;
        private ohe c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        /* synthetic */ a(ohh ohh, byte b2) {
            this(ohh);
        }

        a() {
        }

        private a(ohh ohh) {
            this.a = Boolean.valueOf(ohh.a());
            this.b = Boolean.valueOf(ohh.b());
            this.c = ohh.c();
            this.d = Boolean.valueOf(ohh.d());
            this.e = Boolean.valueOf(ohh.e());
            this.f = Boolean.valueOf(ohh.f());
            this.g = Boolean.valueOf(ohh.g());
        }

        public final defpackage.ohh.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohh.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohh.a a(ohe ohe) {
            if (ohe != null) {
                this.c = ohe;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.ohh.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohh.a d(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final defpackage.ohh.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohh.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final ohh a() {
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
                sb5.append(" openNpvWhenStartingPlaybackViaPlayButton");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" useLikesInsteadOfFollowers");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" enableFastScroll");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                ogw ogw = new ogw(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), 0);
                return ogw;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    /* synthetic */ ogw(boolean z, boolean z2, ohe ohe, boolean z3, boolean z4, boolean z5, boolean z6, byte b2) {
        this(z, z2, ohe, z3, z4, z5, z6);
    }

    private ogw(boolean z, boolean z2, ohe ohe, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = ohe;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefreshHeaderConfiguration{showFollowButton=");
        sb.append(this.a);
        sb.append(", showPlayButton=");
        sb.append(this.b);
        sb.append(", playButtonBehavior=");
        sb.append(this.c);
        sb.append(", showShuffleLabel=");
        sb.append(this.d);
        sb.append(", openNpvWhenStartingPlaybackViaPlayButton=");
        sb.append(this.e);
        sb.append(", useLikesInsteadOfFollowers=");
        sb.append(this.f);
        sb.append(", enableFastScroll=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohh) {
            ohh ohh = (ohh) obj;
            return this.a == ohh.a() && this.b == ohh.b() && this.c.equals(ohh.c()) && this.d == ohh.d() && this.e == ohh.e() && this.f == ohh.f() && this.g == ohh.g();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.ohh.a h() {
        return new a(this, 0);
    }
}
