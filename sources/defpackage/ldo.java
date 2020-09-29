package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: ldo reason: default package */
public final class ldo implements wig<NotificationManager> {
    private final wzi<Application> a;

    private ldo(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static ldo a(wzi<Application> wzi) {
        return new ldo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (NotificationManager) wil.a((NotificationManager) ((Application) this.a.get()).getSystemService("notification"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
