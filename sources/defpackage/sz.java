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

/* renamed from: sz reason: default package */
public final class sz implements so {
    private static final String a = sg.a("CommandHandler");
    private final Context b;
    private final Map<String, so> c = new HashMap();
    private final Object d = new Object();

    static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
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

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    sz(Context context) {
        this.b = context;
    }

    public final void a(String str, boolean z) {
        synchronized (this.d) {
            so soVar = (so) this.c.remove(str);
            if (soVar != null) {
                soVar.a(str, z);
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

    /* access modifiers changed from: 0000 */
    public final void a(Intent intent, int i, tc tcVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            sg.a();
            String.format("Handling constraints changed %s", new Object[]{intent});
            ta taVar = new ta(this.b, i, tcVar);
            List<uj> c2 = taVar.c.f.c.j().c();
            ConstraintProxy.a(taVar.a, c2);
            taVar.d.a(c2);
            ArrayList<uj> arrayList = new ArrayList<>(c2.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (uj ujVar : c2) {
                String str = ujVar.a;
                if (currentTimeMillis >= ujVar.c() && (!ujVar.d() || taVar.d.a(str))) {
                    arrayList.add(ujVar);
                }
            }
            for (uj ujVar2 : arrayList) {
                String str2 = ujVar2.a;
                Intent b2 = b(taVar.a, str2);
                sg.a();
                String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
                taVar.c.a((Runnable) new a(taVar.c, b2, taVar.b));
            }
            taVar.d.a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            sg.a();
            String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
            tcVar.f.c();
        } else {
            if (!a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
                sg.a().a(a, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
                return;
            }
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                sg.a();
                String.format("Handling schedule work for %s", new Object[]{string});
                WorkDatabase workDatabase = tcVar.f.c;
                workDatabase.e();
                try {
                    uj b3 = workDatabase.j().b(string);
                    if (b3 == null) {
                        sg.a();
                        StringBuilder sb = new StringBuilder("Skipping scheduling ");
                        sb.append(string);
                        sb.append(" because it's no longer in the DB");
                    } else if (b3.b.a()) {
                        sg.a();
                        StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                        sb2.append(string);
                        sb2.append("because it is finished.");
                    } else {
                        long c3 = b3.c();
                        if (!b3.d()) {
                            sg.a();
                            String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(c3)});
                            sy.a(this.b, tcVar.f, string, c3);
                        } else {
                            sg.a();
                            String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(c3)});
                            sy.a(this.b, tcVar.f, string, c3);
                            tcVar.a((Runnable) new a(tcVar, a(this.b), i));
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
                    sg.a();
                    String.format("Handing delay met for %s", new Object[]{string2});
                    if (!this.c.containsKey(string2)) {
                        tb tbVar = new tb(this.b, i, string2, tcVar);
                        this.c.put(string2, tbVar);
                        tbVar.f = uy.a(tbVar.a, String.format("%s (%s)", new Object[]{tbVar.c, Integer.valueOf(tbVar.b)}));
                        sg.a();
                        String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{tbVar.f, tbVar.c});
                        tbVar.f.acquire();
                        uj b4 = tbVar.d.f.c.j().b(tbVar.c);
                        if (b4 == null) {
                            tbVar.a();
                        } else {
                            tbVar.g = b4.d();
                            if (!tbVar.g) {
                                sg.a();
                                String.format("No constraints for %s", new Object[]{tbVar.c});
                                tbVar.a(Collections.singletonList(tbVar.c));
                            } else {
                                tbVar.e.a(Collections.singletonList(b4));
                            }
                        }
                    } else {
                        sg.a();
                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string2});
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                sg.a();
                String.format("Handing stopWork work for %s", new Object[]{string3});
                tcVar.f.b(string3);
                sy.a(this.b, tcVar.f, string3);
                tcVar.a(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string4 = extras2.getString("KEY_WORKSPEC_ID");
                boolean z = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                sg.a();
                String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
                a(string4, z);
            } else {
                sg.a();
                String.format("Ignoring intent %s", new Object[]{intent});
            }
        }
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
}
