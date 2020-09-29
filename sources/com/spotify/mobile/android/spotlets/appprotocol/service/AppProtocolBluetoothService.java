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

public class AppProtocolBluetoothService extends whv implements defpackage.ilx.a, defpackage.ima.a, defpackage.imb.a {
    private static final String g = AppProtocolBluetoothService.class.getName();
    public hwj a;
    public vwu b;
    public imc c;
    public jtz d;
    public hjw e;
    public jty f;
    private final List<a> h = new ArrayList(5);
    private ilx i;
    private long j = 5000;
    private ima k;
    private final Runnable l = new Runnable() {
        public final void run() {
            AppProtocolBluetoothService.this.stopSelf();
        }
    };
    private final Handler m = new Handler();

    static class a {
        final String a;
        final String b;
        final boolean c;
        imb d;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final void a() {
            imb imb = this.d;
            if (imb != null) {
                imb.a();
            }
        }

        public final String toString() {
            String str = "NestDmrcaevnd{e/H=neoomlino/eCc";
            StringBuilder sb = new StringBuilder("ConnectionHolder{mDeviceName='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", mDeviceAddress='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", mStartedFromExplicitBroadcast=");
            sb.append(this.c);
            String str2 = "nremSseMgnia=sam o";
            sb.append(", mSessionManager=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, AppProtocolBluetoothService.class);
        intent.putExtra("start_server", true);
        String str3 = "eesdad_rsidvsc";
        intent.putExtra("device_address", str);
        String str4 = "mecmdeinaev";
        intent.putExtra("device_name", str2);
        return intent;
    }

    public static Intent a(Context context, boolean z, BluetoothDevice bluetoothDevice) {
        Class<AppProtocolBluetoothService> cls = AppProtocolBluetoothService.class;
        Intent intent = new Intent(context, AppProtocolBluetoothService.class);
        String str = "srveoet_rasr";
        intent.putExtra("start_server", z);
        String str2 = "dceieb";
        intent.putExtra("device", bluetoothDevice);
        return intent;
    }

    private String a(String str) {
        if (fbo.a(str)) {
            str = getString(R.string.app_remote_notification_is_connected_fallback);
        }
        return str;
    }

    private a b(String str) {
        for (a aVar : this.h) {
            if (aVar.b.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void b() {
        c();
        String str = "sotdlebel hSfusep ";
        Logger.c("Schedule stop self", new Object[0]);
        this.m.postDelayed(this.l, this.j);
    }

    private void c() {
        Logger.c("Cancel stop self", new Object[0]);
        this.m.removeCallbacks(this.l);
    }

    private boolean d() {
        return this.h.isEmpty();
    }

    private void e() {
        for (a a2 : this.h) {
            a2.a();
        }
        this.h.clear();
    }

    public final void a() {
        String str = "BtteohftlftOotSneou";
        Logger.c("onBluetoothStateOff", new Object[0]);
        b();
    }

    public final void a(ikm ikm, String str) {
        String str2 = str;
        String str3 = str;
        a b2 = b(str3);
        if (b2 == null) {
            String str4 = "e fcrgunpveot seodoaroeNoiisdevbet trc  lrrh ";
            Assertion.b("No record of bluetooth device starting server");
            b();
            return;
        }
        String a2 = a(b2.a);
        this.a.a(g, getString(R.string.app_remote_notification_is_connecting, new Object[]{a2}));
        imc imc = this.c;
        jtz jtz = this.d;
        hjw hjw = this.e;
        jty jty = this.f;
        Object a3 = imc.a(imc.a.get(), 1);
        Object obj = a3;
        Context context = (Context) a3;
        wzi<ilk> wzi = imc.b;
        Object a4 = imc.a(imc.c.get(), 3);
        Object obj2 = a4;
        ils ils = (ils) a4;
        Scheduler scheduler = (Scheduler) imc.a(imc.d.get(), 4);
        Scheduler scheduler2 = (Scheduler) imc.a(imc.e.get(), 5);
        Scheduler scheduler3 = (Scheduler) imc.a(imc.f.get(), 6);
        kwf kwf = (kwf) imc.a(imc.g.get(), 7);
        a aVar = b2;
        a aVar2 = b2;
        imd imd = (imd) imc.a(imc.h.get(), 8);
        mip mip = (mip) imc.a(imc.i.get(), 9);
        ikm ikm2 = (ikm) imc.a(ikm, 10);
        Object a5 = imc.a(jtz, 11);
        Object obj3 = a5;
        jtz jtz2 = (jtz) a5;
        Object a6 = imc.a(str3, 12);
        Object obj4 = a6;
        String str5 = (String) a6;
        defpackage.imb.a aVar3 = (defpackage.imb.a) imc.a(this, 13);
        Object a7 = imc.a(hjw, 14);
        Object obj5 = a7;
        hjw hjw2 = (hjw) a7;
        Object a8 = imc.a(jty, 15);
        Object obj6 = a8;
        imb imb = r8;
        imb imb2 = r8;
        kwf kwf2 = kwf;
        imb imb3 = new imb(context, wzi, ils, scheduler, scheduler2, scheduler3, kwf, imd, mip, ikm2, jtz2, str5, aVar3, hjw2, (jty) a8);
        imb2.b.a((defpackage.hjy.a<hpt>) imb2);
        imb2.b.a();
        aVar2.d = imb2;
    }

    public final void a(imb imb) {
        String str = imb.a;
        String str2 = "osnaeesoitt%sS Sdnt";
        Logger.c("onSessionStarted %s", str);
        a b2 = b(str);
        if (b2 != null) {
            String a2 = a(b2.a);
            this.a.a(g, getString(R.string.app_remote_notification_is_connected, new Object[]{a2}));
        }
    }

    public final void b(imb imb) {
        String str = imb.a;
        a b2 = b(str);
        if (b2 == null || !b2.c || !d()) {
            Logger.c("onSessionEnded %s - do nothing", str);
            return;
        }
        b();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        String str = "rtsnetono,dfitn eg srerCogae";
        Logger.c("onCreate, setting foreground", new Object[0]);
        c();
        this.a.a((Service) this, g);
        this.k = new ima(this);
        registerReceiver(this.k, ima.a());
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            Logger.e("Bluetooth is not supported on this hardware platform", new Object[0]);
            b();
            return;
        }
        this.i = new ilx(new ilw(defaultAdapter, ServerSocketFactory.getDefault()), this, false);
    }

    public void onDestroy() {
        Logger.c("destroying service", new Object[0]);
        e();
        this.a.b(this, g);
        ilx ilx = this.i;
        if (ilx.a != null) {
            ilx.a.a();
            ilx.a = null;
        }
        if (ilx.b != null) {
            ilx.b.a();
            ilx.b = null;
        }
        if (ilx.c != null) {
            ilx.c.a();
            ilx.c = null;
        }
        if (ilx.d != null) {
            ilx.d.a();
            ilx.d = null;
        }
        unregisterReceiver(this.k);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        c();
        this.a.a((Service) this, g);
        this.b.b(intent);
        boolean z = true & false;
        if (intent == null) {
            String str = "ritminln  tdl aetwhuetnt";
            Logger.c("started with null intent", new Object[0]);
            if (d()) {
                String str2 = "ronpo htiga w nlntiatlnaihydtgtu es is pt atdrew";
                Logger.c("started with null intent and stopping right away", new Object[0]);
                b();
            }
            return 2;
        }
        String str3 = "stevab_rrers";
        boolean booleanExtra = intent.getBooleanExtra("start_server", false);
        String str4 = "beiedc";
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("device");
        String str5 = "ced_drvtaiseds";
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
                this.h.add(aVar);
                this.i.a();
            } else {
                a b2 = b(aVar.b);
                if (b2 != null) {
                    b2.a();
                }
                Logger.c("categorized, not connecting", new Object[0]);
                String str6 = aVar.b;
                Iterator it = this.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a) it.next()).b.equals(str6)) {
                            Object[] objArr = {str6};
                            String str7 = "fniRms  pe no%ecvrctoneo";
                            Logger.c("Remove connection for %s", objArr);
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

    public void onTaskRemoved(Intent intent) {
        String str = " room%se tnac:e,taisvt d";
        Logger.c("task removed, action: %s", intent.getAction());
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            e();
        }
    }
}
