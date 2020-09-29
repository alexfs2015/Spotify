package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bvr reason: default package */
public final class bvr implements b, c {
    public final bsc<?> a;
    bvs b;
    private final boolean c;

    public bvr(bsc<?> bsc, boolean z) {
        this.a = bsc;
        this.c = z;
    }

    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(ConnectionResult connectionResult) {
        a();
        this.b.a(connectionResult, this.a, this.c);
    }

    private final void a() {
        bwx.a(this.b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
