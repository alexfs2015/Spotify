package defpackage;

import android.os.RemoteException;

/* renamed from: bkv reason: default package */
final class bkv implements Runnable {
    private final /* synthetic */ dup a;
    private final /* synthetic */ bkt b;

    bkv(bkt bkt, dup dup) {
        this.b = bkt;
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
