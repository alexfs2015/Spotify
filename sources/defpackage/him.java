package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: him reason: default package */
public final class him implements a {
    final hlf a;
    private final mh b;
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            him him = him.this;
            if ("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_OFF".equals(intent.getAction())) {
                him.a.a(false);
                return;
            }
            if ("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_ON".equals(intent.getAction())) {
                him.a.a(true);
            }
        }
    };

    public him(hlf hlf, mh mhVar) {
        this.a = hlf;
        this.b = mhVar;
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_OFF");
        intentFilter.addAction("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_ON");
        this.b.a(this.c, intentFilter);
    }

    public final void b() {
        this.b.a(this.c);
    }

    public final String c() {
        return "DriverDistractionModeController";
    }
}
