package defpackage;

/* renamed from: otp reason: default package */
final class otp extends otr {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    /* renamed from: otp$a */
    static final class a implements defpackage.otr.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        a() {
        }

        public final defpackage.otr.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.otr.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.otr.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.otr.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final otr a() {
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
            if (str.isEmpty()) {
                otp otp = new otp(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), 0);
                return otp;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ otp(boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(z, z2, z3, z4);
    }

    private otp(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryHeaderConfiguration{showPlayButton=");
        sb.append(this.a);
        sb.append(", showShuffleLabel=");
        sb.append(this.b);
        sb.append(", showFollowButton=");
        sb.append(this.c);
        sb.append(", showLikesInsteadOfFollowers=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof otr) {
            otr otr = (otr) obj;
            return this.a == otr.a() && this.b == otr.b() && this.c == otr.c() && this.d == otr.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return i2 ^ i;
    }
}
