package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementReceiver extends kw implements ers {
    private erp a;

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new erp(this);
        }
        this.a.a(context, intent);
    }

    public final void a(Context context, Intent intent) {
        a_(context, intent);
    }

    public final PendingResult a() {
        return goAsync();
    }
}
