package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class ReconnectionService extends Service {
    private static final ein a = new ein("ReconnectionService", 0);
    private brb b;

    public IBinder onBind(Intent intent) {
        try {
            return this.b.a(intent);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onBind", brb.class.getSimpleName());
            return null;
        }
    }

    public void onCreate() {
        bom a2 = bom.a(this);
        cbi c = a2.b().c();
        bxo.b("Must be called from the main thread.");
        this.b = eiw.a(this, c, a2.d.a());
        try {
            this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onCreate", brb.class.getSimpleName());
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onDestroy", brb.class.getSimpleName());
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.b.a(intent, i, i2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onStartCommand", brb.class.getSimpleName());
            return 1;
        }
    }
}
