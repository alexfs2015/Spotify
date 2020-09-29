package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ServerSocketFactory;

public class AppProtocolBluetoothService extends vtp implements defpackage.ijk.a, defpackage.ijn.a, defpackage.ijo.a {
    private static final String d = AppProtocolBluetoothService.class.getName();
    public htx a;
    public vjo b;
    public ijp c;
    private final List<a> e = new ArrayList(5);
    private ijk f;
    private long g = 5000;
    private ijn h;
    private final Runnable i = new Runnable() {
        public final void run() {
            AppProtocolBluetoothService.this.stopSelf();
        }
    };
    private final Handler j = new Handler();

    static class a {
        final String a;
        final String b;
        final boolean c;
        ijo d;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final void a() {
            ijo ijo = this.d;
            if (ijo != null) {
                ijo.a();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConnectionHolder{mDeviceName='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", mDeviceAddress='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", mStartedFromExplicitBroadcast=");
            sb.append(this.c);
            sb.append(", mSessionManager=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static Intent a(Context context, boolean z, BluetoothDevice bluetoothDevice) {
        Intent intent = new Intent(context, AppProtocolBluetoothService.class);
        intent.putExtra("start_server", z);
        intent.putExtra("device", bluetoothDevice);
        return intent;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, AppProtocolBluetoothService.class);
        intent.putExtra("start_server", true);
        intent.putExtra("device_address", str);
        intent.putExtra("device_name", str2);
        return intent;
    }

    public void onCreate() {
        super.onCreate();
        Logger.c("onCreate, setting foreground", new Object[0]);
        c();
        this.a.a((Service) this, d);
        this.h = new ijn(this);
        registerReceiver(this.h, ijn.a());
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            Logger.e("Bluetooth is not supported on this hardware platform", new Object[0]);
            b();
            return;
        }
        this.f = new ijk(new ijj(defaultAdapter, ServerSocketFactory.getDefault()), this, false);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        c();
        this.a.a((Service) this, d);
        this.b.b(intent);
        if (intent == null) {
            Logger.c("started with null intent", new Object[0]);
            if (d()) {
                Logger.c("started with null intent and stopping right away", new Object[0]);
                b();
            }
            return 2;
        }
        boolean booleanExtra = intent.getBooleanExtra("start_server", false);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("device");
        String stringExtra = intent.getStringExtra("device_address");
        String stringExtra2 = intent.getStringExtra("device_name");
        a aVar = null;
        if (stringExtra2 != null && stringExtra != null) {
            aVar = new a(stringExtra2, stringExtra, true);
        } else if (bluetoothDevice != null) {
            aVar = new a(bluetoothDevice.getName(), bluetoothDevice.getAddress(), false);
        }
        if (aVar != null) {
            if (booleanExtra) {
                this.e.add(aVar);
                this.f.a();
            } else {
                a b2 = b(aVar.b);
                if (b2 != null) {
                    b2.a();
                }
                Logger.c("categorized, not connecting", new Object[0]);
                String str = aVar.b;
                Iterator it = this.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a) it.next()).b.equals(str)) {
                            Logger.c("Remove connection for %s", str);
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (d()) {
                    b();
                }
            }
        }
        return 2;
    }

    private void b() {
        c();
        Logger.c("Schedule stop self", new Object[0]);
        this.j.postDelayed(this.i, this.g);
    }

    private void c() {
        Logger.c("Cancel stop self", new Object[0]);
        this.j.removeCallbacks(this.i);
    }

    public void onDestroy() {
        Logger.c("destroying service", new Object[0]);
        e();
        this.a.b(this, d);
        ijk ijk = this.f;
        if (ijk.a != null) {
            ijk.a.a();
            ijk.a = null;
        }
        if (ijk.b != null) {
            ijk.b.a();
            ijk.b = null;
        }
        if (ijk.c != null) {
            ijk.c.a();
            ijk.c = null;
        }
        if (ijk.d != null) {
            ijk.d.a();
            ijk.d = null;
        }
        unregisterReceiver(this.h);
        super.onDestroy();
    }

    public void onTaskRemoved(Intent intent) {
        Logger.c("task removed, action: %s", intent.getAction());
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            e();
        }
    }

    public final void a(ihz ihz, String str) {
        String str2 = str;
        a b2 = b(str2);
        if (b2 == null) {
            Assertion.b("No record of bluetooth device starting server");
            b();
            return;
        }
        String a2 = a(b2.a);
        this.a.a(d, getString(R.string.app_remote_notification_is_connecting, new Object[]{a2}));
        ijp ijp = this.c;
        ijo ijo = new ijo((Context) ijp.a(ijp.a.get(), 1), ijp.b, (ijf) ijp.a(ijp.c.get(), 3), (Scheduler) ijp.a(ijp.d.get(), 4), (Scheduler) ijp.a(ijp.e.get(), 5), (Scheduler) ijp.a(ijp.f.get(), 6), (ksw) ijp.a(ijp.g.get(), 7), (ijq) ijp.a(ijp.h.get(), 8), (ueb) ijp.a(ijp.i.get(), 9), (ihz) ijp.a(ihz, 10), (String) ijp.a(str2, 11), (defpackage.ijo.a) ijp.a(this, 12));
        ijo.b.a((defpackage.hhe.a<hne>) ijo);
        ijo.b.a();
        b2.d = ijo;
    }

    public final void a() {
        Logger.c("onBluetoothStateOff", new Object[0]);
        b();
    }

    private boolean d() {
        return this.e.isEmpty();
    }

    private void e() {
        for (a a2 : this.e) {
            a2.a();
        }
        this.e.clear();
    }

    private a b(String str) {
        for (a aVar : this.e) {
            if (aVar.b.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public final void a(ijo ijo) {
        String str = ijo.a;
        Logger.c("onSessionStarted %s", str);
        a b2 = b(str);
        if (b2 != null) {
            String a2 = a(b2.a);
            this.a.a(d, getString(R.string.app_remote_notification_is_connected, new Object[]{a2}));
        }
    }

    public final void b(ijo ijo) {
        String str = ijo.a;
        a b2 = b(str);
        if (b2 == null || !b2.c || !d()) {
            Logger.c("onSessionEnded %s - do nothing", str);
            return;
        }
        b();
    }

    private String a(String str) {
        return fax.a(str) ? getString(R.string.app_remote_notification_is_connected_fallback) : str;
    }
}
