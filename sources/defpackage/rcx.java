package defpackage;

/* renamed from: rcx reason: default package */
public final class rcx extends rde {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public rcx(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        throw new NullPointerException("Null pageIdentifier");
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageView{pageIdentifier=");
        sb.append(this.a);
        sb.append(", pageUri=");
        sb.append(this.b);
        sb.append(", navigationalRoot=");
        sb.append(this.c);
        sb.append(", className=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rde) {
            rde rde = (rde) obj;
            if (this.a.equals(rde.a())) {
                String str = this.b;
                if (str != null ? str.equals(rde.b()) : rde.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(rde.c()) : rde.c() == null) {
                        String str3 = this.d;
                        return str3 != null ? str3.equals(rde.d()) : rde.d() == null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }
}
