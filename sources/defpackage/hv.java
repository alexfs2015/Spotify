package defpackage;

/* renamed from: hv reason: default package */
public final class hv {
    public final Object a;

    public hv(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hv hvVar = (hv) obj;
        Object obj2 = this.a;
        Object obj3 = hvVar.a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
