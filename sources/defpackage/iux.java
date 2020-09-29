package defpackage;

/* renamed from: iux reason: default package */
final class iux {
    public static final iux a = new iux(false, false, false);
    final boolean b;
    final boolean c;
    final boolean d;

    public iux(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iux)) {
            return false;
        }
        iux iux = (iux) obj;
        return this.b == iux.b && this.c == iux.c && this.d == iux.d;
    }

    public final int hashCode() {
        return ((((this.b ? 1 : 0) * true) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartViewState{mGravityProductionEnabled=");
        sb.append(this.b);
        sb.append(", mIsInCollection=");
        sb.append(this.c);
        sb.append(", mIsCollectable=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
