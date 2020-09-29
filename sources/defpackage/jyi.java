package defpackage;

/* renamed from: jyi reason: default package */
public final class jyi {
    public static final jyi a = new jyi("", false);
    public final String b;
    public final boolean c;

    @Deprecated
    public jyi(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.b = str;
        this.c = z;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(this.c ? "-x-cc" : "");
        return sb.toString();
    }

    public final jyi a(Iterable<jyi> iterable) {
        jyi jyi = a;
        for (jyi jyi2 : iterable) {
            if (jyi2.equals(this)) {
                return jyi2;
            }
            if (a(jyi2) || (b(jyi2) && a.equals(jyi))) {
                jyi = jyi2;
            }
        }
        return jyi;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subtitle{mLocale='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mIsClosedCaption=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyi)) {
            return false;
        }
        jyi jyi = (jyi) obj;
        if (this.c != jyi.c) {
            return false;
        }
        String str = this.b;
        String str2 = jyi.b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.c ? 1 : 0);
    }

    public final String b() {
        String str = this.b;
        return (str == null || str.length() < 2) ? "" : this.b.substring(0, 2);
    }

    private boolean b(jyi jyi) {
        return b().equals(jyi.b());
    }

    private boolean a(jyi jyi) {
        return this.b.equals(jyi.b);
    }
}
