package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: tu reason: default package */
public final class tu implements tf {
    private static final String a = su.a("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final tj d;
    private final vg e;
    private final tt f;

    public tu(Context context, tj tjVar) {
        this(context, tjVar, (JobScheduler) context.getSystemService("jobscheduler"), new tt(context));
    }

    private tu(Context context, tj tjVar, JobScheduler jobScheduler, tt ttVar) {
        this.b = context;
        this.d = tjVar;
        this.c = jobScheduler;
        this.e = new vg(context);
        this.f = ttVar;
    }

    private static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            su.a().a(a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static List<Integer> a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a2 = a(context, jobScheduler);
        if (a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : a2) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                String str2 = "EXTRA_WORK_SPEC_ID";
                if (extras.containsKey(str2) && str.equals(extras.getString(str2))) {
                    arrayList.add(Integer.valueOf(jobInfo.getId()));
                }
            }
        }
        return arrayList;
    }

    private static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            su.a().a(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static void a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a2 = a(context, jobScheduler);
            if (a2 != null && !a2.isEmpty()) {
                for (JobInfo id : a2) {
                    a(jobScheduler, id.getId());
                }
            }
        }
    }

    private void a(ux uxVar, int i) {
        JobInfo a2 = this.f.a(uxVar, i);
        su.a();
        String.format("Scheduling work ID %s Job ID %s", new Object[]{uxVar.a, Integer.valueOf(i)});
        try {
            this.c.schedule(a2);
        } catch (IllegalStateException e2) {
            List a3 = a(this.b, this.c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(a3 != null ? a3.size() : 0), Integer.valueOf(this.d.c.j().c().size()), Integer.valueOf(this.d.b.a())});
            su.a().a(a, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            su.a().a(a, String.format("Unable to schedule %s", new Object[]{uxVar}), th);
        }
    }

    public static void b(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a2 = a(context, jobScheduler);
            if (a2 != null && !a2.isEmpty()) {
                for (JobInfo jobInfo : a2) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        a(jobScheduler, jobInfo.getId());
                    }
                }
            }
        }
    }

    public final void a(String str) {
        List<Integer> a2 = a(this.b, this.c, str);
        if (a2 != null && !a2.isEmpty()) {
            for (Integer intValue : a2) {
                a(this.c, intValue.intValue());
            }
            this.d.c.m().b(str);
        }
    }

    public final void a(ux... uxVarArr) {
        WorkDatabase workDatabase = this.d.c;
        int length = uxVarArr.length;
        int i = 0;
        while (i < length) {
            ux uxVar = uxVarArr[i];
            workDatabase.e();
            try {
                ux b2 = workDatabase.j().b(uxVar.a);
                String str = "Skipping scheduling ";
                if (b2 == null) {
                    su.a();
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(uxVar.a);
                    sb.append(" because it's no longer in the DB");
                    workDatabase.g();
                } else if (b2.b != State.ENQUEUED) {
                    su.a();
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(uxVar.a);
                    sb2.append(" because it is no longer enqueued");
                    workDatabase.g();
                } else {
                    ur a2 = workDatabase.m().a(uxVar.a);
                    int a3 = a2 != null ? a2.b : this.e.a(this.d.b.e, this.d.b.f);
                    if (a2 == null) {
                        this.d.c.m().a(new ur(uxVar.a, a3));
                    }
                    a(uxVar, a3);
                    if (VERSION.SDK_INT == 23) {
                        List a4 = a(this.b, this.c, uxVar.a);
                        if (a4 != null) {
                            int indexOf = a4.indexOf(Integer.valueOf(a3));
                            if (indexOf >= 0) {
                                a4.remove(indexOf);
                            }
                            a(uxVar, !a4.isEmpty() ? ((Integer) a4.get(0)).intValue() : this.e.a(this.d.b.e, this.d.b.f));
                        }
                    }
                    workDatabase.g();
                }
                i++;
            } finally {
                workDatabase.f();
            }
        }
    }
}
