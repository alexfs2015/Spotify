package defpackage;

import android.app.job.JobParameters;

/* renamed from: eun reason: default package */
public final /* synthetic */ class eun implements Runnable {
    private final eul a;
    private final eqw b;
    private final JobParameters c;

    public eun(eul eul, eqw eqw, JobParameters jobParameters) {
        this.a = eul;
        this.b = eqw;
        this.c = jobParameters;
    }

    public final void run() {
        eul eul = this.a;
        eqw eqw = this.b;
        JobParameters jobParameters = this.c;
        eqw.k.a("AppMeasurementJobService processed last upload request.");
        ((eup) eul.a).a(jobParameters);
    }
}
