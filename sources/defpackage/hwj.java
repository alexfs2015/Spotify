package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.os.Build.VERSION;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hwj reason: default package */
public final class hwj {
    private final Context a;
    private final NotificationManager b;
    private final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>(1);

    public hwj(Context context, NotificationManager notificationManager) {
        this.a = context;
        this.b = notificationManager;
    }

    private Notification a(ArrayList<String> arrayList) {
        d dVar = new d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dVar.a((CharSequence) (String) it.next());
        }
        return new c(this.a, "external_integration_service_channel").a((CharSequence) this.a.getString(R.string.foreground_service_notification_title)).a((int) R.drawable.icn_notification).a((e) dVar).b();
    }

    private void a() {
        if (!this.c.isEmpty()) {
            this.b.notify(28, a(b()));
        } else {
            this.b.cancel(28);
        }
    }

    private ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>(1);
        for (String str : this.c.values()) {
            if (!"foreground-service-empty-notification-message".equals(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void a(Service service, String str) {
        if (VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannel(new NotificationChannel("external_integration_service_channel", this.a.getString(R.string.foreground_service_notification_channel_title), 2));
        }
        service.startForeground(28, a(b()));
        this.c.put(str, "foreground-service-empty-notification-message");
    }

    public final void a(String str, String str2) {
        if (this.c.containsKey(str)) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.c;
            if (str2 == null) {
                str2 = "foreground-service-empty-notification-message";
            }
            concurrentHashMap.put(str, str2);
            a();
        }
    }

    public final void b(Service service, String str) {
        this.c.remove(str);
        service.stopForeground(true);
        a();
    }
}
