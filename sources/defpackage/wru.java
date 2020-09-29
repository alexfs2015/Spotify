package defpackage;

/* renamed from: wru reason: default package */
public final class wru extends wrs implements wsn {
    private wsk b;
    private String c;

    public wru(wst wst, wsk wsk, String str) {
        this(wst, wsk, str, true);
    }

    private wru(wst wst, wsk wsk, String str, boolean z) {
        super(wst, true, false);
        this.b = (wsk) wxq.a(wsk, "method");
        this.c = (String) wxq.a(str, "uri");
    }

    public final wsk a() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wru)) {
            return false;
        }
        wru wru = (wru) obj;
        return this.b.equals(wru.b) && this.c.equalsIgnoreCase(wru.c) && super.equals(obj);
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        wsj.a(sb, (wsi) this);
        sb.append(a());
        sb.append(' ');
        sb.append(c());
        sb.append(' ');
        sb.append(e());
        sb.append(wxt.a);
        wsj.a(sb, d());
        wsj.a(sb);
        return sb.toString();
    }
}
