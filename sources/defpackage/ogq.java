package defpackage;

/* renamed from: ogq reason: default package */
final class ogq extends ohc {
    private final boolean a;
    private final ohe b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: ogq$a */
    static final class a implements defpackage.ohc.a {
        private Boolean a;
        private ohe b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        /* synthetic */ a(ohc ohc, byte b2) {
            this(ohc);
        }

        a() {
        }

        private a(ohc ohc) {
            this.a = Boolean.valueOf(ohc.a());
            this.b = ohc.b();
            this.c = Boolean.valueOf(ohc.c());
            this.d = Boolean.valueOf(ohc.d());
            this.e = Boolean.valueOf(ohc.e());
            this.f = Boolean.valueOf(ohc.f());
        }

        public final defpackage.ohc.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohc.a a(ohe ohe) {
            if (ohe != null) {
                this.b = ohe;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.ohc.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohc.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohc.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohc.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final ohc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showPlayButton");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playButtonBehavior");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showShuffleLabel");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showFollowButton");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" showLikesInsteadOfFollowers");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" openNpvWhenStartingPlaybackViaPlayButton");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                ogq ogq = new ogq(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return ogq;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    /* synthetic */ ogq(boolean z, ohe ohe, boolean z2, boolean z3, boolean z4, boolean z5, byte b2) {
        this(z, ohe, z2, z3, z4, z5);
    }

    private ogq(boolean z, ohe ohe, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = ohe;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.a;
    }

    public final ohe b() {
        return this.b;
    }

    public final boolean c() {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("P2sHeaderConfiguration{showPlayButton=");
        sb.append(this.a);
        sb.append(", playButtonBehavior=");
        sb.append(this.b);
        sb.append(", showShuffleLabel=");
        sb.append(this.c);
        sb.append(", showFollowButton=");
        sb.append(this.d);
        sb.append(", showLikesInsteadOfFollowers=");
        sb.append(this.e);
        sb.append(", openNpvWhenStartingPlaybackViaPlayButton=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohc) {
            ohc ohc = (ohc) obj;
            return this.a == ohc.a() && this.b.equals(ohc.b()) && this.c == ohc.c() && this.d == ohc.d() && this.e == ohc.e() && this.f == ohc.f();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.ohc.a g() {
        return new a(this, 0);
    }
}
