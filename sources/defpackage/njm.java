package defpackage;

/* renamed from: njm reason: default package */
final class njm extends njs {
    private final vky a;
    private final vlb<vkv> b;
    private final vlb<vkt> c;

    njm(vky vky, vlb<vkv> vlb, vlb<vkt> vlb2) {
        if (vky != null) {
            this.a = vky;
            if (vlb != null) {
                this.b = vlb;
                if (vlb2 != null) {
                    this.c = vlb2;
                    return;
                }
                throw new NullPointerException("Null albums");
            }
            throw new NullPointerException("Null episodes");
        }
        throw new NullPointerException("Null playlists");
    }

    public final vky a() {
        return this.a;
    }

    public final vlb<vkv> b() {
        return this.b;
    }

    public final vlb<vkt> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof njs) {
            njs njs = (njs) obj;
            return this.a.equals(njs.a()) && this.b.equals(njs.b()) && this.c.equals(njs.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeDownloadedContent{playlists=");
        sb.append(this.a);
        sb.append(", episodes=");
        sb.append(this.b);
        sb.append(", albums=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
