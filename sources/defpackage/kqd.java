package defpackage;

/* renamed from: kqd reason: default package */
final class kqd extends kqn {
    private final String a;
    private final String b;

    kqd(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null sectionId");
        }
        throw new NullPointerException("Null featureId");
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqn) {
            kqn kqn = (kqn) obj;
            return this.a.equals(kqn.a()) && this.b.equals(kqn.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingParameters{featureId=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
