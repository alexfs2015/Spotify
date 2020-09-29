package defpackage;

import android.os.RemoteException;

/* renamed from: dzk reason: default package */
final class dzk implements Runnable {
    private final /* synthetic */ dzl a;
    private final /* synthetic */ dzm b;

    dzk(dzl dzl, dzm dzm) {
        this.a = dzl;
        this.b = dzm;
    }

    public final void run() {
        try {
            this.a.a(this.b);
        } catch (RemoteException unused) {
            cpn.a(5);
        }
    }
}
