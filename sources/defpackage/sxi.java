package defpackage;

/* renamed from: sxi reason: default package */
final class sxi extends sxj {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    sxi(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BanButtonConfiguration{shouldShowFeedback=");
        sb.append(this.a);
        sb.append(", shouldAlwaysUseTrackBan=");
        sb.append(this.b);
        sb.append(", shouldUseLocalBanIcon=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sxj) {
            sxj sxj = (sxj) obj;
            return this.a == sxj.a() && this.b == sxj.b() && this.c == sxj.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }
}
