package defpackage;

import android.content.Context;

/* renamed from: td reason: default package */
public final class td implements sr {
    private final Context a;

    static {
        sg.a("SystemAlarmScheduler");
    }

    public td(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(uj... ujVarArr) {
        for (uj ujVar : ujVarArr) {
            sg.a();
            String.format("Scheduling work with workSpecId %s", new Object[]{ujVar.a});
            this.a.startService(sz.a(this.a, ujVar.a));
        }
    }

    public final void a(String str) {
        this.a.startService(sz.c(this.a, str));
    }
}
