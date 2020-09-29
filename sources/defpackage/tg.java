package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* renamed from: tg reason: default package */
public final class tg {
    static {
        su.a("Schedulers");
    }

    private static tf a(Context context) {
        String str = "androidx.work.impl.background.gcm.GcmScheduler";
        try {
            tf tfVar = (tf) Class.forName(str).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            su.a();
            String.format("Created %s", new Object[]{str});
            return tfVar;
        } catch (Throwable th) {
            su.a();
            new Throwable[1][0] = th;
            return null;
        }
    }

    static tf a(Context context, tj tjVar) {
        if (VERSION.SDK_INT >= 23) {
            tu tuVar = new tu(context, tjVar);
            vh.a(context, SystemJobService.class, true);
            su.a();
            return tuVar;
        }
        tf a = a(context);
        if (a != null) {
            return a;
        }
        tr trVar = new tr(context);
        vh.a(context, SystemAlarmService.class, true);
        su.a();
        return trVar;
    }

    /* JADX INFO: finally extract failed */
    public static void a(sp spVar, WorkDatabase workDatabase, List<tf> list) {
        if (list != null && list.size() != 0) {
            uy j = workDatabase.j();
            workDatabase.e();
            try {
                List<ux> a = j.a(spVar.a());
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (ux uxVar : a) {
                        j.b(uxVar.a, currentTimeMillis);
                    }
                }
                workDatabase.g();
                workDatabase.f();
                if (a.size() > 0) {
                    ux[] uxVarArr = (ux[]) a.toArray(new ux[0]);
                    for (tf a2 : list) {
                        a2.a(uxVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
