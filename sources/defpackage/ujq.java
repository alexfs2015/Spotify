package defpackage;

/* renamed from: ujq reason: default package */
public final class ujq {
    private final jrs a;

    public ujq(jrs jrs) {
        this.a = jrs;
    }

    public final void a(ujr ujr) {
        vg vgVar = new vg(ujr.m);
        vgVar.a("spotify_id", this.a.b());
        vgVar.a("session_id", this.a.c());
        if (!ujr.l.isEmpty()) {
            vgVar.a("data", fau.a(",").b(":").a(ujr.l));
        }
        ve.a(vgVar);
    }
}
