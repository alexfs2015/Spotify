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

/* renamed from: jvo reason: default package */
final class jvo extends jvn {
    private static final Set<jvo> a = new CopyOnWriteArraySet();
    private final Set<jvs> b = new HashSet();
    private final TelephonyManager c;
    private final ConnectivityManager d;
    private final Context e;
    private boolean f;
    private final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            jvo.this.c();
        }
    };
    private final PhoneStateListener h = new PhoneStateListener() {
        public final void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            jvo.this.c();
        }
    };

    jvo(Context context) {
        this.e = ((Context) fbp.a(context)).getApplicationContext();
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
        a.add(this);
    }

    private synchronized void d() {
        if (!this.f) {
            Logger.b("Ignoring hang-up request, not listening.", new Object[0]);
            return;
        }
        a.remove(this);
        this.b.clear();
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

    public final ConnectionType a() {
        return jvt.a(this.d, this.c);
    }

    public final void a(jvs jvs) {
        this.b.add(jvs);
    }

    public final void b() {
        d();
    }

    public final void b(jvs jvs) {
        this.b.remove(jvs);
    }

    public final void c() {
        ConnectionType a2 = a();
        boolean isNetworkRoaming = this.c.isNetworkRoaming();
        for (jvs connectivityType : this.b) {
            connectivityType.setConnectivityType(a2, isNetworkRoaming);
        }
    }
}
