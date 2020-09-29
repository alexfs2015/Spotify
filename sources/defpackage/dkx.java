package defpackage;

/* renamed from: dkx reason: default package */
final class dkx implements cqh<ebd> {
    private final /* synthetic */ dkt a;

    dkx(dkt dkt) {
        this.a = dkt;
    }

    public final /* synthetic */ void a(Object obj) {
        ebd ebd = (ebd) obj;
        dkt dkt = this.a;
        ebd.b("/visibilityChanged", dkt.g);
        ebd.b("/untrackActiveViewUnit", dkt.f);
        ebd.b("/updateActiveView", dkt.e);
        if (bjl.B().a(dkt.b)) {
            ebd.b("/logScionEvent", dkt.h);
        }
    }
}
