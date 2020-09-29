package defpackage;

/* renamed from: mcb reason: default package */
public final class mcb extends mcn {
    private final String a;
    private final boolean b;

    public mcb(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null productType");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcn) {
            mcn mcn = (mcn) obj;
            return this.a.equals(mcn.a()) && this.b == mcn.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseSessionInfo{productType=");
        sb.append(this.a);
        sb.append(", isPodcastsEnabled=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
