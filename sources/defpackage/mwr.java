package defpackage;

/* renamed from: mwr reason: default package */
final class mwr extends mwx {
    private final mxa a;

    mwr(mxa mxa) {
        if (mxa != null) {
            this.a = mxa;
            return;
        }
        throw new NullPointerException("Null mutations");
    }

    public final mxa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwx)) {
            return false;
        }
        return this.a.equals(((mwx) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedResponse{mutations=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
