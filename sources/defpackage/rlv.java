package defpackage;

/* renamed from: rlv reason: default package */
public final class rlv extends rmc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public rlv(String str, String str2, String str3, String str4) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmc) {
            rmc rmc = (rmc) obj;
            if (this.a.equals(rmc.a())) {
                String str = this.b;
                if (str != null ? str.equals(rmc.b()) : rmc.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(rmc.c()) : rmc.c() == null) {
                        String str3 = this.d;
                        return str3 != null ? str3.equals(rmc.d()) : rmc.d() == null;
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
}
