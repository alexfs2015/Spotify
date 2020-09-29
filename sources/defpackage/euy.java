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

/* renamed from: euy reason: default package */
public final class euy extends evb {
    private final AlarmManager a = ((AlarmManager) m().getSystemService("alarm"));
    private final ewe c;
    private Integer d;

    protected euy(evc evc) {
        super(evc);
        this.c = new euz(this, evc.b, evc);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        this.a.cancel(w());
        if (VERSION.SDK_INT >= 24) {
            u();
        }
        return false;
    }

    private final void u() {
        JobScheduler jobScheduler = (JobScheduler) m().getSystemService("jobscheduler");
        int v = v();
        q().k.a("Cancelling job. JobID", Integer.valueOf(v));
        jobScheduler.cancel(v);
    }

    public final void a(long j) {
        j();
        Context m = m();
        if (!erp.a(m)) {
            q().j.a("Receiver not registered/enabled");
        }
        if (!evm.a(m)) {
            q().j.a("Service not registered/enabled");
        }
        e();
        long b = l().b() + j;
        if (j < Math.max(0, ((Long) eqm.E.a()).longValue()) && !this.c.b()) {
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
            ejn.a(m2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        q().k.a("Scheduling upload with AlarmManager");
        this.a.setInexactRepeating(2, b, Math.max(((Long) eqm.z.a()).longValue(), j), w());
    }

    private final int v() {
        if (this.d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(m().getPackageName());
            this.d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.d.intValue();
    }

    public final void e() {
        j();
        this.a.cancel(w());
        this.c.c();
        if (VERSION.SDK_INT >= 24) {
            u();
        }
    }

    private final PendingIntent w() {
        Context m = m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final /* bridge */ /* synthetic */ evi f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ evs g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ evz h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
