package defpackage;

/* renamed from: ulk reason: default package */
abstract class ulk extends ulx {
    final int a;

    ulk(int i) {
        this.a = i;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulx) {
            if (this.a == ((ulx) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceText{resourceId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
