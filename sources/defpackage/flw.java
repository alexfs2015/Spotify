package defpackage;

/* renamed from: flw reason: default package */
public final class flw {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj instanceof flw) {
            flw flw = (flw) obj;
            if (this.a == flw.a && this.b == flw.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
