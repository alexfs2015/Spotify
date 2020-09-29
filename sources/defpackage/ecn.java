package defpackage;

import android.os.RemoteException;

/* renamed from: ecn reason: default package */
final class ecn implements Runnable {
    private final /* synthetic */ ecg a;

    ecn(ecg ecg) {
        this.a = ecg;
    }

    public final void run() {
        try {
            this.a.c.c();
        } catch (RemoteException unused) {
            cow.a(5);
        }
    }
}
