package defpackage;

/* renamed from: lxz reason: default package */
final class lxz extends lyb {
    private final gzz a;
    private final kxx b;
    private final lym c;

    lxz(gzz gzz, kxx kxx, lym lym) {
        if (gzz != null) {
            this.a = gzz;
            if (kxx != null) {
                this.b = kxx;
                if (lym != null) {
                    this.c = lym;
                    return;
                }
                throw new NullPointerException("Null browseSessionInfo");
            }
            throw new NullPointerException("Null connectionState");
        }
        throw new NullPointerException("Null hubsViewModel");
    }

    public final gzz a() {
        return this.a;
    }

    public final kxx b() {
        return this.b;
    }

    public final lym c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseModelHolder{hubsViewModel=");
        sb.append(this.a);
        sb.append(", connectionState=");
        sb.append(this.b);
        sb.append(", browseSessionInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyb) {
            lyb lyb = (lyb) obj;
            return this.a.equals(lyb.a()) && this.b.equals(lyb.b()) && this.c.equals(lyb.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
