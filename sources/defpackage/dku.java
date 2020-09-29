package defpackage;

/* renamed from: dku reason: default package */
final class dku implements cqh<ebd> {
    private final /* synthetic */ dkt a;

    dku(dkt dkt) {
        this.a = dkt;
    }

    public final /* synthetic */ void a(Object obj) {
        ebd ebd = (ebd) obj;
        dkt dkt = this.a;
        dkt.d = true;
        ebd.a("/updateActiveView", dkt.e);
        ebd.a("/untrackActiveViewUnit", dkt.f);
        ebd.a("/visibilityChanged", dkt.g);
        if (bjl.B().a(dkt.b)) {
            ebd.a("/logScionEvent", dkt.h);
        }
    }
}
