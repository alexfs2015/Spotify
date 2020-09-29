package defpackage;

import android.os.RemoteException;

/* renamed from: dyh reason: default package */
final /* synthetic */ class dyh implements Runnable {
    private final dyg a;
    private final dxx b;
    private final cqt c;
    private final dxy d;

    dyh(dyg dyg, dxx dxx, cqt cqt, dxy dxy) {
        this.a = dyg;
        this.b = dxx;
        this.c = cqt;
        this.d = dxy;
    }

    public final void run() {
        dyg dyg = this.a;
        dxx dxx = this.b;
        cqt cqt = this.c;
        try {
            cqt.b(dxx.s().a(this.d));
        } catch (RemoteException e) {
            cml.a("Unable to obtain a cache service instance.", e);
            cqt.a(e);
            dye.a(dyg.a);
        }
    }
}
