package defpackage;

import android.os.RemoteException;

/* renamed from: ede reason: default package */
final class ede implements Runnable {
    private final /* synthetic */ ecx a;

    ede(ecx ecx) {
        this.a = ecx;
    }

    public final void run() {
        try {
            this.a.c.c();
        } catch (RemoteException unused) {
            cpn.a(5);
        }
    }
}
