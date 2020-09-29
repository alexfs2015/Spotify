package defpackage;

import android.os.RemoteException;

/* renamed from: chw reason: default package */
final class chw implements Runnable {
    private final /* synthetic */ cgl a;
    private final /* synthetic */ cgw b;
    private final /* synthetic */ chu c;

    chw(chu chu, cgl cgl, cgw cgw) {
        this.c = chu;
        this.a = cgl;
        this.b = cgw;
    }

    public final void run() {
        cgp cgp;
        try {
            cgp = this.c.a(this.a);
        } catch (Exception e) {
            bkc.i().a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            cpn.a(5);
            cgp = null;
        }
        if (cgp == null) {
            cgp = new cgp(0);
        }
        try {
            this.b.a(cgp);
        } catch (RemoteException unused) {
            cpn.a(5);
        }
    }
}
