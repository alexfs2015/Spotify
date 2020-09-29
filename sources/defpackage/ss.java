package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* renamed from: ss reason: default package */
public final class ss {
    static {
        sg.a("Schedulers");
    }

    /* JADX INFO: finally extract failed */
    public static void a(sb sbVar, WorkDatabase workDatabase, List<sr> list) {
        if (list != null && list.size() != 0) {
            uk j = workDatabase.j();
            workDatabase.e();
            try {
                List<uj> a = j.a(sbVar.a());
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (uj ujVar : a) {
                        j.b(ujVar.a, currentTimeMillis);
                    }
                }
                workDatabase.g();
                workDatabase.f();
                if (a.size() > 0) {
                    uj[] ujVarArr = (uj[]) a.toArray(new uj[0]);
                    for (sr a2 : list) {
                        a2.a(ujVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    static sr a(Context context, sv svVar) {
        if (VERSION.SDK_INT >= 23) {
            tg tgVar = new tg(context, svVar);
            ut.a(context, SystemJobService.class, true);
            sg.a();
            return tgVar;
        }
        sr a = a(context);
        if (a != null) {
            return a;
        }
        td tdVar = new td(context);
        ut.a(context, SystemAlarmService.class, true);
        sg.a();
        return tdVar;
    }

    private static sr a(Context context) {
        String str = "androidx.work.impl.background.gcm.GcmScheduler";
        try {
            sr srVar = (sr) Class.forName(str).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            sg.a();
            String.format("Created %s", new Object[]{str});
            return srVar;
        } catch (Throwable th) {
            sg.a();
            new Throwable[1][0] = th;
            return null;
        }
    }
}
