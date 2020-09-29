package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: ply reason: default package */
public final class ply implements wig<plx> {
    private final wzi<Application> a;
    private final wzi<pmm> b;
    private final wzi<NotificationManager> c;
    private final wzi<szl> d;

    public static plx a(Application application, pmm pmm, NotificationManager notificationManager, szl szl) {
        return new plx(application, pmm, notificationManager, szl);
    }

    public final /* synthetic */ Object get() {
        return new plx((Application) this.a.get(), (pmm) this.b.get(), (NotificationManager) this.c.get(), (szl) this.d.get());
    }
}
