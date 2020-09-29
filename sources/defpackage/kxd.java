package defpackage;

/* renamed from: kxd reason: default package */
public final class kxd implements c {
    private final kxf a;
    private final kxh b;
    private final vro c;

    public kxd(kxf kxf, kxh kxh, vro vro) {
        this.a = kxf;
        this.b = kxh;
        this.c = vro;
    }

    public final void ai_() {
        if (this.c.a()) {
            this.b.a();
            this.a.a();
        }
    }

    public final void aj_() {
        if (this.c.a()) {
            this.a.b();
            this.b.a.bd_();
            return;
        }
        this.a.c();
    }

    public final String c() {
        return "inter-app-auth-cache-updater";
    }
}
