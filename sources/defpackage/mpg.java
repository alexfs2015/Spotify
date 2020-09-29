package defpackage;

/* renamed from: mpg reason: default package */
public final class mpg extends mpf {
    private final String a;
    private final String b;
    private final String c;

    public mpg(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null image");
            }
            throw new NullPointerException("Null followers");
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistViewItem{name=");
        sb.append(this.a);
        sb.append(", followers=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mpf) {
            mpf mpf = (mpf) obj;
            return this.a.equals(mpf.a()) && this.b.equals(mpf.b()) && this.c.equals(mpf.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
