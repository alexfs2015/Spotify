package defpackage;

/* renamed from: nrj reason: default package */
final class nrj extends nrl {
    private final boolean a;
    private final boolean b;

    /* renamed from: nrj$a */
    public static final class a implements defpackage.nrl.a {
        private Boolean a;
        private Boolean b;

        public final defpackage.nrl.a a(boolean z) {
            this.a = Boolean.TRUE;
            return this;
        }

        public final nrl a() {
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
                sb2.append(" shufflePlay");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new nrj(this.a.booleanValue(), this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.nrl.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    private nrj(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* synthetic */ nrj(boolean z, boolean z2, byte b2) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nrl) {
            nrl nrl = (nrl) obj;
            return this.a == nrl.a() && this.b == nrl.b();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixHeaderConfiguration{showPlayButton=");
        sb.append(this.a);
        sb.append(", shufflePlay=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
