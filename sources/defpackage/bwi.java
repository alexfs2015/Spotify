package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bwi reason: default package */
public final class bwi implements b, c {
    public final bst<?> a;
    bwj b;
    private final boolean c;

    public bwi(bst<?> bst, boolean z) {
        this.a = bst;
        this.c = z;
    }

    private final void a() {
        bxo.a(this.b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    public final void a(ConnectionResult connectionResult) {
        a();
        this.b.a(connectionResult, this.a, this.c);
    }
}
