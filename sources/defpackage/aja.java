package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aja reason: default package */
final class aja {
    static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    static final IntentFilter b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    static final IntentFilter c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    final AtomicBoolean d = new AtomicBoolean(false);
    final Context e;
    final BroadcastReceiver f = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            aja.this.h = false;
        }
    };
    final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            aja.this.h = true;
        }
    };
    /* access modifiers changed from: 0000 */
    public boolean h;

    public aja(Context context) {
        this.e = context;
    }
}
