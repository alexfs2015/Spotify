package defpackage;

/* renamed from: uvb reason: default package */
public final class uvb {
    private final juc a;

    public uvb(juc juc) {
        this.a = juc;
    }

    public final void a(uvc uvc) {
        vu vuVar = new vu(uvc.m);
        vuVar.a("spotify_id", this.a.b());
        vuVar.a("session_id", this.a.c());
        if (!uvc.l.isEmpty()) {
            vuVar.a("data", fbl.a(",").b(":").a(uvc.l));
        }
        vs.a(vuVar);
    }
}
