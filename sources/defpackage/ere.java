package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ere reason: default package */
class ere extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public final evc a;
    private boolean b;
    private boolean c;

    ere(evc evc) {
        bwx.a(evc);
        this.a = evc;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.h();
        String action = intent.getAction();
        this.a.q().k.a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = this.a.c().e();
            if (this.c != e) {
                this.c = e;
                this.a.p().a((Runnable) new erg(this, e));
            }
            return;
        }
        this.a.q().f.a("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void a() {
        this.a.h();
        this.a.p().c();
        if (!this.b) {
            this.a.m().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.c = this.a.c().e();
            this.a.q().k.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
            this.b = true;
        }
    }

    public final void b() {
        this.a.h();
        this.a.p().c();
        this.a.p().c();
        if (this.b) {
            this.a.q().k.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.m().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.q().c.a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    static {
        ere.class.getName();
    }
}
