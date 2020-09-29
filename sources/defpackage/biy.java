package defpackage;

import android.os.RemoteException;

/* renamed from: biy reason: default package */
final class biy implements Runnable {
    private final /* synthetic */ dtt a;
    private final /* synthetic */ bis b;

    biy(bis bis, dtt dtt) {
        this.b = bis;
        this.a = dtt;
    }

    public final void run() {
        try {
            if (this.b.e.s != null) {
                this.b.e.s.a(this.a);
                this.b.a(this.a.j());
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
