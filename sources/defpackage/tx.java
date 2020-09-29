package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

/* renamed from: tx reason: default package */
public final class tx extends tw<ti> {
    static final String c = sg.a("NetworkStateTracker");
    private final ConnectivityManager d = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private b e;
    private a f;

    /* renamed from: tx$a */
    class a extends BroadcastReceiver {
        a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                sg.a();
                String str = tx.c;
                tx txVar = tx.this;
                txVar.a(txVar.b());
            }
        }
    }

    /* renamed from: tx$b */
    class b extends NetworkCallback {
        b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            sg.a();
            String str = tx.c;
            String.format("Network capabilities changed: %s", new Object[]{networkCapabilities});
            tx txVar = tx.this;
            txVar.a(txVar.b());
        }

        public final void onLost(Network network) {
            sg.a();
            String str = tx.c;
            tx txVar = tx.this;
            txVar.a(txVar.b());
        }
    }

    public tx(Context context, vb vbVar) {
        super(context, vbVar);
        if (e()) {
            this.e = new b();
        } else {
            this.f = new a();
        }
    }

    public final void c() {
        if (e()) {
            sg.a();
            this.d.registerDefaultNetworkCallback(this.e);
            return;
        }
        sg.a();
        this.a.registerReceiver(this.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void d() {
        if (e()) {
            try {
                sg.a();
                this.d.unregisterNetworkCallback(this.e);
            } catch (IllegalArgumentException e2) {
                sg.a().a(c, "Received exception while unregistering network callback", e2);
            }
        } else {
            sg.a();
            this.a.unregisterReceiver(this.f);
        }
    }

    private static boolean e() {
        return VERSION.SDK_INT >= 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ti b() {
        NetworkInfo activeNetworkInfo = this.d.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean f2 = f();
        boolean a2 = gx.a(this.d);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new ti(z2, f2, a2, z);
    }

    private boolean f() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.d.getNetworkCapabilities(this.d.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        return true;
    }
}
