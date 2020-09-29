package defpackage;

/* renamed from: xbk reason: default package */
public final class xbk extends xam {
    private final String a;
    private final long c;
    private final xcs d;

    public xbk(String str, long j, xcs xcs) {
        this.a = str;
        this.c = j;
        this.d = xcs;
    }

    public final xaf a() {
        String str = this.a;
        if (str != null) {
            return xaf.b(str);
        }
        return null;
    }

    public final long b() {
        return this.c;
    }

    public final xcs c() {
        return this.d;
    }
}
