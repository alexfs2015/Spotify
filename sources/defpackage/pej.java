package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.preloadnotification.PreloadNotificationReceiver;

/* renamed from: pej reason: default package */
final class pej {
    final AlarmManager a;
    private final pez b;
    private final Application c;
    private PendingIntent d;

    public pej(pez pez, AlarmManager alarmManager, Application application) {
        this.b = pez;
        this.a = alarmManager;
        this.c = application;
    }

    public final void a() {
        long a2 = this.b.a();
        if (a2 != Long.MAX_VALUE) {
            this.a.set(1, a2, b());
            return;
        }
        Logger.e("Tried to schedule notification even though it shouldn't be scheduled again.", new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    public PendingIntent b() {
        if (this.d == null) {
            Intent intent = new Intent(this.c, PreloadNotificationReceiver.class);
            intent.setAction("com.spotify.music.features.preloadnotification.ALARM");
            this.d = PendingIntent.getBroadcast(this.c, 101, intent, 134217728);
        }
        return this.d;
    }
}
