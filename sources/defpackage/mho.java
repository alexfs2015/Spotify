package defpackage;

import android.app.Application;

/* renamed from: mho reason: default package */
public final class mho {
    private final hit a;
    private final Application b;

    public mho(hit hit, Application application) {
        this.a = hit;
        this.b = application;
    }

    public final void a() {
        Application application = this.b;
        application.startService(this.a.a(application, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"));
    }
}
