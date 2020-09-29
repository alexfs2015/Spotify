package defpackage;

/* renamed from: ktu reason: default package */
public final class ktu implements c {
    private final ktw a;
    private final kty b;
    private final ver c;

    public final String c() {
        return "inter-app-auth-cache-updater";
    }

    public ktu(ktw ktw, kty kty, ver ver) {
        this.a = ktw;
        this.b = kty;
        this.c = ver;
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
            this.b.a.bf_();
            return;
        }
        this.a.c();
    }
}
