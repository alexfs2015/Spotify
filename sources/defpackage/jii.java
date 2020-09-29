package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: jii reason: default package */
public final class jii extends jht {
    private final Context a;
    private final ConnectivityManager b = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private BroadcastReceiver c;

    public jii(jhu jhu) {
        super("WifiIsConnected");
        this.a = jhu.a;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                jii.a(jii.this);
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

    static /* synthetic */ void a(jii jii) {
        NetworkInfo activeNetworkInfo = jii.b.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        if (z) {
            jii.ag_();
        } else {
            jii.ah_();
        }
    }
}
