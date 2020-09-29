package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: hem reason: default package */
public final class hem implements hel {
    private final Context a;

    public hem(Context context) {
        this.a = context;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
    }
}
