package defpackage;

import android.os.RemoteException;

/* renamed from: bke reason: default package */
final class bke implements Runnable {
    private final /* synthetic */ dty a;
    private final /* synthetic */ bkc b;

    bke(bkc bkc, dty dty) {
        this.b = bkc;
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
