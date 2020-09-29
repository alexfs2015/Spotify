package defpackage;

/* renamed from: npk reason: default package */
abstract class npk extends npo {
    final String a;
    final String b;
    final String c;
    final boolean d;

    npk(String str, String str2, String str3, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    return;
                }
                throw new NullPointerException("Null bcp47");
            }
            throw new NullPointerException("Null imageUri");
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

    public final boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserLanguage{name=");
        sb.append(this.a);
        sb.append(", imageUri=");
        sb.append(this.b);
        sb.append(", bcp47=");
        sb.append(this.c);
        sb.append(", selected=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof npo) {
            npo npo = (npo) obj;
            return this.a.equals(npo.a()) && this.b.equals(npo.b()) && this.c.equals(npo.c()) && this.d == npo.d();
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }
}
