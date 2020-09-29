package defpackage;

/* renamed from: ulj reason: default package */
abstract class ulj extends ulw {
    final ulu a;
    final ult b;

    ulj(ulu ulu, ult ult) {
        if (ulu != null) {
            this.a = ulu;
            this.b = ult;
            return;
        }
        throw new NullPointerException("Null imageSource");
    }

    /* access modifiers changed from: protected */
    public final ulu a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final ult b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulw) {
            ulw ulw = (ulw) obj;
            if (this.a.equals(ulw.a())) {
                ult ult = this.b;
                return ult != null ? ult.equals(ulw.b()) : ulw.b() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ult ult = this.b;
        return hashCode ^ (ult == null ? 0 : ult.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PicassoImage{imageSource=");
        sb.append(this.a);
        sb.append(", effect=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
