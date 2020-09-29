package com.spotify.pushnotifications;

import android.app.Service;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import java.util.Map;

public class SpotifyFirebaseMessagingService extends FirebaseMessagingService {
    public vpr b;
    public vpv c;

    public final void a(fir fir) {
        if (!fir.a().isEmpty()) {
            Logger.b("Message data payload: %s", fir.a());
            Map a = fir.a();
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

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        vpv vpv = this.c;
        if (vpv != null) {
            vpv.b();
        }
    }
}
