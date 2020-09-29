package defpackage;

/* renamed from: nvn reason: default package */
abstract class nvn extends nvr {
    final String a;
    final String b;
    final String c;
    final boolean d;

    nvn(String str, String str2, String str3, boolean z) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nvr) {
            nvr nvr = (nvr) obj;
            return this.a.equals(nvr.a()) && this.b.equals(nvr.b()) && this.c.equals(nvr.c()) && this.d == nvr.d();
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
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
}
