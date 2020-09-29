package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: etv reason: default package */
final class etv implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ ets c;

    etv(ets ets, AtomicReference atomicReference, evq evq) {
        this.c = ets;
        this.a = atomicReference;
        this.b = evq;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                eqn eqn = this.c.b;
                if (eqn == null) {
                    this.c.q().c.a("Failed to get app instance id");
                    this.a.notify();
                    return;
                }
                this.a.set(eqn.c(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.e().a(str);
                    this.c.r().k.a(str);
                }
                this.c.y();
                this.a.notify();
            } catch (RemoteException e) {
                try {
                    this.c.q().c.a("Failed to get app instance id", e);
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
