package defpackage;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: bwf reason: default package */
final class bwf implements Runnable {
    final /* synthetic */ bwd a;
    private final bwe b;

    bwf(bwd bwd, bwe bwe) {
        this.a = bwd;
        this.b = bwe;
    }

    public final void run() {
        if (this.a.c) {
            ConnectionResult connectionResult = this.b.b;
            if (connectionResult.a()) {
                this.a.a.startActivityForResult(GoogleApiActivity.a(this.a.a(), connectionResult.c, this.b.a, false), 1);
            } else if (this.a.e.a(connectionResult.b)) {
                this.a.e.a(this.a.a(), this.a.a, connectionResult.b, (OnCancelListener) this.a);
            } else if (connectionResult.b == 18) {
                this.a.e.a(this.a.a().getApplicationContext(), (bvj) new bwg(this, bso.a(this.a.a(), (OnCancelListener) this.a)));
            } else {
                this.a.a(connectionResult, this.b.a);
            }
        }
    }
}
