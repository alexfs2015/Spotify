package defpackage;

/* renamed from: arh reason: default package */
public final class arh {
    public static final arh a = new arh(0);
    public final int b;

    public arh(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.b == ((arh) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
