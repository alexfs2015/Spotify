package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cmz reason: default package */
public final class cmz extends BroadcastReceiver {
    private final /* synthetic */ cmu a;

    private cmz(cmu cmu) {
        this.a = cmu;
    }

    public /* synthetic */ cmz(cmu cmu, byte b) {
        this(cmu);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.d = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.d = false;
        }
    }
}
