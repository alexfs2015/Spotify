package defpackage;

/* renamed from: dlo reason: default package */
final class dlo implements cqy<ebu> {
    private final /* synthetic */ dlk a;

    dlo(dlk dlk) {
        this.a = dlk;
    }

    public final /* synthetic */ void a(Object obj) {
        ebu ebu = (ebu) obj;
        dlk dlk = this.a;
        ebu.b("/visibilityChanged", dlk.g);
        ebu.b("/untrackActiveViewUnit", dlk.f);
        ebu.b("/updateActiveView", dlk.e);
        if (bkc.B().a(dlk.b)) {
            ebu.b("/logScionEvent", dlk.h);
        }
    }
}
