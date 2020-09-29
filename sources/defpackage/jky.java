package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: jky reason: default package */
public final class jky extends jkj {
    private final Context a;
    private final ConnectivityManager b = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private BroadcastReceiver c;

    public jky(jkk jkk) {
        super("WifiIsConnected");
        this.a = jkk.a;
    }

    static /* synthetic */ void a(jky jky) {
        NetworkInfo activeNetworkInfo = jky.b.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        if (z) {
            jky.ag_();
        } else {
            jky.ah_();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                jky.a(jky.this);
            }
        };
        this.a.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* access modifiers changed from: protected */
    public final void d() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }
}
