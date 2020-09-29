package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eum reason: default package */
final class eum implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ euj c;

    eum(euj euj, AtomicReference atomicReference, ewh ewh) {
        this.c = euj;
        this.a = atomicReference;
        this.b = ewh;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                ere ere = this.c.b;
                if (ere == null) {
                    this.c.q().c.a("Failed to get app instance id");
                    this.a.notify();
                    return;
                }
                this.a.set(ere.c(this.b));
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
