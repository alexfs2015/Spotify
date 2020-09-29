package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: jth reason: default package */
public final class jth {
    private static final Set<jth> b = new CopyOnWriteArraySet();
    final Set<jtk> a = new HashSet();
    private final TelephonyManager c;
    private final ConnectivityManager d;
    private final Context e;
    private boolean f;
    private final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            jth.this.b();
        }
    };
    private final PhoneStateListener h = new PhoneStateListener() {
        public final void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            jth.this.b();
        }
    };

    public jth(Context context) {
        this.e = (Context) fay.a(context);
        this.c = (TelephonyManager) this.e.getSystemService("phone");
        this.d = (ConnectivityManager) this.e.getSystemService("connectivity");
        if (this.f) {
            Logger.b("Ignoring listen request, already listening.", new Object[0]);
            return;
        }
        this.e.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.listen(this.h, 64);
        }
        this.f = true;
        b.add(this);
    }

    public synchronized void a() {
        if (!this.f) {
            Logger.b("Ignoring hang-up request, not listening.", new Object[0]);
            return;
        }
        b.remove(this);
        this.a.clear();
        try {
            this.e.unregisterReceiver(this.g);
        } catch (IllegalArgumentException e2) {
            Assertion.a("Should have been registered", (Throwable) e2);
        }
        if (this.c != null) {
            this.c.listen(this.h, 0);
        }
        this.f = false;
    }

    public final void a(jtk jtk) {
        this.a.add(jtk);
    }

    public final void b() {
        ConnectionType c2 = c();
        boolean isNetworkRoaming = this.c.isNetworkRoaming();
        for (jtk connectivityType : this.a) {
            connectivityType.setConnectivityType(c2, isNetworkRoaming);
        }
    }

    public final ConnectionType c() {
        return jtl.a(this.d, this.c);
    }
}
