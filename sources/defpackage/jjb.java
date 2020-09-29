package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;

/* renamed from: jjb reason: default package */
public final class jjb extends jkj {
    private final Context a;
    private BroadcastReceiver b;

    public jjb(jkk jkk) {
        super("BatteryChargingState");
        this.a = jkk.a;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.b = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("status", -1);
                boolean z = intExtra == 2 || intExtra == 5;
                Logger.b("PowerConnectionReceiver - status : %d", Integer.valueOf(intExtra));
                if (z) {
                    jjb.this.ag_();
                } else {
                    jjb.this.ah_();
                }
            }
        };
        this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* access modifiers changed from: protected */
    public final void d() {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }
}
