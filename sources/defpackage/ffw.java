package defpackage;

/* renamed from: ffw reason: default package */
public final class ffw {
    final Class<?> a;
    final int b = 1;
    private final int c = 0;

    private ffw(Class<?> cls, int i, int i2) {
        this.a = (Class) bxo.a(cls, (Object) "Null dependency anInterface.");
    }

    public static ffw a(Class<?> cls) {
        return new ffw(cls, 1, 0);
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ffw) {
            ffw ffw = (ffw) obj;
            if (this.a == ffw.a && this.b == ffw.b && this.c == ffw.c) {
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
