package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: eub reason: default package */
final class eub implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ evu c;
    private final /* synthetic */ evq d;
    private final /* synthetic */ evu e;
    private final /* synthetic */ ets f;

    eub(ets ets, boolean z, boolean z2, evu evu, evq evq, evu evu2) {
        this.f = ets;
        this.b = z2;
        this.c = evu;
        this.d = evq;
        this.e = evu2;
    }

    public final void run() {
        eqn eqn = this.f.b;
        if (eqn == null) {
            this.f.q().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            this.f.a(eqn, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    eqn.a(this.c, this.d);
                } else {
                    eqn.a(this.c);
                }
            } catch (RemoteException e2) {
                this.f.q().c.a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f.y();
    }
}
