package defpackage;

import android.os.RemoteException;

/* renamed from: dsh reason: default package */
final class dsh implements Runnable {
    private final /* synthetic */ dsg a;

    dsh(dsg dsg) {
        this.a = dsg;
    }

    public final void run() {
        if (this.a.a.a != null) {
            try {
                this.a.a.a.a(1);
            } catch (RemoteException unused) {
                cpn.a(5);
            }
        }
    }
}
