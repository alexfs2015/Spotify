package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: tm reason: default package */
final class tm {
    static {
        su.a("Alarms");
    }

    private static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, tn.b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            su.a();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            alarmManager.cancel(service);
        }
    }

    private static void a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, tn.b(context, str), 1073741824);
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, j, service);
                return;
            }
            alarmManager.set(0, j, service);
        }
    }

    public static void a(Context context, tj tjVar, String str) {
        us m = tjVar.c.m();
        ur a = m.a(str);
        if (a != null) {
            a(context, str, a.b);
            su.a();
            String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str});
            m.b(str);
        }
    }

    public static void a(Context context, tj tjVar, String str, long j) {
        us m = tjVar.c.m();
        ur a = m.a(str);
        if (a != null) {
            a(context, str, a.b);
            a(context, str, a.b, j);
            return;
        }
        int a2 = new vg(context).a();
        m.a(new ur(str, a2));
        a(context, str, a2, j);
    }
}
