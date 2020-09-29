package defpackage;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: pek reason: default package */
public final class pek implements vua<pej> {
    private final wlc<pez> a;
    private final wlc<AlarmManager> b;
    private final wlc<Application> c;

    public static pej a(pez pez, AlarmManager alarmManager, Application application) {
        return new pej(pez, alarmManager, application);
    }

    public final /* synthetic */ Object get() {
        return new pej((pez) this.a.get(), (AlarmManager) this.b.get(), (Application) this.c.get());
    }
}
