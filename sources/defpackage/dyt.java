package defpackage;

import android.os.RemoteException;

/* renamed from: dyt reason: default package */
final class dyt implements Runnable {
    private final /* synthetic */ dyu a;
    private final /* synthetic */ dyv b;

    dyt(dyu dyu, dyv dyv) {
        this.a = dyu;
        this.b = dyv;
    }

    public final void run() {
        try {
            this.a.a(this.b);
        } catch (RemoteException unused) {
            cow.a(5);
        }
    }
}
