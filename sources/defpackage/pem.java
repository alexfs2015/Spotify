package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: pem reason: default package */
public final class pem implements vua<pel> {
    private final wlc<Application> a;
    private final wlc<pfa> b;
    private final wlc<NotificationManager> c;
    private final wlc<spe> d;

    public static pel a(Application application, pfa pfa, NotificationManager notificationManager, spe spe) {
        return new pel(application, pfa, notificationManager, spe);
    }

    public final /* synthetic */ Object get() {
        return new pel((Application) this.a.get(), (pfa) this.b.get(), (NotificationManager) this.c.get(), (spe) this.d.get());
    }
}
