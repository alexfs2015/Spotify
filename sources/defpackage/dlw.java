package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: dlw reason: default package */
final class dlw extends BroadcastReceiver {
    private final /* synthetic */ dlu a;

    dlw(dlu dlu) {
        this.a = dlu;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
