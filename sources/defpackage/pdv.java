package defpackage;

/* renamed from: pdv reason: default package */
public final class pdv {
    public final String a;
    public final fsz b;
    public pfy c;
    private final peh d;

    public pdv(String str, peh peh, fsz fsz) {
        this.a = str;
        this.d = peh;
        this.b = fsz;
    }

    public final void a(fzn fzn, pfk pfk) {
        pfy pfy = this.c;
        if (pfy != null) {
            peh peh = this.d;
            peh.a = fzn;
            peh.a(fzn, pfy, true);
            peh.b(fzn, pfy, true);
            peh.a(fzn, pfy);
            pfk.a.a.setOnClickListener(new $$Lambda$pdv$KDOGqDXSW5xOP7ldJZGImFt9DWo(fzn));
        }
    }
}
