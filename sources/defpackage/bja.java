package defpackage;

import android.os.RemoteException;

/* renamed from: bja reason: default package */
final class bja implements Runnable {
    private final /* synthetic */ dvw a;
    private final /* synthetic */ bis b;

    bja(bis bis, dvw dvw) {
        this.b = bis;
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
