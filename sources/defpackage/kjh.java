package defpackage;

/* renamed from: kjh reason: default package */
abstract class kjh extends kjk {
    final String a;
    final String b;
    final String c;
    private final String d;

    kjh(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.d = str2;
                if (str3 != null) {
                    this.b = str3;
                    if (str4 != null) {
                        this.c = str4;
                        return;
                    }
                    throw new NullPointerException("Null previewUrl");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null country");
    }

    public final String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjk) {
            kjk kjk = (kjk) obj;
            return this.a.equals(kjk.a()) && this.d.equals(kjk.b()) && this.b.equals(kjk.c()) && this.c.equals(kjk.d());
        }
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Artist{country=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", previewUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
