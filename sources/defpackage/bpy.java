package defpackage;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: bpy reason: default package */
public final class bpy extends BroadcastReceiver {
    private final /* synthetic */ MediaNotificationService a;

    public bpy(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (this.a.q.d()) {
            intent2.setFlags(603979776);
            pendingIntent = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            fq a2 = fq.a((Context) this.a);
            a2.a(componentName);
            a2.a(intent2);
            if (!a2.a.isEmpty()) {
                Intent[] intentArr = (Intent[]) a2.a.toArray(new Intent[a2.a.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                pendingIntent = VERSION.SDK_INT >= 16 ? PendingIntent.getActivities(a2.b, 1, intentArr, 134217728, null) : PendingIntent.getActivities(a2.b, 1, intentArr, 134217728);
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
        }
        try {
            pendingIntent.send(context, 1, new Intent().setFlags(268435456));
        } catch (CanceledException e) {
            MediaNotificationService.a.a(e, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
