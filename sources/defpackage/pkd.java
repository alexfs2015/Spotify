package defpackage;

import android.app.NotificationManager;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: pkd reason: default package */
public final class pkd implements vcx {
    private final NotificationManager a;
    private final vcu b;

    public pkd(NotificationManager notificationManager, vcu vcu) {
        this.a = notificationManager;
        this.b = vcu;
    }

    public final boolean a(Intent intent) {
        return intent.hasExtra("push_data");
    }

    public final void b(Intent intent) {
        String str;
        pkm pkm = (pkm) intent.getParcelableExtra("push_data");
        String str2 = "Processing acton %s";
        if (pkm instanceof pkl) {
            pkl pkl = (pkl) pkm;
            Logger.b(str2, pkl);
            this.a.cancel(pkl.a());
            if (!pkl.e()) {
                this.b.b(pkl.b(), pkl.c(), pkl.d());
                str = "opened";
            } else {
                str = "quick_action_open_url";
            }
            this.b.a(str, pkl.b(), pkl.c(), pkl.d());
        } else if (pkm instanceof pkk) {
            pkk pkk = (pkk) pkm;
            Logger.b(str2, pkk);
            this.a.cancel(pkk.a());
            this.b.a("quick_action_open_push_settings", pkk.b(), pkk.c(), null);
        } else {
            Logger.e("Unrecognized PushNotificationAction %s", pkm);
        }
    }
}
