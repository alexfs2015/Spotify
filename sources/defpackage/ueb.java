package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ueb reason: default package */
public final class ueb {
    private final mc a;
    private final Map<String, Intent> b = new HashMap();
    private final Context c;

    public ueb(Context context) {
        this.c = context;
        this.a = mc.a(context);
    }

    public final boolean a(Intent intent) {
        this.b.put(intent.getAction(), intent);
        return this.a.a(intent);
    }

    public final void b(Intent intent) {
        this.b.remove(intent.getAction());
    }

    public final Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        String action = intentFilter.getAction(0);
        Intent intent = (Intent) this.b.get(action);
        if (broadcastReceiver != null) {
            this.a.a(broadcastReceiver, intentFilter);
            if (this.b.containsKey(action)) {
                broadcastReceiver.onReceive(this.c, intent);
            }
        }
        return intent;
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        this.a.a(broadcastReceiver);
    }
}
