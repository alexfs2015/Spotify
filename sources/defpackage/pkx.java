package defpackage;

/* renamed from: pkx reason: default package */
final class pkx extends pky {
    private final String a;
    private final String b;

    pkx(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null contextUri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pky) {
            pky pky = (pky) obj;
            if (this.a.equals(pky.a())) {
                String str = this.b;
                return str != null ? str.equals(pky.b()) : pky.b() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerStateUris{contextUri=");
        sb.append(this.a);
        sb.append(", trackUri=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
