package defpackage;

/* renamed from: typ reason: default package */
abstract class typ extends tzc {
    final int a;

    typ(int i) {
        this.a = i;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceText{resourceId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzc) {
            if (this.a == ((tzc) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }
}
