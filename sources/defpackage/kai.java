package defpackage;

/* renamed from: kai reason: default package */
public final class kai {
    public static final kai a = new kai("", false);
    public final String b;
    public final boolean c;

    @Deprecated
    public kai(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        this.b = str;
        this.c = z;
    }

    private boolean a(kai kai) {
        return this.b.equals(kai.b);
    }

    private boolean b(kai kai) {
        return b().equals(kai.b());
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(this.c ? "-x-cc" : "");
        return sb.toString();
    }

    public final kai a(Iterable<kai> iterable) {
        kai kai = a;
        for (kai kai2 : iterable) {
            if (kai2.equals(this)) {
                return kai2;
            }
            if (a(kai2) || (b(kai2) && a.equals(kai))) {
                kai = kai2;
            }
        }
        return kai;
    }

    public final String b() {
        String str = this.b;
        return (str == null || str.length() < 2) ? "" : this.b.substring(0, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kai)) {
            return false;
        }
        kai kai = (kai) obj;
        if (this.c != kai.c) {
            return false;
        }
        String str = this.b;
        String str2 = kai.b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.c ? 1 : 0);
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
}
