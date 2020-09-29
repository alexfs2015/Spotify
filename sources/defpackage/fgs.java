package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fgs reason: default package */
final class fgs extends BroadcastReceiver {
    fgr a;

    public fgs(fgr fgr) {
        this.a = fgr;
    }

    public final void onReceive(Context context, Intent intent) {
        fgr fgr = this.a;
        if (fgr != null && fgr.b()) {
            FirebaseInstanceId.f();
            FirebaseInstanceId.a((Runnable) this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
