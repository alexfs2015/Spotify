package defpackage;

/* renamed from: kmu reason: default package */
final class kmu extends kne {
    private final String a;
    private final String b;

    kmu(String str, String str2) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingParameters{featureId=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kne) {
            kne kne = (kne) obj;
            return this.a.equals(kne.a()) && this.b.equals(kne.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
