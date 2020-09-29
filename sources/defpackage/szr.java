package defpackage;

/* renamed from: szr reason: default package */
final class szr extends szw {
    private final boolean a;

    szr(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartButtonConfiguration{shouldShowFeedback=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof szw) {
            if (this.a == ((szw) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }
}
