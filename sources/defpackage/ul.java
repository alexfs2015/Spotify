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

/* renamed from: ul reason: default package */
public final class ul extends uk<tw> {
    static final String c = su.a("NetworkStateTracker");
    private final ConnectivityManager d = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private b e;
    private a f;

    /* renamed from: ul$a */
    class a extends BroadcastReceiver {
        a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                su.a();
                String str = ul.c;
                ul ulVar = ul.this;
                ulVar.a(ulVar.b());
            }
        }
    }

    /* renamed from: ul$b */
    class b extends NetworkCallback {
        b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            su.a();
            String str = ul.c;
            String.format("Network capabilities changed: %s", new Object[]{networkCapabilities});
            ul ulVar = ul.this;
            ulVar.a(ulVar.b());
        }

        public final void onLost(Network network) {
            su.a();
            String str = ul.c;
            ul ulVar = ul.this;
            ulVar.a(ulVar.b());
        }
    }

    public ul(Context context, vp vpVar) {
        super(context, vpVar);
        if (e()) {
            this.e = new b();
        } else {
            this.f = new a();
        }
    }

    private static boolean e() {
        return VERSION.SDK_INT >= 24;
    }

    private boolean f() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.d.getNetworkCapabilities(this.d.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final tw b() {
        NetworkInfo activeNetworkInfo = this.d.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean f2 = f();
        boolean a2 = gx.a(this.d);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new tw(z2, f2, a2, z);
    }

    public final void c() {
        if (e()) {
            su.a();
            this.d.registerDefaultNetworkCallback(this.e);
            return;
        }
        su.a();
        this.a.registerReceiver(this.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void d() {
        if (e()) {
            try {
                su.a();
                this.d.unregisterNetworkCallback(this.e);
            } catch (IllegalArgumentException e2) {
                su.a().a(c, "Received exception while unregistering network callback", e2);
            }
        } else {
            su.a();
            this.a.unregisterReceiver(this.f);
        }
    }
}
