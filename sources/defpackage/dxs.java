package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: dxs reason: default package */
final class dxs implements b {
    private final /* synthetic */ cqc a;
    private final /* synthetic */ dxn b;

    dxs(dxn dxn, cqc cqc) {
        this.b = dxn;
        this.a = cqc;
    }

    public final void a(ConnectionResult connectionResult) {
        synchronized (this.b.c) {
            this.a.a(new RuntimeException("Connection failed."));
        }
    }
}
