package defpackage;

import android.os.RemoteException;

/* renamed from: drs reason: default package */
final class drs implements Runnable {
    private final /* synthetic */ drr a;

    drs(drr drr) {
        this.a = drr;
    }

    public final void run() {
        if (this.a.a != null) {
            try {
                this.a.a.a(1);
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
    }
}
