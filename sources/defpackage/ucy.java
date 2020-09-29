package defpackage;

/* renamed from: ucy reason: default package */
final class ucy extends ucz {
    private final int a;

    ucy(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucz) {
            if (this.a == ((ucz) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{cardWidth=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
