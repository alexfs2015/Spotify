package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import java.util.List;

/* renamed from: bzb reason: default package */
public final class bzb {
    private static final Object a = new Object();
    private static volatile bzb b;
    private final List<String> c = Collections.EMPTY_LIST;
    private final List<String> d = Collections.EMPTY_LIST;
    private final List<String> e = Collections.EMPTY_LIST;
    private final List<String> f = Collections.EMPTY_LIST;

    public static bzb a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bzb();
                }
            }
        }
        return b;
    }

    private bzb() {
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = bzf.b(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public final boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return a(context, intent, serviceConnection, i);
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
