package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: hhi reason: default package */
public final class hhi implements hhh {
    private final Context a;

    public hhi(Context context) {
        this.a = context;
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.a.registerReceiver(broadcastReceiver, intentFilter);
    }
}
