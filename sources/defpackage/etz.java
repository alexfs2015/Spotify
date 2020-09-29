package defpackage;

import android.os.RemoteException;

/* renamed from: etz reason: default package */
final class etz implements Runnable {
    private final /* synthetic */ evq a;
    private final /* synthetic */ ets b;

    etz(ets ets, evq evq) {
        this.b = ets;
        this.a = evq;
    }

    public final void run() {
        eqn eqn = this.b.b;
        if (eqn == null) {
            this.b.q().c.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            eqn.b(this.a);
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send measurementEnabled to the service", e);
        }
    }
}
