package defpackage;

import android.os.RemoteException;

/* renamed from: biw reason: default package */
final class biw implements Runnable {
    private final /* synthetic */ dtr a;
    private final /* synthetic */ bis b;

    biw(bis bis, dtr dtr) {
        this.b = bis;
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
