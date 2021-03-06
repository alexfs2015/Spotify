package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = sg.a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        sg.a();
        String.format("Received intent %s", new Object[]{intent});
        if (VERSION.SDK_INT >= 23) {
            try {
                sv.a(context).a(goAsync());
            } catch (IllegalStateException unused) {
                sg.a().a(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(sz.b(context));
        }
    }
}
