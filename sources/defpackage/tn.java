package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tn reason: default package */
public final class tn implements tc {
    private static final String a = su.a("CommandHandler");
    private final Context b;
    private final Map<String, tc> c = new HashMap();
    private final Object d = new Object();

    tn(Context context) {
        this.b = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    private static boolean a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (int i = 0; i <= 0; i++) {
            if (bundle.get(strArr[0]) == null) {
                return false;
            }
        }
        return true;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Intent intent, int i, tq tqVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            su.a();
            String.format("Handling constraints changed %s", new Object[]{intent});
            to toVar = new to(this.b, i, tqVar);
            List<ux> c2 = toVar.c.f.c.j().c();
            ConstraintProxy.a(toVar.a, c2);
            toVar.d.a(c2);
            ArrayList<ux> arrayList = new ArrayList<>(c2.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (ux uxVar : c2) {
                String str = uxVar.a;
                if (currentTimeMillis >= uxVar.c() && (!uxVar.d() || toVar.d.a(str))) {
                    arrayList.add(uxVar);
                }
            }
            for (ux uxVar2 : arrayList) {
                String str2 = uxVar2.a;
                Intent b2 = b(toVar.a, str2);
                su.a();
                String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
                toVar.c.a((Runnable) new a(toVar.c, b2, toVar.b));
            }
            toVar.d.a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            su.a();
            String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
            tqVar.f.c();
        } else {
            if (!a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
                su.a().a(a, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
                return;
            }
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                su.a();
                String.format("Handling schedule work for %s", new Object[]{string});
                WorkDatabase workDatabase = tqVar.f.c;
                workDatabase.e();
                try {
                    ux b3 = workDatabase.j().b(string);
                    if (b3 == null) {
                        su.a();
                        StringBuilder sb = new StringBuilder("Skipping scheduling ");
                        sb.append(string);
                        sb.append(" because it's no longer in the DB");
                    } else if (b3.b.a()) {
                        su.a();
                        StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                        sb2.append(string);
                        sb2.append("because it is finished.");
                    } else {
                        long c3 = b3.c();
                        if (!b3.d()) {
                            su.a();
                            String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(c3)});
                            tm.a(this.b, tqVar.f, string, c3);
                        } else {
                            su.a();
                            String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(c3)});
                            tm.a(this.b, tqVar.f, string, c3);
                            tqVar.a((Runnable) new a(tqVar, a(this.b), i));
                        }
                        workDatabase.g();
                    }
                } finally {
                    workDatabase.f();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras = intent.getExtras();
                synchronized (this.d) {
                    String string2 = extras.getString("KEY_WORKSPEC_ID");
                    su.a();
                    String.format("Handing delay met for %s", new Object[]{string2});
                    if (!this.c.containsKey(string2)) {
                        tp tpVar = new tp(this.b, i, string2, tqVar);
                        this.c.put(string2, tpVar);
                        tpVar.f = vm.a(tpVar.a, String.format("%s (%s)", new Object[]{tpVar.c, Integer.valueOf(tpVar.b)}));
                        su.a();
                        String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{tpVar.f, tpVar.c});
                        tpVar.f.acquire();
                        ux b4 = tpVar.d.f.c.j().b(tpVar.c);
                        if (b4 == null) {
                            tpVar.a();
                        } else {
                            tpVar.g = b4.d();
                            if (!tpVar.g) {
                                su.a();
                                String.format("No constraints for %s", new Object[]{tpVar.c});
                                tpVar.a(Collections.singletonList(tpVar.c));
                            } else {
                                tpVar.e.a(Collections.singletonList(b4));
                            }
                        }
                    } else {
                        su.a();
                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string2});
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                su.a();
                String.format("Handing stopWork work for %s", new Object[]{string3});
                tqVar.f.b(string3);
                tm.a(this.b, tqVar.f, string3);
                tqVar.a(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string4 = extras2.getString("KEY_WORKSPEC_ID");
                boolean z = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                su.a();
                String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
                a(string4, z);
            } else {
                su.a();
                String.format("Ignoring intent %s", new Object[]{intent});
            }
        }
    }

    public final void a(String str, boolean z) {
        synchronized (this.d) {
            tc tcVar = (tc) this.c.remove(str);
            if (tcVar != null) {
                tcVar.a(str, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        boolean z;
        synchronized (this.d) {
            z = !this.c.isEmpty();
        }
        return z;
    }
}
