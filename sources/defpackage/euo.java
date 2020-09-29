package defpackage;

import android.os.RemoteException;

/* renamed from: euo reason: default package */
final class euo implements Runnable {
    private final /* synthetic */ euf a;
    private final /* synthetic */ euj b;

    euo(euj euj, euf euf) {
        this.b = euj;
        this.a = euf;
    }

    public final void run() {
        ere ere = this.b.b;
        if (ere == null) {
            this.b.q().c.a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.a == null) {
                ere.a(0, (String) null, (String) null, this.b.m().getPackageName());
            } else {
                ere.a(this.a.c, this.a.a, this.a.b, this.b.m().getPackageName());
            }
            this.b.y();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send current screen to the service", e);
        }
    }
}
