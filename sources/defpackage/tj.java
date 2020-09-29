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

/* renamed from: tj reason: default package */
public final class tj extends sz {
    public static final Object j = new Object();
    private static tj k;
    private static tj l;
    public Context a;
    public sp b;
    public WorkDatabase c;
    public vp d;
    public List<tf> e;
    public te f;
    public vi g;
    public boolean h;
    public PendingResult i;

    private tj(Context context, sp spVar, vp vpVar) {
        this(context, spVar, vpVar, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    private tj(Context context, sp spVar, vp vpVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a2 = WorkDatabase.a(applicationContext, spVar.b, z);
        su.a((su) new a(spVar.d));
        List<tf> asList = Arrays.asList(new tf[]{tg.a(applicationContext, this), new tl(applicationContext, vpVar, this)});
        te teVar = new te(context, spVar, vpVar, a2, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = spVar;
        this.d = vpVar;
        this.c = a2;
        this.e = asList;
        this.f = teVar;
        this.g = new vi(this.a);
        this.h = false;
        this.d.a(new ForceStopRunnable(applicationContext2, this));
    }

    public static tj a(Context context) {
        tj b2;
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

    public static void a(Context context, sp spVar) {
        synchronized (j) {
            if (k != null) {
                if (l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (k == null) {
                Context applicationContext = context.getApplicationContext();
                if (l == null) {
                    l = new tj(applicationContext, spVar, new vq(spVar.b));
                }
                k = l;
            }
        }
    }

    @Deprecated
    public static tj b() {
        synchronized (j) {
            if (k != null) {
                tj tjVar = k;
                return tjVar;
            }
            tj tjVar2 = l;
            return tjVar2;
        }
    }

    public final sw a(String str) {
        ve a2 = ve.a(str, this, true);
        this.d.a(a2);
        return a2.a;
    }

    public final sw a(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, sx sxVar) {
        return new th(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(sxVar)).a();
    }

    public final sw a(String str, ExistingWorkPolicy existingWorkPolicy, List<sv> list) {
        return new th(this, str, existingWorkPolicy, list).a();
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

    public final void a(String str, a aVar) {
        this.d.a(new vk(this, str, aVar));
    }

    public final void b(String str) {
        this.d.a(new vl(this, str));
    }

    public final void c() {
        if (VERSION.SDK_INT >= 23) {
            tu.a(this.a);
        }
        this.c.j().b();
        tg.a(this.b, this.c, this.e);
    }
}
