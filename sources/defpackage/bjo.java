package defpackage;

import android.os.RemoteException;

/* renamed from: bjo reason: default package */
final class bjo implements Runnable {
    private final /* synthetic */ dup a;
    private final /* synthetic */ bjj b;

    bjo(bjj bjj, dup dup) {
        this.b = bjj;
        this.a = dup;
    }

    public final void run() {
        try {
            if (this.b.e.t != null) {
                this.b.e.t.a(this.a);
                this.b.a(this.a.n());
            }
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
