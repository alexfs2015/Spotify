package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: eua reason: default package */
final class eua implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ eqk c;
    private final /* synthetic */ evq d;
    private final /* synthetic */ String e;
    private final /* synthetic */ ets f;

    eua(ets ets, boolean z, boolean z2, eqk eqk, evq evq, String str) {
        this.f = ets;
        this.a = z;
        this.b = z2;
        this.c = eqk;
        this.d = evq;
        this.e = str;
    }

    public final void run() {
        eqn eqn = this.f.b;
        if (eqn == null) {
            this.f.q().c.a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            this.f.a(eqn, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    eqn.a(this.c, this.d);
                } else {
                    eqn.a(this.c, this.e, this.f.q().M_());
                }
            } catch (RemoteException e2) {
                this.f.q().c.a("Failed to send event to the service", e2);
            }
        }
        this.f.y();
    }
}
