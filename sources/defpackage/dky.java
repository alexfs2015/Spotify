package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: dky reason: default package */
final class dky extends BroadcastReceiver {
    private final /* synthetic */ dkx a;

    dky(dkx dkx) {
        this.a = dkx;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
