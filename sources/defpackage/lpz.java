package defpackage;

/* renamed from: lpz reason: default package */
abstract class lpz extends lqb {
    final String a;
    final String b;
    final String c;
    final String d;

    lpz(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = str4;
                return;
            }
            throw new NullPointerException("Null accessToken");
        }
        throw new NullPointerException("Null id");
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqb) {
            lqb lqb = (lqb) obj;
            if (this.a.equals(lqb.a()) && this.b.equals(lqb.b())) {
                String str = this.c;
                if (str != null ? str.equals(lqb.c()) : lqb.c() == null) {
                    String str2 = this.d;
                    return str2 != null ? str2.equals(lqb.d()) : lqb.d() == null;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FacebookUser{id=");
        sb.append(this.a);
        sb.append(", accessToken=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", email=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}