package defpackage;

import android.os.RemoteException;

/* renamed from: bkx reason: default package */
final class bkx implements Runnable {
    private final /* synthetic */ duk a;
    private final /* synthetic */ bkt b;

    bkx(bkt bkt, duk duk) {
        this.b = bkt;
        this.a = duk;
    }

    public final void run() {
        try {
            if (this.b.e.s != null) {
                this.b.e.s.a(this.a);
                this.b.a(this.a.j());
            }
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
