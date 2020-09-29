package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import java.util.List;

/* renamed from: bzs reason: default package */
public final class bzs {
    private static final Object a = new Object();
    private static volatile bzs b;
    private final List<String> c = Collections.EMPTY_LIST;
    private final List<String> d = Collections.EMPTY_LIST;
    private final List<String> e = Collections.EMPTY_LIST;
    private final List<String> f = Collections.EMPTY_LIST;

    private bzs() {
    }

    public static bzs a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bzs();
                }
            }
        }
        return b;
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : bzw.b(context, component.getPackageName())) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public final boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return a(context, intent, serviceConnection, i);
    }
}
