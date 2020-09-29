package defpackage;

/* renamed from: aqq reason: default package */
public final class aqq {
    public static final aqq a = new aqq(0);
    public final int b;

    public aqq(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.b == ((aqq) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
