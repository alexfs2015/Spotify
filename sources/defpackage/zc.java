package defpackage;

/* renamed from: zc reason: default package */
public final class zc<T> {
    public T a;
    public T b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        if (!a(hoVar.a, this.a) || !a(hoVar.b, this.b)) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.a));
        sb.append(" ");
        sb.append(String.valueOf(this.b));
        sb.append("}");
        return sb.toString();
    }
}
