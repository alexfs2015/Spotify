package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: dix reason: default package */
final class dix extends BroadcastReceiver {
    private final /* synthetic */ div a;

    dix(div div) {
        this.a = div;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
