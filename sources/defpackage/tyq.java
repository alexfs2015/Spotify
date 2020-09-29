package defpackage;

/* renamed from: tyq reason: default package */
abstract class tyq extends tzd {
    final tzm a;
    final tze b;

    tyq(tzm tzm, tze tze) {
        if (tzm != null) {
            this.a = tzm;
            if (tze != null) {
                this.b = tze;
                return;
            }
            throw new NullPointerException("Null negativeAction");
        }
        throw new NullPointerException("Null content");
    }

    public final tzm a() {
        return this.a;
    }

    public final tze b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SlateModalViewModel{content=");
        sb.append(this.a);
        sb.append(", negativeAction=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzd) {
            tzd tzd = (tzd) obj;
            return this.a.equals(tzd.a()) && this.b.equals(tzd.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
