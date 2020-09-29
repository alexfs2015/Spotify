package defpackage;

/* renamed from: sbl reason: default package */
final class sbl extends sbo {
    private final a b;
    private final b c;

    sbl(a aVar, b bVar) {
        if (aVar != null) {
            this.b = aVar;
            if (bVar != null) {
                this.c = bVar;
                return;
            }
            throw new NullPointerException("Null stories");
        }
        throw new NullPointerException("Null artists");
    }

    public final a a() {
        return this.b;
    }

    public final b b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbo) {
            sbo sbo = (sbo) obj;
            return this.b.equals(sbo.a()) && this.c.equals(sbo.b());
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedModel{artists=");
        sb.append(this.b);
        sb.append(", stories=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
