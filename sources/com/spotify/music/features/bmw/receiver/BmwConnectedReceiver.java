package com.spotify.music.features.bmw.receiver;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.bmw.service.BmwService;

public class BmwConnectedReceiver extends vtm {
    public vjo a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Logger.a("BmwConnectedReceiver.onReceive", new Object[0]);
        Intent intent2 = new Intent(context, BmwService.class);
        intent2.putExtras(intent);
        this.a.a(context, intent2, "BmwConnectedReceiver", new Object[0]);
    }
}
