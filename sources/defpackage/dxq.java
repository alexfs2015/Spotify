package defpackage;

import android.os.RemoteException;

/* renamed from: dxq reason: default package */
final /* synthetic */ class dxq implements Runnable {
    private final dxp a;
    private final dxg b;
    private final cqc c;
    private final dxh d;

    dxq(dxp dxp, dxg dxg, cqc cqc, dxh dxh) {
        this.a = dxp;
        this.b = dxg;
        this.c = cqc;
        this.d = dxh;
    }

    public final void run() {
        dxp dxp = this.a;
        dxg dxg = this.b;
        cqc cqc = this.c;
        try {
            cqc.b(dxg.s().a(this.d));
        } catch (RemoteException e) {
            clu.a("Unable to obtain a cache service instance.", e);
            cqc.a(e);
            dxn.a(dxp.a);
        }
    }
}
