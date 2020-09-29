package defpackage;

/* renamed from: flc reason: default package */
public final class flc {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj instanceof flc) {
            flc flc = (flc) obj;
            if (this.a == flc.a && this.b == flc.b) {
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
