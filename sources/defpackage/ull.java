package defpackage;

/* renamed from: ull reason: default package */
abstract class ull extends uly {
    final umh a;
    final ulz b;

    ull(umh umh, ulz ulz) {
        if (umh != null) {
            this.a = umh;
            if (ulz != null) {
                this.b = ulz;
                return;
            }
            throw new NullPointerException("Null negativeAction");
        }
        throw new NullPointerException("Null content");
    }

    public final umh a() {
        return this.a;
    }

    public final ulz b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uly) {
            uly uly = (uly) obj;
            return this.a.equals(uly.a()) && this.b.equals(uly.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SlateModalViewModel{content=");
        sb.append(this.a);
        sb.append(", negativeAction=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
