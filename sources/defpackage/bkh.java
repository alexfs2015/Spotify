package defpackage;

import android.os.RemoteException;

/* renamed from: bkh reason: default package */
final class bkh implements Runnable {
    private final /* synthetic */ dvw a;
    private final /* synthetic */ bkc b;

    bkh(bkc bkc, dvw dvw) {
        this.b = bkc;
        this.a = dvw;
    }

    public final void run() {
        try {
            ((dwk) this.b.e.v.get(this.a.l())).a(this.a);
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
