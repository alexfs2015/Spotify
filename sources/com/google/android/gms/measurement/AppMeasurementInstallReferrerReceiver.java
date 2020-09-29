package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements esj {
    private esg a;

    public final PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new esg(this);
        }
        this.a.a(context, intent);
    }
}
