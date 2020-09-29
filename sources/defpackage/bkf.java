package defpackage;

import android.os.RemoteException;

/* renamed from: bkf reason: default package */
final class bkf implements Runnable {
    private final /* synthetic */ dtr a;
    private final /* synthetic */ bkc b;

    bkf(bkc bkc, dtr dtr) {
        this.b = bkc;
        this.a = dtr;
    }

    public final void run() {
        try {
            if (this.b.e.r != null) {
                this.b.e.r.a(this.a);
                this.b.a(this.a.j());
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
