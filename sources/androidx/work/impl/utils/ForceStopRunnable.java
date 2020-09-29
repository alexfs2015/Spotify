package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {
    private static final String a = su.a("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final tj d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = su.a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    su.a();
                    ForceStopRunnable.a(context);
                }
            }
        }
    }

    public ForceStopRunnable(Context context, tj tjVar) {
        this.c = context.getApplicationContext();
        this.d = tjVar;
    }

    private static PendingIntent a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, b(context), i);
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a2 = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, a2);
                return;
            }
            alarmManager.set(0, currentTimeMillis, a2);
        }
    }

    private boolean a() {
        if (VERSION.SDK_INT >= 23) {
            tu.b(this.c);
        }
        WorkDatabase workDatabase = this.d.c;
        uy j = workDatabase.j();
        workDatabase.e();
        try {
            List<ux> d2 = j.d();
            boolean z = !d2.isEmpty();
            if (z) {
                for (ux uxVar : d2) {
                    j.a(State.ENQUEUED, uxVar.a);
                    j.b(uxVar.a, -1);
                }
            }
            workDatabase.g();
            return z;
        } finally {
            workDatabase.f();
        }
    }

    private static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public final void run() {
        su.a();
        boolean a2 = a();
        boolean z = false;
        if (this.d.g.a().getBoolean("reschedule_needed", false)) {
            su.a();
            this.d.c();
            this.d.g.a(false);
        } else {
            if (a(this.c, 536870912) == null) {
                a(this.c);
                z = true;
            }
            if (z) {
                su.a();
                this.d.c();
            } else if (a2) {
                su.a();
                tg.a(this.d.b, this.d.c, this.d.e);
            }
        }
        tj tjVar = this.d;
        synchronized (tj.j) {
            tjVar.h = true;
            if (tjVar.i != null) {
                tjVar.i.finish();
                tjVar.i = null;
            }
        }
    }
}
