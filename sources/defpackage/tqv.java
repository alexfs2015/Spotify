package defpackage;

/* renamed from: tqv reason: default package */
final class tqv extends tqw {
    private final int a;

    tqv(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{cardWidth=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqw) {
            if (this.a == ((tqw) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
