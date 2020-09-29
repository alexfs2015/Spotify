package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: eus reason: default package */
final class eus implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ ewl c;
    private final /* synthetic */ ewh d;
    private final /* synthetic */ ewl e;
    private final /* synthetic */ euj f;

    eus(euj euj, boolean z, boolean z2, ewl ewl, ewh ewh, ewl ewl2) {
        this.f = euj;
        this.b = z2;
        this.c = ewl;
        this.d = ewh;
        this.e = ewl2;
    }

    public final void run() {
        ere ere = this.f.b;
        if (ere == null) {
            this.f.q().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            this.f.a(ere, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    ere.a(this.c, this.d);
                } else {
                    ere.a(this.c);
                }
            } catch (RemoteException e2) {
                this.f.q().c.a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f.y();
    }
}
