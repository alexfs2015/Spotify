package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements so {
    private static final String a = sg.a("SystemJobService");
    private sv b;
    private final Map<String, JobParameters> c = new HashMap();

    public void onCreate() {
        super.onCreate();
        try {
            this.b = sv.a(getApplicationContext());
            this.b.f.a((so) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                sg.a();
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        sv svVar = this.b;
        if (svVar != null) {
            svVar.f.b((so) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r7.getTriggeredContentUris() == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r2.b = java.util.Arrays.asList(r7.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r7.getTriggeredContentAuthorities() == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r2.a = java.util.Arrays.asList(r7.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r2.c = r7.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r6.b.a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            sv r0 = r6.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
            defpackage.sg.a()
            r6.jobFinished(r7, r1)
            return r2
        L_0x000d:
            android.os.PersistableBundle r0 = r7.getExtras()
            if (r0 != 0) goto L_0x0021
            sg r7 = defpackage.sg.a()
            java.lang.String r0 = a
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "No extras in JobParameters."
            r7.a(r0, r3, r1)
            return r2
        L_0x0021:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x003b
            sg r7 = defpackage.sg.a()
            java.lang.String r0 = a
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r7.a(r0, r3, r1)
            return r2
        L_0x003b:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r6.c
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r6.c     // Catch:{ all -> 0x00a4 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x0054
            defpackage.sg.a()     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a4 }
            r1[r2] = r0     // Catch:{ all -> 0x00a4 }
            java.lang.String.format(r7, r1)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            return r2
        L_0x0054:
            defpackage.sg.a()     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "onStartJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a4 }
            r5[r2] = r0     // Catch:{ all -> 0x00a4 }
            java.lang.String.format(r4, r5)     // Catch:{ all -> 0x00a4 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r6.c     // Catch:{ all -> 0x00a4 }
            r2.put(r0, r7)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x009e
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r7.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0082
            android.net.Uri[] r3 = r7.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.b = r3
        L_0x0082:
            java.lang.String[] r3 = r7.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0092
            java.lang.String[] r3 = r7.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.a = r3
        L_0x0092:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x009e
            android.net.Network r7 = r7.getNetwork()
            r2.c = r7
        L_0x009e:
            sv r7 = r6.b
            r7.a(r0, r2)
            return r1
        L_0x00a4:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.b == null) {
            sg.a();
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            sg.a().a(a, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            sg.a().a(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        sg.a();
        String.format("onStopJob for %s", new Object[]{string});
        synchronized (this.c) {
            this.c.remove(string);
        }
        this.b.b(string);
        if (!this.b.f.c(string)) {
            return true;
        }
        return false;
    }

    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        sg.a();
        String.format("%s executed on JobScheduler", new Object[]{str});
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
