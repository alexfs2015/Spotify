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

/* renamed from: tg reason: default package */
public final class tg implements sr {
    private static final String a = sg.a("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final sv d;
    private final us e;
    private final tf f;

    public tg(Context context, sv svVar) {
        this(context, svVar, (JobScheduler) context.getSystemService("jobscheduler"), new tf(context));
    }

    private tg(Context context, sv svVar, JobScheduler jobScheduler, tf tfVar) {
        this.b = context;
        this.d = svVar;
        this.c = jobScheduler;
        this.e = new us(context);
        this.f = tfVar;
    }

    public final void a(uj... ujVarArr) {
        int i;
        WorkDatabase workDatabase = this.d.c;
        int length = ujVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            uj ujVar = ujVarArr[i2];
            workDatabase.e();
            try {
                uj b2 = workDatabase.j().b(ujVar.a);
                String str = "Skipping scheduling ";
                if (b2 == null) {
                    sg.a();
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(ujVar.a);
                    sb.append(" because it's no longer in the DB");
                    workDatabase.g();
                } else if (b2.b != State.ENQUEUED) {
                    sg.a();
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(ujVar.a);
                    sb2.append(" because it is no longer enqueued");
                    workDatabase.g();
                } else {
                    ud a2 = workDatabase.m().a(ujVar.a);
                    int a3 = a2 != null ? a2.b : this.e.a(this.d.b.e, this.d.b.f);
                    if (a2 == null) {
                        this.d.c.m().a(new ud(ujVar.a, a3));
                    }
                    a(ujVar, a3);
                    if (VERSION.SDK_INT == 23) {
                        List a4 = a(this.b, this.c, ujVar.a);
                        if (a4 != null) {
                            int indexOf = a4.indexOf(Integer.valueOf(a3));
                            if (indexOf >= 0) {
                                a4.remove(indexOf);
                            }
                            if (!a4.isEmpty()) {
                                i = ((Integer) a4.get(0)).intValue();
                            } else {
                                i = this.e.a(this.d.b.e, this.d.b.f);
                            }
                            a(ujVar, i);
                        }
                    }
                    workDatabase.g();
                }
                i2++;
            } finally {
                workDatabase.f();
            }
        }
    }

    private void a(uj ujVar, int i) {
        JobInfo a2 = this.f.a(ujVar, i);
        sg.a();
        String.format("Scheduling work ID %s Job ID %s", new Object[]{ujVar.a, Integer.valueOf(i)});
        try {
            this.c.schedule(a2);
        } catch (IllegalStateException e2) {
            List a3 = a(this.b, this.c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(a3 != null ? a3.size() : 0), Integer.valueOf(this.d.c.j().c().size()), Integer.valueOf(this.d.b.a())});
            sg.a().a(a, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            sg.a().a(a, String.format("Unable to schedule %s", new Object[]{ujVar}), th);
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

    private static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            sg.a().a(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
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

    private static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            sg.a().a(a, "getAllPendingJobs() is not reliable on this device.", th);
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
}
