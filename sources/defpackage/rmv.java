package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.KeyEvent;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: rmv reason: default package */
public final class rmv implements c {
    final hfx a;
    private final mc b;
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String str = "android.intent.extra.KEY_EVENT";
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra(str);
                if (keyEvent != null) {
                    Intent a2 = rmv.this.a.a(context, "com.spotify.mobile.android.service.action.media_button");
                    a2.putExtra(str, keyEvent);
                    try {
                        context.startService(a2);
                    } catch (IllegalStateException e) {
                        StringBuilder sb = new StringBuilder("Failed to send gevent ");
                        sb.append(keyEvent);
                        Assertion.a(sb.toString(), (Throwable) e);
                    }
                }
            }
        }
    };

    public final String c() {
        return "PausingMediaEventsLifecycleDecoupler";
    }

    public rmv(mc mcVar, hfx hfx) {
        this.b = mcVar;
        this.a = hfx;
    }

    public static void a(mc mcVar, KeyEvent keyEvent) {
        Intent intent = new Intent("PausingMediaEventsLifecycleDecoupler.optionalaction.pause");
        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        mcVar.a(intent);
    }

    public final void ai_() {
        this.b.a(this.c, new IntentFilter("PausingMediaEventsLifecycleDecoupler.optionalaction.pause"));
    }

    public final void aj_() {
        this.b.a(this.c);
    }
}
