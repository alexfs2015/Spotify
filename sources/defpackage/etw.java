package defpackage;

import android.os.RemoteException;

/* renamed from: etw reason: default package */
final class etw implements Runnable {
    private final /* synthetic */ evq a;
    private final /* synthetic */ ets b;

    etw(ets ets, evq evq) {
        this.b = ets;
        this.a = evq;
    }

    public final void run() {
        eqn eqn = this.b.b;
        if (eqn == null) {
            this.b.q().c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            eqn.a(this.a);
            this.b.a(eqn, null, this.a);
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send app launch to the service", e);
        }
    }
}
