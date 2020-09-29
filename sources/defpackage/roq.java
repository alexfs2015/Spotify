package defpackage;

/* renamed from: roq reason: default package */
public final class roq {
    final boolean a;
    public final boolean b;
    final boolean c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;

    private roq(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static roq a(hcs hcs, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        fbp.a(hcs);
        if (!hbb.a(hcs)) {
            hcj bundle = hcs.custom().bundle("toolbarmenu");
            if (bundle != null) {
                String str7 = "";
                String string = bundle.string("title", str7);
                String string2 = bundle.string("subtitle", str7);
                String string3 = bundle.string("image_uri", str7);
                String string4 = bundle.string("share_uri", str7);
                String string5 = bundle.string("subtitle_uri", str7);
                str = bundle.string("artistAvatarModerationUri", str7);
                str6 = string;
                str5 = string2;
                str4 = string3;
                str3 = string4;
                str2 = string5;
                roq roq = new roq(z, z2, z3, str6, str5, str4, str3, str2, str);
                return roq;
            }
        }
        str6 = null;
        str5 = null;
        str4 = null;
        str3 = null;
        str2 = null;
        str = null;
        roq roq2 = new roq(z, z2, z3, str6, str5, str4, str3, str2, str);
        return roq2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roq)) {
            return false;
        }
        roq roq = (roq) obj;
        if (this.a != roq.a || this.b != roq.b || this.c != roq.c) {
            return false;
        }
        String str = this.d;
        if (str == null ? roq.d != null : !str.equals(roq.d)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null ? roq.e != null : !str2.equals(roq.e)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? roq.f != null : !str3.equals(roq.f)) {
            return false;
        }
        String str4 = this.g;
        if (str4 == null ? roq.g != null : !str4.equals(roq.g)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? roq.h != null : !str5.equals(roq.h)) {
            return false;
        }
        String str6 = this.i;
        return str6 == null ? roq.i == null : str6.equals(roq.i);
    }

    public final int hashCode() {
        int i2 = (((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode4 + i3;
    }
}
