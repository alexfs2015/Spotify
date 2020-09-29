package defpackage;

/* renamed from: rfo reason: default package */
public final class rfo {
    final boolean a;
    public final boolean b;
    final boolean c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;

    public static rfo a(gzz gzz, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        fay.a(gzz);
        if (!gyi.a(gzz)) {
            gzq bundle = gzz.custom().bundle("toolbarmenu");
            if (bundle != null) {
                String str6 = "";
                String string = bundle.string("title", str6);
                String string2 = bundle.string("subtitle", str6);
                String string3 = bundle.string("image_uri", str6);
                String string4 = bundle.string("share_uri", str6);
                str = bundle.string("subtitle_uri", str6);
                str5 = string;
                str4 = string2;
                str3 = string3;
                str2 = string4;
                rfo rfo = new rfo(z, z2, z3, str5, str4, str3, str2, str);
                return rfo;
            }
        }
        str5 = null;
        str4 = null;
        str3 = null;
        str2 = null;
        str = null;
        rfo rfo2 = new rfo(z, z2, z3, str5, str4, str3, str2, str);
        return rfo2;
    }

    private rfo(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfo)) {
            return false;
        }
        rfo rfo = (rfo) obj;
        if (this.a != rfo.a || this.b != rfo.b || this.c != rfo.c) {
            return false;
        }
        String str = this.d;
        if (str == null ? rfo.d != null : !str.equals(rfo.d)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null ? rfo.e != null : !str2.equals(rfo.e)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? rfo.f != null : !str3.equals(rfo.f)) {
            return false;
        }
        String str4 = this.g;
        if (str4 == null ? rfo.g != null : !str4.equals(rfo.g)) {
            return false;
        }
        String str5 = this.h;
        String str6 = rfo.h;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }
}
