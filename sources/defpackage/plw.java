package defpackage;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: plw reason: default package */
public final class plw implements wig<plv> {
    private final wzi<pml> a;
    private final wzi<AlarmManager> b;
    private final wzi<Application> c;

    public static plv a(pml pml, AlarmManager alarmManager, Application application) {
        return new plv(pml, alarmManager, application);
    }

    public final /* synthetic */ Object get() {
        return new plv((pml) this.a.get(), (AlarmManager) this.b.get(), (Application) this.c.get());
    }
}
