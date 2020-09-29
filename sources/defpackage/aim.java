package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aim reason: default package */
final class aim {
    static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    static final IntentFilter b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    static final IntentFilter c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    final AtomicBoolean d = new AtomicBoolean(false);
    final Context e;
    final BroadcastReceiver f = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            aim.this.h = false;
        }
    };
    final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            aim.this.h = true;
        }
    };
    /* access modifiers changed from: 0000 */
    public boolean h;

    public aim(Context context) {
        this.e = context;
    }
}
