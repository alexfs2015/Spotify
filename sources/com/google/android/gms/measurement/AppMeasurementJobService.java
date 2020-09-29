package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementJobService extends JobService implements evg {
    private evc<AppMeasurementJobService> a;

    private final evc<AppMeasurementJobService> a() {
        if (this.a == null) {
            this.a = new evc<>(this);
        }
        return this.a;
    }

    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final void a(Intent intent) {
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        evc a2 = a();
        ern q = esp.a((Context) a2.a, (eri) null).q();
        String string = jobParameters.getExtras().getString("action");
        q.k.a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a2.a((Runnable) new eve(a2, q, jobParameters));
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }
}
