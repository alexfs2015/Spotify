package defpackage;

import android.os.RemoteException;

/* renamed from: eun reason: default package */
final class eun implements Runnable {
    private final /* synthetic */ ewh a;
    private final /* synthetic */ euj b;

    eun(euj euj, ewh ewh) {
        this.b = euj;
        this.a = ewh;
    }

    public final void run() {
        ere ere = this.b.b;
        if (ere == null) {
            this.b.q().c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            ere.a(this.a);
            this.b.a(ere, null, this.a);
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send app launch to the service", e);
        }
    }
}
