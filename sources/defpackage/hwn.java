package defpackage;

/* renamed from: hwn reason: default package */
final class hwn extends hwp {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    hwn(boolean z, boolean z2, boolean z3, boolean z4) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hwp) {
            hwp hwp = (hwp) obj;
            return this.a == hwp.a() && this.b == hwp.b() && this.c == hwp.c() && this.d == hwp.d();
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionState{canBan=");
        sb.append(this.a);
        sb.append(", canAddToCollection=");
        sb.append(this.b);
        sb.append(", isBanned=");
        sb.append(this.c);
        sb.append(", isInCollection=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
