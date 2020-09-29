package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sv reason: default package */
public final class sv extends sl {
    public static final Object j = new Object();
    private static sv k;
    private static sv l;
    public Context a;
    public sb b;
    public WorkDatabase c;
    public vb d;
    public List<sr> e;
    public sq f;
    public uu g;
    public boolean h;
    public PendingResult i;

    @Deprecated
    public static sv b() {
        synchronized (j) {
            if (k != null) {
                sv svVar = k;
                return svVar;
            }
            sv svVar2 = l;
            return svVar2;
        }
    }

    public static sv a(Context context) {
        sv b2;
        synchronized (j) {
            b2 = b();
            if (b2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b) {
                    a(applicationContext, ((b) applicationContext).a());
                    b2 = a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return b2;
    }

    public static void a(Context context, sb sbVar) {
        synchronized (j) {
            if (k != null) {
                if (l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (k == null) {
                Context applicationContext = context.getApplicationContext();
                if (l == null) {
                    l = new sv(applicationContext, sbVar, new vc(sbVar.b));
                }
                k = l;
            }
        }
    }

    private sv(Context context, sb sbVar, vb vbVar) {
        this(context, sbVar, vbVar, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    private sv(Context context, sb sbVar, vb vbVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a2 = WorkDatabase.a(applicationContext, sbVar.b, z);
        sg.a((sg) new a(sbVar.d));
        List<sr> asList = Arrays.asList(new sr[]{ss.a(applicationContext, this), new sx(applicationContext, vbVar, this)});
        sq sqVar = new sq(context, sbVar, vbVar, a2, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = sbVar;
        this.d = vbVar;
        this.c = a2;
        this.e = asList;
        this.f = sqVar;
        this.g = new uu(this.a);
        this.h = false;
        this.d.a(new ForceStopRunnable(applicationContext2, this));
    }

    public final si a(String str, ExistingWorkPolicy existingWorkPolicy, List<sh> list) {
        return new st(this, str, existingWorkPolicy, list).a();
    }

    public final si a(String str) {
        uq a2 = uq.a(str, this, true);
        this.d.a(a2);
        return a2.a;
    }

    public final void a(String str, a aVar) {
        this.d.a(new uw(this, str, aVar));
    }

    public final void b(String str) {
        this.d.a(new ux(this, str));
    }

    public final void c() {
        if (VERSION.SDK_INT >= 23) {
            tg.a(this.a);
        }
        this.c.j().b();
        ss.a(this.b, this.c, this.e);
    }

    public final void a(PendingResult pendingResult) {
        synchronized (j) {
            this.i = pendingResult;
            if (this.h) {
                this.i.finish();
                this.i = null;
            }
        }
    }

    public final si a(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, sj sjVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new st(this, str, existingWorkPolicy, Collections.singletonList(sjVar)).a();
    }
}
