package com.spotify.music.features.bmw.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.bmw.service.BmwService;

public class DisconnectedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        context.stopService(new Intent(context, BmwService.class));
    }
}
