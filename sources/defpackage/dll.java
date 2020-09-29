package defpackage;

/* renamed from: dll reason: default package */
final class dll implements cqy<ebu> {
    private final /* synthetic */ dlk a;

    dll(dlk dlk) {
        this.a = dlk;
    }

    public final /* synthetic */ void a(Object obj) {
        ebu ebu = (ebu) obj;
        dlk dlk = this.a;
        dlk.d = true;
        ebu.a("/updateActiveView", dlk.e);
        ebu.a("/untrackActiveViewUnit", dlk.f);
        ebu.a("/visibilityChanged", dlk.g);
        if (bkc.B().a(dlk.b)) {
            ebu.a("/logScionEvent", dlk.h);
        }
    }
}
