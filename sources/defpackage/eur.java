package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: eur reason: default package */
final class eur implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ erb c;
    private final /* synthetic */ ewh d;
    private final /* synthetic */ String e;
    private final /* synthetic */ euj f;

    eur(euj euj, boolean z, boolean z2, erb erb, ewh ewh, String str) {
        this.f = euj;
        this.a = z;
        this.b = z2;
        this.c = erb;
        this.d = ewh;
        this.e = str;
    }

    public final void run() {
        ere ere = this.f.b;
        if (ere == null) {
            this.f.q().c.a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            this.f.a(ere, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    ere.a(this.c, this.d);
                } else {
                    ere.a(this.c, this.e, this.f.q().M_());
                }
            } catch (RemoteException e2) {
                this.f.q().c.a("Failed to send event to the service", e2);
            }
        }
        this.f.y();
    }
}
