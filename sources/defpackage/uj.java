package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: uj reason: default package */
public abstract class uj<T> extends uk<T> {
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                uj.this.a(intent);
            }
        }
    };

    static {
        su.a("BrdcstRcvrCnstrntTrckr");
    }

    public uj(Context context, vp vpVar) {
        super(context, vpVar);
    }

    public abstract IntentFilter a();

    public abstract void a(Intent intent);

    public final void c() {
        su.a();
        String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        this.a.registerReceiver(this.c, a());
    }

    public final void d() {
        su.a();
        String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        this.a.unregisterReceiver(this.c);
    }
}
