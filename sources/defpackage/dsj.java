package defpackage;

import android.os.RemoteException;

/* renamed from: dsj reason: default package */
final class dsj implements Runnable {
    private final /* synthetic */ dsi a;

    dsj(dsi dsi) {
        this.a = dsi;
    }

    public final void run() {
        if (this.a.a != null) {
            try {
                this.a.a.a(1);
            } catch (RemoteException unused) {
                cpn.a(5);
            }
        }
    }
}
