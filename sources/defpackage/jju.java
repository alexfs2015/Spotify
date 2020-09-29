package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;

/* renamed from: jju reason: default package */
public final class jju extends jkj {
    private final Context a;
    private BroadcastReceiver b;

    public jju(jkk jkk) {
        super("HeadsetPlug");
        this.a = jkk.a;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.b = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("state", -1);
                if (intExtra == 0) {
                    jju.this.ah_();
                } else if (intExtra != 1) {
                    Logger.b("Unknown or no state received in %s", "android.intent.action.HEADSET_PLUG");
                } else {
                    jju.this.ag_();
                }
            }
        };
        this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    /* access modifiers changed from: protected */
    public final void d() {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }
}
