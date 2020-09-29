package defpackage;

/* renamed from: ogs reason: default package */
final class ogs extends ohe {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    /* renamed from: ogs$a */
    static final class a implements defpackage.ohe.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        a() {
        }

        public final defpackage.ohe.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohe.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohe.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ohe.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final ohe a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playButtonSaysShufflePlay");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playButtonDoShufflePlay");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" roundPlayButton");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" singleStateButton");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                ogs ogs = new ogs(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), 0);
                return ogs;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ ogs(boolean z, boolean z2, boolean z3, boolean z4, byte b2) {
        this(z, z2, z3, z4);
    }

    private ogs(boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayButtonBehavior{playButtonSaysShufflePlay=");
        sb.append(this.b);
        sb.append(", playButtonDoShufflePlay=");
        sb.append(this.c);
        sb.append(", roundPlayButton=");
        sb.append(this.d);
        sb.append(", singleStateButton=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohe) {
            ohe ohe = (ohe) obj;
            return this.b == ohe.a() && this.c == ohe.b() && this.d == ohe.c() && this.e == ohe.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return i2 ^ i;
    }
}
