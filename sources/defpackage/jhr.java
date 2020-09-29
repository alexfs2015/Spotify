package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: jhr reason: default package */
public final class jhr extends jht {
    private final Context a;
    private BroadcastReceiver b;

    public jhr(String str, Context context) {
        super(str);
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.b = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
                    if (keyguardManager.inKeyguardRestrictedInputMode()) {
                        jhr.this.ag_();
                        return;
                    }
                    jhr.this.ah_();
                }
            }
        };
        this.a.registerReceiver(this.b, intentFilter);
    }

    public final void d() {
        this.a.unregisterReceiver(this.b);
    }
}
