package com.spotify.music.features.bmw.receiver;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

public class BmwConnectInstallReceiver extends whs {
    public lyc a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Logger.a("BmwConnectInstallReceiver.onReceive", new Object[0]);
        this.a.a(context);
    }
}
