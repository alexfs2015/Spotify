package defpackage;

/* renamed from: lya reason: default package */
public final class lya extends lym {
    private final String a;
    private final boolean b;

    public lya(String str, boolean z) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseSessionInfo{productType=");
        sb.append(this.a);
        sb.append(", isPodcastsEnabled=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lym) {
            lym lym = (lym) obj;
            return this.a.equals(lym.a()) && this.b == lym.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
