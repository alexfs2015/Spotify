package defpackage;

import android.os.RemoteException;

/* renamed from: bix reason: default package */
final class bix implements Runnable {
    private final /* synthetic */ dty a;
    private final /* synthetic */ bis b;

    bix(bis bis, dty dty) {
        this.b = bis;
        this.a = dty;
    }

    public final void run() {
        try {
            if (this.b.e.t != null) {
                this.b.e.t.a(this.a);
                this.b.a(this.a.n());
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
