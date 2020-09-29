package defpackage;

/* renamed from: giz reason: default package */
abstract class giz extends gjb {
    final udr a;

    giz(udr udr) {
        if (udr != null) {
            this.a = udr;
            return;
        }
        throw new NullPointerException("Null featureIdentifier");
    }

    public final udr a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalReferrer{featureIdentifier=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gjb)) {
            return false;
        }
        return this.a.equals(((gjb) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
