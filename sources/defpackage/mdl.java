package defpackage;

import android.app.Application;

/* renamed from: mdl reason: default package */
public final class mdl {
    private final hfx a;
    private final Application b;

    public mdl(hfx hfx, Application application) {
        this.a = hfx;
        this.b = application;
    }

    public final void a() {
        Application application = this.b;
        application.startService(this.a.a(application, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"));
    }
}
