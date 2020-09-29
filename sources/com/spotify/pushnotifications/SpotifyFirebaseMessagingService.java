package com.spotify.pushnotifications;

import android.app.Service;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import java.util.Map;

public class SpotifyFirebaseMessagingService extends FirebaseMessagingService {
    public vct b;
    public vcy c;

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        vcy vcy = this.c;
        if (vcy != null) {
            vcy.b();
        }
    }

    public final void a(fhx fhx) {
        if (!fhx.a().isEmpty()) {
            Logger.b("Message data payload: %s", fhx.a());
            Map a = fhx.a();
            if ("notification".equals(a.get(MoatAdEvent.EVENT_TYPE))) {
                this.b.a(a);
            }
            return;
        }
        Logger.e("Received push notification with empty data", new Object[0]);
    }

    public final void a(String str) {
        Logger.b("Refreshed token from firebase: %s", str);
        this.c.a(str);
    }
}
