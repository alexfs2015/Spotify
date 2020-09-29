package defpackage;

import android.os.RemoteException;

/* renamed from: euq reason: default package */
final class euq implements Runnable {
    private final /* synthetic */ ewh a;
    private final /* synthetic */ euj b;

    euq(euj euj, ewh ewh) {
        this.b = euj;
        this.a = ewh;
    }

    public final void run() {
        ere ere = this.b.b;
        if (ere == null) {
            this.b.q().c.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            ere.b(this.a);
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send measurementEnabled to the service", e);
        }
    }
}
