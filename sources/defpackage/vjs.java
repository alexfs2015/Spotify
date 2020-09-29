package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: vjs reason: default package */
public final class vjs {
    private static final int a = 2131429987;
    private final Service b;
    private final vjt c;
    private final NotificationManager d;
    private final SparseArray<ho<Notification, Boolean>> e = new SparseArray<>();
    private int f = -1;

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public vjs(Service service, NotificationManager notificationManager, vjt vjt, int i, int i2) {
        this.b = (Service) fay.a(service);
        this.c = vjt;
        this.d = notificationManager;
        if (VERSION.SDK_INT >= 26) {
            String string = service.getResources().getString(R.string.spotify_notification_channel_name);
            String string2 = service.getResources().getString(R.string.spotify_notification_channel_description);
            NotificationChannel notificationChannel = new NotificationChannel("spotify_updates_channel", string, 2);
            notificationChannel.setDescription(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final synchronized void a(int i, Notification notification) {
        a(i, notification, true);
    }

    public final synchronized boolean a(int i, Notification notification, boolean z) {
        boolean z2;
        fay.a(notification);
        if (z && i != a) {
            Logger.b("Dismissing placeholder notification", new Object[0]);
            this.e.remove(a);
            this.d.cancel(a);
        }
        if (!z || this.f != -1) {
            if (!z && i == this.f) {
                b(false);
            }
            b(i, notification);
            z2 = false;
        } else {
            c(i, notification);
            z2 = true;
        }
        this.e.put(i, ho.a(notification, Boolean.valueOf(z)));
        Logger.b("Ongoing notifications: %s", this.e.toString());
        return z2;
    }

    public final synchronized void a(int i) {
        this.e.remove(i);
        if (this.f == i) {
            b(true);
            int i2 = 0;
            while (true) {
                if (i2 >= this.e.size()) {
                    break;
                }
                int keyAt = this.e.keyAt(i2);
                ho hoVar = (ho) this.e.get(keyAt);
                if (((Boolean) fay.a(hoVar.b)).booleanValue()) {
                    c(keyAt, (Notification) fay.a(hoVar.a));
                    break;
                }
                i2++;
            }
        } else {
            Logger.b("Canceling notification: %d", Integer.valueOf(i));
            this.d.cancel(i);
        }
        Logger.b("Ongoing notifications after hiding: %s", this.e.toString());
    }

    private void b(boolean z) {
        Logger.b("Stopping %s as foreground, last foreground notification: %d", this.b.getClass().getSimpleName(), Integer.valueOf(this.f));
        this.b.stopForeground(z);
        this.f = -1;
    }

    private void b(int i, Notification notification) {
        Logger.b("Notifying notification: %d", Integer.valueOf(i));
        try {
            this.d.notify(i, notification);
        } catch (RuntimeException e2) {
            if (VERSION.SDK_INT == 19 && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("samsung")) {
                if ("bad array lengths".equalsIgnoreCase(e2.getMessage())) {
                    String str = "Notification failed with Exception. Most likely Android 4.4 Samsung problem";
                    Assertion.a(str, (Throwable) e2);
                    Logger.e(e2, str, new Object[0]);
                    return;
                }
            }
            throw e2;
        }
    }

    private void c(int i, Notification notification) {
        Logger.b("Setting %s as foreground with notification: %d", this.b.getClass().getSimpleName(), Integer.valueOf(i));
        this.b.startForeground(i, notification);
        this.f = i;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            int keyAt = this.e.keyAt(i2);
            if (keyAt != this.f) {
                b(keyAt, (Notification) fay.a(((ho) this.e.get(keyAt)).a));
            }
        }
    }

    public final synchronized Runnable a(boolean z) {
        if (z) {
            if (VERSION.SDK_INT >= 26) {
                if (this.f != -1) {
                    Logger.b("Foreground notification already present", new Object[0]);
                    return $$Lambda$vjs$p8SJh8ZNChxWk1uSfBVqstQs5nI.INSTANCE;
                }
                Logger.b("Adding placeholder notification", new Object[0]);
                a(a, this.c.create(), true);
                return new $$Lambda$vjs$rT_v00R8rJl4YSamItX1u5mybig(this);
            }
        }
        return $$Lambda$vjs$5NO1Ibf5GERc_gQBvHn3nVu5ZI8.INSTANCE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(a);
    }
}
