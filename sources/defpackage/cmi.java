package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cmi reason: default package */
public final class cmi extends BroadcastReceiver {
    private final /* synthetic */ cmd a;

    private cmi(cmd cmd) {
        this.a = cmd;
    }

    public /* synthetic */ cmi(cmd cmd, byte b) {
        this(cmd);
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
