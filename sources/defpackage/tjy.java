package defpackage;

/* renamed from: tjy reason: default package */
final class tjy extends tkd {
    private final boolean a;

    tjy(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkd) {
            if (this.a == ((tkd) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartButtonConfiguration{shouldShowFeedback=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
