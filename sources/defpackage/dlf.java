package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: dlf reason: default package */
final class dlf extends BroadcastReceiver {
    private final /* synthetic */ dld a;

    dlf(dld dld) {
        this.a = dld;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
