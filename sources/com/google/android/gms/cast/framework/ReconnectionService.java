package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class ReconnectionService extends Service {
    private static final ehw a = new ehw("ReconnectionService", 0);
    private bqk b;

    public void onCreate() {
        bnv a2 = bnv.a(this);
        car c = a2.b().c();
        bwx.b("Must be called from the main thread.");
        this.b = eif.a(this, c, a2.d.a());
        try {
            this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onCreate", bqk.class.getSimpleName());
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.b.a(intent, i, i2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onStartCommand", bqk.class.getSimpleName());
            return 1;
        }
    }

    public IBinder onBind(Intent intent) {
        try {
            return this.b.a(intent);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onBind", bqk.class.getSimpleName());
            return null;
        }
    }

    public void onDestroy() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onDestroy", bqk.class.getSimpleName());
        }
        super.onDestroy();
    }
}
