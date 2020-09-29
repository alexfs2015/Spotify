package defpackage;

/* renamed from: khq reason: default package */
abstract class khq extends khv {
    final boolean a;

    khq(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khv) {
            if (this.a == ((khv) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shareable{shareable=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
