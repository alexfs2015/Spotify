package defpackage;

import android.os.RemoteException;

/* renamed from: bjp reason: default package */
final class bjp implements Runnable {
    private final /* synthetic */ duk a;
    private final /* synthetic */ bjj b;

    bjp(bjj bjj, duk duk) {
        this.b = bjj;
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
