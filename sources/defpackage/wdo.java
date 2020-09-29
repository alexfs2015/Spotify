package defpackage;

/* renamed from: wdo reason: default package */
public final class wdo extends wdm implements weh {
    private wee b;
    private String c;

    public wdo(wen wen, wee wee, String str) {
        this(wen, wee, str, true);
    }

    private wdo(wen wen, wee wee, String str, boolean z) {
        super(wen, true, false);
        this.b = (wee) wjk.a(wee, "method");
        this.c = (String) wjk.a(str, "uri");
    }

    public final wee a() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wdo)) {
            return false;
        }
        wdo wdo = (wdo) obj;
        if (!this.b.equals(wdo.b) || !this.c.equalsIgnoreCase(wdo.c) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        wed.a(sb, (wec) this);
        sb.append(a());
        sb.append(' ');
        sb.append(c());
        sb.append(' ');
        sb.append(e());
        sb.append(wjn.a);
        wed.a(sb, d());
        wed.a(sb);
        return sb.toString();
    }
}
