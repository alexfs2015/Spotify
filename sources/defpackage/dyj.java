package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: dyj reason: default package */
final class dyj implements b {
    private final /* synthetic */ cqt a;
    private final /* synthetic */ dye b;

    dyj(dye dye, cqt cqt) {
        this.b = dye;
        this.a = cqt;
    }

    public final void a(ConnectionResult connectionResult) {
        synchronized (this.b.c) {
            this.a.a(new RuntimeException("Connection failed."));
        }
    }
}
