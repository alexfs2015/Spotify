package com.spotify.music.features.spoton.receiver;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.spoton.service.SpotOnService;

public class SpotOnReceiver extends whs {
    private static final String b = SpotOnReceiver.class.getSimpleName();
    public vwu a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Logger.a("SpotOnReceiver.onReceive", new Object[0]);
        Intent intent2 = new Intent(context, SpotOnService.class);
        intent2.setAction(intent.getAction());
        String str = "com.spotify.music.features.spoton.extras.NAME";
        intent2.putExtra(intent.getStringExtra(str), str);
        this.a.a(context, intent2, b, new Object[0]);
    }
}
