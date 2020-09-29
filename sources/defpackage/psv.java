package defpackage;

import android.app.NotificationManager;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: psv reason: default package */
public final class psv implements vpu {
    private final NotificationManager a;
    private final vpn b;
    private final puc c;

    public psv(NotificationManager notificationManager, vpn vpn, puc puc) {
        this.a = notificationManager;
        this.b = vpn;
        this.c = puc;
    }

    public final boolean a(Intent intent) {
        return intent.hasExtra("push_data");
    }

    public final void b(Intent intent) {
        pte pte = (pte) intent.getParcelableExtra("push_data");
        String str = "Processing acton %s";
        if (pte instanceof ptd) {
            ptd ptd = (ptd) pte;
            Logger.b(str, ptd);
            this.a.cancel(ptd.a());
            if (!ptd.e()) {
                this.b.b(ptd.b(), ptd.c(), ptd.d());
                this.b.a("opened", ptd.b(), ptd.c(), ptd.d());
                this.c.a("PRIMARY_ACTION", ptd.b(), ptd.c(), ptd.d());
            } else {
                this.b.a("quick_action_open_url", ptd.b(), ptd.c(), ptd.d());
                this.c.a("OPEN_URL", ptd.b(), ptd.c(), ptd.d());
            }
        } else if (pte instanceof ptc) {
            ptc ptc = (ptc) pte;
            Logger.b(str, ptc);
            this.a.cancel(ptc.a());
            this.b.a("quick_action_open_push_settings", ptc.b(), ptc.c(), null);
            this.c.a("PUSH_SETTINGS", ptc.b(), ptc.c(), null);
        } else {
            Logger.e("Unrecognized PushNotificationAction %s", pte);
        }
    }
}
