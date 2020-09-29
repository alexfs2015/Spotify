package com.spotify.music.features.preloadnotification;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

public class PreloadNotificationReceiver extends whs {
    public plr a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (!fbo.a(action)) {
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1134844752) {
                if (hashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 1;
                }
            } else if (action.equals("com.spotify.music.features.preloadnotification.ALARM")) {
                c = 0;
            }
            if (c == 0) {
                this.a.b();
            } else if (c != 1) {
                Logger.d("Action not supported: %s", action);
            } else {
                this.a.b();
            }
        } else {
            Logger.d("Received intent without action", new Object[0]);
        }
    }
}
