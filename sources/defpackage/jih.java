package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;

/* renamed from: jih reason: default package */
public final class jih extends jht {
    private final Context a;
    private final jhp b;
    private final jid c;
    private final ConnectivityManager f = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private BroadcastReceiver g;

    public jih(jhu jhu, jhp jhp, jid jid) {
        super("WifiInUse");
        this.a = jhu.a;
        this.b = jhp;
        this.c = jid;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.g = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                jih.a(jih.this);
            }
        };
        this.a.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        AnonymousClass2 r0 = new jhy() {
            public final void a() {
                jih.a(jih.this);
            }

            public final void b() {
                jih.a(jih.this);
            }
        };
        this.c.a(r0);
        this.b.a(r0);
        new Handler().post(new Runnable() {
            public final void run() {
                jih.a(jih.this);
            }
        });
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }

    static /* synthetic */ void a(jih jih) {
        NetworkInfo activeNetworkInfo = jih.f.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        if (!z || (!jih.b.e && !jih.c.e)) {
            jih.ah_();
        } else {
            jih.ag_();
        }
    }
}
