package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public final class AppMeasurementService extends Service implements evg {
    private evc<AppMeasurementService> a;

    private final evc<AppMeasurementService> a() {
        if (this.a == null) {
            this.a = new evc<>(this);
        }
        return this.a;
    }

    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        evc a2 = a();
        if (intent == null) {
            a2.c().c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new esr(evt.a((Context) a2.a));
        }
        a2.c().f.a("onBind received unknown action", action);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        evc a2 = a();
        ern q = esp.a((Context) a2.a, (eri) null).q();
        if (intent == null) {
            q.f.a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            q.k.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a2.a((Runnable) new evd(a2, i2, q, intent));
            }
        }
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }
}
