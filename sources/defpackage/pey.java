package defpackage;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: pey reason: default package */
public final class pey implements vua<AlarmManager> {
    private final wlc<Application> a;

    private pey(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static pey a(wlc<Application> wlc) {
        return new pey(wlc);
    }

    public final /* synthetic */ Object get() {
        return (AlarmManager) vuf.a((AlarmManager) ((Application) this.a.get()).getSystemService("alarm"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
