package defpackage;

import android.content.Context;

/* renamed from: tr reason: default package */
public final class tr implements tf {
    private final Context a;

    static {
        su.a("SystemAlarmScheduler");
    }

    public tr(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(String str) {
        this.a.startService(tn.c(this.a, str));
    }

    public final void a(ux... uxVarArr) {
        for (ux uxVar : uxVarArr) {
            su.a();
            String.format("Scheduling work with workSpecId %s", new Object[]{uxVar.a});
            this.a.startService(tn.a(this.a, uxVar.a));
        }
    }
}
