package defpackage;

import android.os.RemoteException;

/* renamed from: drq reason: default package */
final class drq implements Runnable {
    private final /* synthetic */ drp a;

    drq(drp drp) {
        this.a = drp;
    }

    public final void run() {
        if (this.a.a.a != null) {
            try {
                this.a.a.a.a(1);
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
    }
}
