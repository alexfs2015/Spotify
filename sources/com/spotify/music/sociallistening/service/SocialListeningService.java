package com.spotify.music.sociallistening.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeUnit;

public class SocialListeningService extends vto {
    public uau a;

    public SocialListeningService() {
        super("SocialListeningService");
    }

    public static void a(String str, Context context) {
        Intent intent = new Intent(context, SocialListeningService.class);
        intent.setAction("com.spotify.music.sociallistening.service.join");
        intent.putExtra("session_uri", str);
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if ("com.spotify.music.sociallistening.service.join".equals((String) fay.a(intent.getAction()))) {
            if (this.a.a((String) fay.a(intent.getStringExtra("session_uri"))).a(5000, TimeUnit.MILLISECONDS)) {
                Logger.b("social listening service: Joining session OK", new Object[0]);
                return;
            }
            Logger.e("social listening service: Failed to join", new Object[0]);
        }
    }
}
