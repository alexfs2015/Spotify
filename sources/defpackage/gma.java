package defpackage;

/* renamed from: gma reason: default package */
abstract class gma extends gmc {
    final String a;
    final String b;
    final String c;

    gma(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null countryName");
            }
            throw new NullPointerException("Null callingCode");
        }
        throw new NullPointerException("Null countryCode");
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

    public String toString() {
        StringBuilder sb = new StringBuilder("CallingCode{countryCode=");
        sb.append(this.a);
        sb.append(", callingCode=");
        sb.append(this.b);
        sb.append(", countryName=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
