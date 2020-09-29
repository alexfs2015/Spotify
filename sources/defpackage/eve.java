package defpackage;

import android.app.job.JobParameters;

/* renamed from: eve reason: default package */
public final /* synthetic */ class eve implements Runnable {
    private final evc a;
    private final ern b;
    private final JobParameters c;

    public eve(evc evc, ern ern, JobParameters jobParameters) {
        this.a = evc;
        this.b = ern;
        this.c = jobParameters;
    }

    public final void run() {
        evc evc = this.a;
        ern ern = this.b;
        JobParameters jobParameters = this.c;
        ern.k.a("AppMeasurementJobService processed last upload request.");
        ((evg) evc.a).a(jobParameters);
    }
}
