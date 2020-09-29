package defpackage;

import android.os.RemoteException;

/* renamed from: chf reason: default package */
final class chf implements Runnable {
    private final /* synthetic */ cfu a;
    private final /* synthetic */ cgf b;
    private final /* synthetic */ chd c;

    chf(chd chd, cfu cfu, cgf cgf) {
        this.c = chd;
        this.a = cfu;
        this.b = cgf;
    }

    public final void run() {
        cfy cfy;
        try {
            cfy = this.c.a(this.a);
        } catch (Exception e) {
            bjl.i().a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            cow.a(5);
            cfy = null;
        }
        if (cfy == null) {
            cfy = new cfy(0);
        }
        try {
            this.b.a(cfy);
        } catch (RemoteException unused) {
            cow.a(5);
        }
    }
}
