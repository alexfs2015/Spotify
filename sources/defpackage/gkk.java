package defpackage;

/* renamed from: gkk reason: default package */
abstract class gkk extends gkm {
    final uqm a;

    gkk(uqm uqm) {
        if (uqm != null) {
            this.a = uqm;
            return;
        }
        throw new NullPointerException("Null featureIdentifier");
    }

    public final uqm a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gkm)) {
            return false;
        }
        return this.a.equals(((gkm) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalReferrer{featureIdentifier=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
