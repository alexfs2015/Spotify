package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;

/* renamed from: jgm reason: default package */
public final class jgm extends jht {
    private final Context a;
    private BroadcastReceiver b;

    public jgm(jhu jhu) {
        super("BatteryChargingState");
        this.a = jhu.a;
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
                    jgm.this.ag_();
                } else {
                    jgm.this.ah_();
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
