package defpackage;

/* renamed from: pnh reason: default package */
final class pnh extends pnm {
    private final String a;
    private final String b;

    pnh(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null currentUri");
        }
        throw new NullPointerException("Null previousUri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent{previousUri=");
        sb.append(this.a);
        sb.append(", currentUri=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pnm) {
            pnm pnm = (pnm) obj;
            return this.a.equals(pnm.a()) && this.b.equals(pnm.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
