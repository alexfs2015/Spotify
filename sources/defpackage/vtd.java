package defpackage;

/* renamed from: vtd reason: default package */
final class vtd extends vrb {
    private final boolean a;
    private final boolean b;

    /* renamed from: vtd$a */
    static final class a extends defpackage.vrb.a {
        private Boolean a;
        private Boolean b;

        a() {
        }

        public final defpackage.vrb.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vrb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableHubsLocalCacheInFind");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" enableNewFindCard");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vtd(this.a.booleanValue(), this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.vrb.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    private vtd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* synthetic */ vtd(boolean z, boolean z2, byte b2) {
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
        if (obj instanceof vrb) {
            vrb vrb = (vrb) obj;
            return this.a == vrb.a() && this.b == vrb.b();
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
        StringBuilder sb = new StringBuilder("AndroidFeatureBrowseProperties{enableHubsLocalCacheInFind=");
        sb.append(this.a);
        sb.append(", enableNewFindCard=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
