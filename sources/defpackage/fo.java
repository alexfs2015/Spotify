package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: fo reason: default package */
public final class fo extends JobServiceEngine implements b {
    private final ff a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public JobParameters c;
    /* access modifiers changed from: private */
    public volatile short d;

    /* renamed from: fo$a */
    final class a implements e {
        private JobWorkItem a;

        a(JobWorkItem jobWorkItem) {
            this.a = jobWorkItem;
        }

        public final Intent a() {
            return this.a.getIntent();
        }

        public final void b() {
            synchronized (fo.this.b) {
                if (fo.this.c != null) {
                    try {
                        fo.this.c.completeWork(this.a);
                    } catch (SecurityException e) {
                        Logger.d(e, "Security exception while completing work.", new Object[0]);
                    } catch (IllegalArgumentException e2) {
                        StringBuilder sb = new StringBuilder("SafeJobService lifecycle issue, state:");
                        sb.append(fo.this.d);
                        Assertion.a(sb.toString(), (Throwable) e2);
                    }
                }
            }
        }
    }

    fo(ff ffVar) {
        super(ffVar);
        this.a = ffVar;
        this.d = 43;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.a(false);
        this.d = 44;
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean a2 = this.a.a();
        synchronized (this.b) {
            this.c = null;
        }
        this.d = 45;
        return a2;
    }

    public final e b() {
        JobWorkItem jobWorkItem;
        synchronized (this.b) {
            if (this.c == null) {
                return null;
            }
            try {
                jobWorkItem = this.c.dequeueWork();
            } catch (SecurityException e) {
                Logger.d(e, "Security exception while dequeing work.", new Object[0]);
                jobWorkItem = null;
            }
        }
        if (jobWorkItem == null) {
            return null;
        }
        jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
        return new a(jobWorkItem);
    }
}
