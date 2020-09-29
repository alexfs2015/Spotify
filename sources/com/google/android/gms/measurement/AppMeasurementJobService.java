package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementJobService extends JobService implements eup {
    private eul<AppMeasurementJobService> a;

    private final eul<AppMeasurementJobService> a() {
        if (this.a == null) {
            this.a = new eul<>(this);
        }
        return this.a;
    }

    public final void a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        eul a2 = a();
        eqw q = ery.a((Context) a2.a, (eqr) null).q();
        String string = jobParameters.getExtras().getString("action");
        q.k.a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a2.a((Runnable) new eun(a2, q, jobParameters));
        }
        return true;
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
