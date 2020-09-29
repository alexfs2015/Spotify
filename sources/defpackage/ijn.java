package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;

/* renamed from: ijn reason: default package */
public final class ijn extends BroadcastReceiver {
    private final a a;

    /* renamed from: ijn$a */
    public interface a {
        void a();
    }

    public static IntentFilter a() {
        return new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    }

    public ijn(a aVar) {
        this.a = aVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int i = extras.getInt("android.bluetooth.adapter.extra.STATE", -1);
            if (i == 13 || i == 10) {
                Logger.b("onReceive: %s, state: TurningOff/StateOff", action);
                this.a.a();
            }
        }
    }
}
