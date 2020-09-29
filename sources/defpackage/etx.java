package defpackage;

import android.os.RemoteException;

/* renamed from: etx reason: default package */
final class etx implements Runnable {
    private final /* synthetic */ eto a;
    private final /* synthetic */ ets b;

    etx(ets ets, eto eto) {
        this.b = ets;
        this.a = eto;
    }

    public final void run() {
        eqn eqn = this.b.b;
        if (eqn == null) {
            this.b.q().c.a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.a == null) {
                eqn.a(0, (String) null, (String) null, this.b.m().getPackageName());
            } else {
                eqn.a(this.a.c, this.a.a, this.a.b, this.b.m().getPackageName());
            }
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send current screen to the service", e);
        }
    }
}
