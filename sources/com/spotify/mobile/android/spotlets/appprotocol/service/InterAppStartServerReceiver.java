package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

public class InterAppStartServerReceiver extends vtm {
    public vjo a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        boolean equals = "com.spotify.music.service.bluetooth.action.START_APP_PROTOCOL_SERVER".equals(intent.getAction());
        String stringExtra = intent.getStringExtra("device_name");
        String stringExtra2 = intent.getStringExtra("device_address");
        Logger.c("onReceive start server: %s", Boolean.valueOf(equals));
        if (equals && stringExtra2 != null) {
            this.a.a(context, AppProtocolBluetoothService.a(context, stringExtra2, stringExtra), "InterAppStartServerReceiver", new Object[0]);
        }
    }
}
