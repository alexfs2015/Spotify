package defpackage;

/* renamed from: wne reason: default package */
public final class wne extends wmg {
    private final String a;
    private final long c;
    private final wom d;

    public wne(String str, long j, wom wom) {
        this.a = str;
        this.c = j;
        this.d = wom;
    }

    public final wlz a() {
        String str = this.a;
        if (str != null) {
            return wlz.b(str);
        }
        return null;
    }

    public final long b() {
        return this.c;
    }

    public final wom c() {
        return this.d;
    }
}
