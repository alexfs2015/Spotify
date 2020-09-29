package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: vm reason: default package */
public final class vm {
    private static final WeakHashMap<WakeLock, String> a = new WeakHashMap<>();

    static {
        su.a("WakeLocks");
    }

    public static WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        StringBuilder sb = new StringBuilder("WorkManager: ");
        sb.append(str);
        String sb2 = sb.toString();
        WakeLock newWakeLock = powerManager.newWakeLock(1, sb2);
        synchronized (a) {
            a.put(newWakeLock, sb2);
        }
        return newWakeLock;
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        synchronized (a) {
            hashMap.putAll(a);
        }
        for (WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)});
                su.a();
            }
        }
    }
}
