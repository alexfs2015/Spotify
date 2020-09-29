package defpackage;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: pmk reason: default package */
public final class pmk implements wig<AlarmManager> {
    private final wzi<Application> a;

    private pmk(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static pmk a(wzi<Application> wzi) {
        return new pmk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (AlarmManager) wil.a((AlarmManager) ((Application) this.a.get()).getSystemService("alarm"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
