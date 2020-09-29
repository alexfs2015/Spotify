package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: tv reason: default package */
public abstract class tv<T> extends tw<T> {
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                tv.this.a(intent);
            }
        }
    };

    public abstract IntentFilter a();

    public abstract void a(Intent intent);

    static {
        sg.a("BrdcstRcvrCnstrntTrckr");
    }

    public tv(Context context, vb vbVar) {
        super(context, vbVar);
    }

    public final void c() {
        sg.a();
        String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        this.a.registerReceiver(this.c, a());
    }

    public final void d() {
        sg.a();
        String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        this.a.unregisterReceiver(this.c);
    }
}
