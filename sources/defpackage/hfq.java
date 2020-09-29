package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: hfq reason: default package */
public final class hfq implements a {
    final hil a;
    private final mc b;
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            hfq hfq = hfq.this;
            if ("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_OFF".equals(intent.getAction())) {
                hfq.a.a(false);
                return;
            }
            if ("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_ON".equals(intent.getAction())) {
                hfq.a.a(true);
            }
        }
    };

    public final String c() {
        return "DriverDistractionModeController";
    }

    public hfq(hil hil, mc mcVar) {
        this.a = hil;
        this.b = mcVar;
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
}
