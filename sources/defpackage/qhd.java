package defpackage;

/* renamed from: qhd reason: default package */
abstract class qhd extends qhf {
    final String a;
    final String b;
    final String c;
    final String d;

    qhd(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (str3 != null) {
                this.c = str3;
                this.d = str4;
                return;
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null entityUri");
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

    public final String d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResultPageItem{entityUri=");
        sb.append(this.a);
        sb.append(", imageUri=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subTitle=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhf) {
            qhf qhf = (qhf) obj;
            if (this.a.equals(qhf.a())) {
                String str = this.b;
                if (str != null ? str.equals(qhf.b()) : qhf.b() == null) {
                    if (this.c.equals(qhf.c())) {
                        String str2 = this.d;
                        return str2 != null ? str2.equals(qhf.d()) : qhf.d() == null;
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
