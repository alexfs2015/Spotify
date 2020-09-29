package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@cfp
/* renamed from: coy reason: default package */
public final class coy {
    private final BroadcastReceiver a = new coz(this);
    private final Map<BroadcastReceiver, IntentFilter> b = new WeakHashMap();
    private boolean c = false;
    private boolean d;
    private Context e;

    public final synchronized void a(Context context) {
        if (!this.c) {
            this.e = context.getApplicationContext();
            if (this.e == null) {
                this.e = context;
            }
            dtg.a(this.e);
            this.d = ((Boolean) dqe.f().a(dtg.cf)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.e.registerReceiver(this.a, intentFilter);
            this.c = true;
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(Context context, Intent intent) {
        for (Entry entry : this.b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }
}
