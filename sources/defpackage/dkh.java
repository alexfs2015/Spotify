package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: dkh reason: default package */
final class dkh extends BroadcastReceiver {
    private final /* synthetic */ dkg a;

    dkh(dkg dkg) {
        this.a = dkg;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
