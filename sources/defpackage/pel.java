package defpackage;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pel reason: default package */
final class pel {
    private static final int a = 2131430204;
    private final Application b;
    private final pfa c;
    private final NotificationManager d;
    private final spe e;

    public pel(Application application, pfa pfa, NotificationManager notificationManager, spe spe) {
        this.b = application;
        this.c = pfa;
        this.d = notificationManager;
        this.e = spe;
    }

    public final void a() {
        this.c.d();
        b();
    }

    private void b() {
        if (VERSION.SDK_INT >= 26) {
            this.d.createNotificationChannel(new NotificationChannel("com.spotify.music.features.preloadnotification.CHANNEL", this.b.getString(R.string.preload_notification_channel_title), 2));
        }
        this.d.notify(a, a(c()).b());
    }

    private c c() {
        return new c(this.b, "com.spotify.music.features.preloadnotification.CHANNEL");
    }

    private c a(c cVar) {
        PendingIntent d2 = d();
        c a2 = cVar.a((CharSequence) this.b.getString(R.string.preload_notification_title)).b((CharSequence) this.b.getString(R.string.preload_notification_text)).a((int) R.drawable.icn_notification).b(true).a(a(d2));
        a2.f = d2;
        return a2;
    }

    private a a(PendingIntent pendingIntent) {
        return new a(R.drawable.icn_download_header_waiting, this.b.getString(R.string.preload_notification_cta), pendingIntent);
    }

    private PendingIntent d() {
        Intent a2 = this.e.a(spd.a(ViewUris.t.toString()).a());
        a2.putExtra("android.intent.extra.REFERRER", Uri.parse("samsung-preload-notification"));
        return PendingIntent.getActivity(this.b, 0, a2, 0);
    }
}
