package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fhm reason: default package */
final class fhm extends BroadcastReceiver {
    fhl a;

    public fhm(fhl fhl) {
        this.a = fhl;
    }

    public final void onReceive(Context context, Intent intent) {
        fhl fhl = this.a;
        if (fhl != null && fhl.b()) {
            FirebaseInstanceId.f();
            FirebaseInstanceId.a((Runnable) this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
