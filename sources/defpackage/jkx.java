package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;

/* renamed from: jkx reason: default package */
public final class jkx extends jkj {
    private final Context a;
    private final jkf b;
    private final jkt c;
    private final ConnectivityManager f = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private BroadcastReceiver g;

    public jkx(jkk jkk, jkf jkf, jkt jkt) {
        super("WifiInUse");
        this.a = jkk.a;
        this.b = jkf;
        this.c = jkt;
    }

    static /* synthetic */ void a(jkx jkx) {
        NetworkInfo activeNetworkInfo = jkx.f.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        if (!z || (!jkx.b.e && !jkx.c.e)) {
            jkx.ah_();
        } else {
            jkx.ag_();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.g = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                jkx.a(jkx.this);
            }
        };
        this.a.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        AnonymousClass2 r0 = new jko() {
            public final void a() {
                jkx.a(jkx.this);
            }

            public final void b() {
                jkx.a(jkx.this);
            }
        };
        this.c.a(r0);
        this.b.a(r0);
        new Handler().post(new Runnable() {
            public final void run() {
                jkx.a(jkx.this);
            }
        });
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }
}
