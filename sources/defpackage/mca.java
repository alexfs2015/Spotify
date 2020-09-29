package defpackage;

/* renamed from: mca reason: default package */
final class mca extends mcc {
    private final hcs a;
    private final lbg b;
    private final mcn c;

    mca(hcs hcs, lbg lbg, mcn mcn) {
        if (hcs != null) {
            this.a = hcs;
            if (lbg != null) {
                this.b = lbg;
                if (mcn != null) {
                    this.c = mcn;
                    return;
                }
                throw new NullPointerException("Null browseSessionInfo");
            }
            throw new NullPointerException("Null connectionState");
        }
        throw new NullPointerException("Null hubsViewModel");
    }

    public final hcs a() {
        return this.a;
    }

    public final lbg b() {
        return this.b;
    }

    public final mcn c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcc) {
            mcc mcc = (mcc) obj;
            return this.a.equals(mcc.a()) && this.b.equals(mcc.b()) && this.c.equals(mcc.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
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
}
