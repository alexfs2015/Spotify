package defpackage;

import android.os.RemoteException;

/* renamed from: bkg reason: default package */
final class bkg implements Runnable {
    private final /* synthetic */ dtt a;
    private final /* synthetic */ bkc b;

    bkg(bkc bkc, dtt dtt) {
        this.b = bkc;
        this.a = dtt;
    }

    public final void run() {
        try {
            if (this.b.e.s != null) {
                this.b.e.s.a(this.a);
                this.b.a(this.a.j());
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
