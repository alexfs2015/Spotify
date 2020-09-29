package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jvp reason: default package */
final class jvp extends jvn {
    private final Context a;
    private final Set<jvs> b = new HashSet();
    private final TelephonyManager c;
    private final ConnectivityManager d;
    private final PowerManager e;
    private final PhoneStateListener f = new PhoneStateListener() {
        public final void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            jvp.this.c();
        }
    };
    private final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            jvp.this.c();
        }
    };
    private final NetworkCallback h = new NetworkCallback() {
        public final void onAvailable(Network network) {
            jvp.this.c();
        }
    };

    jvp(Context context) {
        this.a = ((Context) fbp.a(context)).getApplicationContext();
        this.c = (TelephonyManager) this.a.getSystemService("phone");
        this.d = (ConnectivityManager) this.a.getSystemService("connectivity");
        this.e = (PowerManager) this.a.getSystemService("power");
        if (this.d != null) {
            this.d.registerNetworkCallback(new Builder().addCapability(12).addCapability(13).build(), this.h);
        }
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager != null) {
            telephonyManager.listen(this.f, 64);
        }
        this.a.registerReceiver(this.g, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    public final ConnectionType a() {
        if (this.e.isDeviceIdleMode() && !this.e.isIgnoringBatteryOptimizations(this.a.getPackageName())) {
            Logger.c("Connectivity status: NONE (idle)", new Object[0]);
            return ConnectionType.CONNECTION_TYPE_NONE;
        }
        ConnectionType a2 = jvt.a(this.d, this.c);
        Logger.c("Connectivity status: %s", a2.toString());
        return a2;
    }

    public final void a(jvs jvs) {
        this.b.add(jvs);
    }

    public final void b() {
        Logger.b("Ignoring hang-up request, not listening.", new Object[0]);
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
