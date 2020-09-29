package defpackage;

/* renamed from: pba reason: default package */
final class pba extends pbc {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: pba$a */
    static final class a implements defpackage.pbc.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        public final defpackage.pbc.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final pbc a() {
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
                sb2.append(" showShuffleLabel");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showFollowButton");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showLikesInsteadOfFollowers");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" useRoundPlayButton");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" hideShuffleBadgeWhenRound");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                pba pba = new pba(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), 0);
                return pba;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.pbc.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.pbc.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.pbc.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.pbc.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.pbc.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    private pba(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    /* synthetic */ pba(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byte b2) {
        this(z, z2, z3, z4, z5, z6);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
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
        if (obj instanceof pbc) {
            pbc pbc = (pbc) obj;
            return this.a == pbc.a() && this.b == pbc.b() && this.c == pbc.c() && this.d == pbc.d() && this.e == pbc.e() && this.f == pbc.f();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryHeaderConfiguration{showPlayButton=");
        sb.append(this.a);
        sb.append(", showShuffleLabel=");
        sb.append(this.b);
        sb.append(", showFollowButton=");
        sb.append(this.c);
        sb.append(", showLikesInsteadOfFollowers=");
        sb.append(this.d);
        sb.append(", useRoundPlayButton=");
        sb.append(this.e);
        sb.append(", hideShuffleBadgeWhenRound=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
