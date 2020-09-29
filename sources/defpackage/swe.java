package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.spotify.music.R;

/* renamed from: swe reason: default package */
public final class swe {
    private final Context a;
    private final hfx b;

    public swe(Context context, hfx hfx) {
        this.a = context;
        this.b = hfx;
    }

    public final Notification a() {
        c cVar = new c(this.a, "spotify_updates_channel");
        cVar.f = this.b.d(this.a);
        c a2 = cVar.a((int) R.drawable.icn_notification).a((CharSequence) this.a.getString(R.string.notification_placeholder_fg_title));
        a2.r = fr.c(this.a, R.color.notification_bg_color);
        a2.s = 1;
        a2.a(new long[]{0}).h = -1;
        PendingIntent service = PendingIntent.getService(this.a, 0, this.b.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
        a a3 = new a().a(true);
        a3.e = service;
        cVar.a((e) a3);
        return cVar.b();
    }
}
