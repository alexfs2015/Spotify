package defpackage;

/* renamed from: onu reason: default package */
final class onu extends oog {
    private final boolean a;
    private final ooi b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: onu$a */
    static final class a implements defpackage.oog.a {
        private Boolean a;
        private ooi b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        private a(oog oog) {
            this.a = Boolean.valueOf(oog.a());
            this.b = oog.b();
            this.c = Boolean.valueOf(oog.c());
            this.d = Boolean.valueOf(oog.d());
            this.e = Boolean.valueOf(oog.e());
            this.f = Boolean.valueOf(oog.f());
        }

        /* synthetic */ a(oog oog, byte b2) {
            this(oog);
        }

        public final defpackage.oog.a a(ooi ooi) {
            if (ooi != null) {
                this.b = ooi;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        public final defpackage.oog.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final oog a() {
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
                onu onu = new onu(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return onu;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.oog.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oog.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oog.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oog.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    private onu(boolean z, ooi ooi, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = ooi;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    /* synthetic */ onu(boolean z, ooi ooi, boolean z2, boolean z3, boolean z4, boolean z5, byte b2) {
        this(z, ooi, z2, z3, z4, z5);
    }

    public final boolean a() {
        return this.a;
    }

    public final ooi b() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oog) {
            oog oog = (oog) obj;
            return this.a == oog.a() && this.b.equals(oog.b()) && this.c == oog.c() && this.d == oog.d() && this.e == oog.e() && this.f == oog.f();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final defpackage.oog.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
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
}
