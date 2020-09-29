package defpackage;

/* renamed from: pbx reason: default package */
public final class pbx implements a {
    private final pbm a;
    private final kxm b;
    private final pbz c;

    public pbx(pbm pbm, kxm kxm, pbz pbz) {
        this.a = pbm;
        this.b = kxm;
        this.c = pbz;
    }

    public final void a(String str) {
        this.b.a(str);
        this.a.a(true);
    }

    public final void b(String str) {
        this.c.a(str);
    }

    public final void c(String str) {
        this.b.b(str);
        this.a.a(false);
    }
}
