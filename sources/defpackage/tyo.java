package defpackage;

/* renamed from: tyo reason: default package */
abstract class tyo extends tzb {
    final tyz a;
    final tyy b;

    tyo(tyz tyz, tyy tyy) {
        if (tyz != null) {
            this.a = tyz;
            this.b = tyy;
            return;
        }
        throw new NullPointerException("Null imageSource");
    }

    /* access modifiers changed from: protected */
    public final tyz a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final tyy b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PicassoImage{imageSource=");
        sb.append(this.a);
        sb.append(", effect=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzb) {
            tzb tzb = (tzb) obj;
            if (this.a.equals(tzb.a())) {
                tyy tyy = this.b;
                return tyy != null ? tyy.equals(tzb.b()) : tzb.b() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        tyy tyy = this.b;
        return hashCode ^ (tyy == null ? 0 : tyy.hashCode());
    }
}
