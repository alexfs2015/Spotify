package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: dmw reason: default package */
final class dmw implements b {
    private final /* synthetic */ dms a;

    dmw(dms dms) {
        this.a = dms;
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
