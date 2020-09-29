package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;

/* renamed from: evp reason: default package */
public final class evp extends evs {
    private final AlarmManager a = ((AlarmManager) m().getSystemService("alarm"));
    private final ewv c;
    private Integer d;

    protected evp(evt evt) {
        super(evt);
        this.c = new evq(this, evt.b, evt);
    }

    private final void u() {
        JobScheduler jobScheduler = (JobScheduler) m().getSystemService("jobscheduler");
        int v = v();
        q().k.a("Cancelling job. JobID", Integer.valueOf(v));
        jobScheduler.cancel(v);
    }

    private final int v() {
        if (this.d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(m().getPackageName());
            this.d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.d.intValue();
    }

    private final PendingIntent w() {
        Context m = m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        j();
        Context m = m();
        if (!esg.a(m)) {
            q().j.a("Receiver not registered/enabled");
        }
        if (!ewd.a(m)) {
            q().j.a("Service not registered/enabled");
        }
        e();
        long b = l().b() + j;
        if (j < Math.max(0, ((Long) erd.E.a()).longValue()) && !this.c.b()) {
            q().k.a("Scheduling upload with DelayedRunnable");
            this.c.a(j);
        }
        if (VERSION.SDK_INT >= 24) {
            q().k.a("Scheduling upload with JobScheduler");
            Context m2 = m();
            ComponentName componentName = new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v = v();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(v, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            q().k.a("Scheduling job. JobID", Integer.valueOf(v));
            eke.a(m2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        q().k.a("Scheduling upload with AlarmManager");
        this.a.setInexactRepeating(2, b, Math.max(((Long) erd.z.a()).longValue(), j), w());
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        this.a.cancel(w());
        if (VERSION.SDK_INT >= 24) {
            u();
        }
        return false;
    }

    public final void e() {
        j();
        this.a.cancel(w());
        this.c.c();
        if (VERSION.SDK_INT >= 24) {
            u();
        }
    }

    public final /* bridge */ /* synthetic */ evz f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ewj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ ewq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }
}
