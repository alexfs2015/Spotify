package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: djo reason: default package */
final class djo extends BroadcastReceiver {
    private final /* synthetic */ djm a;

    djo(djm djm) {
        this.a = djm;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
