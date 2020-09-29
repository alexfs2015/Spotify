package defpackage;

/* renamed from: ffc reason: default package */
public final class ffc {
    final Class<?> a;
    final int b = 1;
    private final int c = 0;

    private ffc(Class<?> cls, int i, int i2) {
        this.a = (Class) bwx.a(cls, (Object) "Null dependency anInterface.");
    }

    public static ffc a(Class<?> cls) {
        return new ffc(cls, 1, 0);
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ffc) {
            ffc ffc = (ffc) obj;
            if (this.a == ffc.a && this.b == ffc.b && this.c == ffc.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.b == 1);
        sb.append(", direct=");
        if (this.c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
