package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: dnn reason: default package */
final class dnn implements b {
    private final /* synthetic */ dnj a;

    dnn(dnj dnj) {
        this.a = dnj;
    }

    public final void a(ConnectionResult connectionResult) {
        synchronized (this.a.b) {
            this.a.d = null;
            if (this.a.c != null) {
                this.a.c = null;
            }
            this.a.b.notifyAll();
        }
    }
}
