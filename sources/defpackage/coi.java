package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: coi reason: default package */
final class coi extends BroadcastReceiver {
    private final /* synthetic */ coh a;

    coi(coh coh) {
        this.a = coh;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
