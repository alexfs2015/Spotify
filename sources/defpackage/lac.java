package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: lac reason: default package */
public final class lac implements vua<NotificationManager> {
    private final wlc<Application> a;

    private lac(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static lac a(wlc<Application> wlc) {
        return new lac(wlc);
    }

    public final /* synthetic */ Object get() {
        return (NotificationManager) vuf.a((NotificationManager) ((Application) this.a.get()).getSystemService("notification"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
