package com.spotify.mobile.android.service.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;

public class ExternalIntegrationService extends vtp {
    public hob a;

    public IBinder onBind(Intent intent) {
        return this.a.c();
    }

    public void onCreate() {
        super.onCreate();
        Logger.a("ExternalIntegrationService.onCreate", new Object[0]);
        this.a.a();
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.b("ExternalIntegrationService.onDestroy", new Object[0]);
        this.a.b();
    }

    public static void a(Context context) {
        Logger.b("ExternalIntegrationService.stopService", new Object[0]);
        mc.a(context).a(new Intent("com.spotify.mobile.android.service.media.ACTION_DISCONNECT_CLIENTS"));
    }
}
