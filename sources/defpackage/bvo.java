package defpackage;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: bvo reason: default package */
final class bvo implements Runnable {
    final /* synthetic */ bvm a;
    private final bvn b;

    bvo(bvm bvm, bvn bvn) {
        this.a = bvm;
        this.b = bvn;
    }

    public final void run() {
        if (this.a.c) {
            ConnectionResult connectionResult = this.b.b;
            if (connectionResult.a()) {
                this.a.a.startActivityForResult(GoogleApiActivity.a(this.a.a(), connectionResult.c, this.b.a, false), 1);
            } else if (this.a.e.a(connectionResult.b)) {
                this.a.e.a(this.a.a(), this.a.a, connectionResult.b, (OnCancelListener) this.a);
            } else if (connectionResult.b == 18) {
                this.a.e.a(this.a.a().getApplicationContext(), (bus) new bvp(this, brx.a(this.a.a(), (OnCancelListener) this.a)));
            } else {
                this.a.a(connectionResult, this.b.a);
            }
        }
    }
}
