package defpackage;

/* renamed from: mru reason: default package */
final class mru extends mrz {
    private final msa a;

    mru(msa msa) {
        if (msa != null) {
            this.a = msa;
            return;
        }
        throw new NullPointerException("Null mutations");
    }

    public final msa a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedResponse{mutations=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mrz)) {
            return false;
        }
        return this.a.equals(((mrz) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
