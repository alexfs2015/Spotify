package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public final class AppMeasurementService extends Service implements eup {
    private eul<AppMeasurementService> a;

    private final eul<AppMeasurementService> a() {
        if (this.a == null) {
            this.a = new eul<>(this);
        }
        return this.a;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        eul a2 = a();
        eqw q = ery.a((Context) a2.a, (eqr) null).q();
        if (intent == null) {
            q.f.a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            q.k.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a2.a((Runnable) new eum(a2, i2, q, intent));
            }
        }
        return 2;
    }

    public final IBinder onBind(Intent intent) {
        eul a2 = a();
        if (intent == null) {
            a2.c().c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new esa(evc.a((Context) a2.a));
        }
        a2.c().f.a("onBind received unknown action", action);
        return null;
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }
}
