package defpackage;

import android.os.RemoteException;

/* renamed from: bjn reason: default package */
final class bjn implements Runnable {
    private final /* synthetic */ dui a;
    private final /* synthetic */ bjj b;

    bjn(bjj bjj, dui dui) {
        this.b = bjj;
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
