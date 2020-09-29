package defpackage;

import android.os.RemoteException;

/* renamed from: bkw reason: default package */
final class bkw implements Runnable {
    private final /* synthetic */ dui a;
    private final /* synthetic */ bkt b;

    bkw(bkt bkt, dui dui) {
        this.b = bkt;
        this.a = dui;
    }

    public final void run() {
        try {
            if (this.b.e.r != null) {
                this.b.e.r.a(this.a);
                this.b.a(this.a.j());
            }
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
