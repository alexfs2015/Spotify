package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: whs reason: default package */
public abstract class whs extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        whp.a((BroadcastReceiver) this, context);
    }
}
