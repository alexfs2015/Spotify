package defpackage;

/* renamed from: ndx reason: default package */
final class ndx extends ned {
    private final uyv a;
    private final uyy<uys> b;
    private final uyy<uyq> c;

    ndx(uyv uyv, uyy<uys> uyy, uyy<uyq> uyy2) {
        if (uyv != null) {
            this.a = uyv;
            if (uyy != null) {
                this.b = uyy;
                if (uyy2 != null) {
                    this.c = uyy2;
                    return;
                }
                throw new NullPointerException("Null albums");
            }
            throw new NullPointerException("Null episodes");
        }
        throw new NullPointerException("Null playlists");
    }

    public final uyv a() {
        return this.a;
    }

    public final uyy<uys> b() {
        return this.b;
    }

    public final uyy<uyq> c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ned) {
            ned ned = (ned) obj;
            return this.a.equals(ned.a()) && this.b.equals(ned.b()) && this.c.equals(ned.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
