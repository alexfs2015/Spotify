package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: hty reason: default package */
public final class hty implements vua<htx> {
    private final wlc<Context> a;
    private final wlc<NotificationManager> b;

    private hty(wlc<Context> wlc, wlc<NotificationManager> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hty a(wlc<Context> wlc, wlc<NotificationManager> wlc2) {
        return new hty(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new htx((Context) this.a.get(), (NotificationManager) this.b.get());
    }
}
