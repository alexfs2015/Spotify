package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;

/* renamed from: vtj reason: default package */
public final class vtj {
    public static void a(Activity activity) {
        vuf.a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof vtr) {
            a((Object) activity, (vtr) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), vtr.class.getCanonicalName()}));
        }
    }

    public static void a(Service service) {
        vuf.a(service, "service");
        Application application = service.getApplication();
        if (application instanceof vtr) {
            a((Object) service, (vtr) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), vtr.class.getCanonicalName()}));
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver, Context context) {
        vuf.a(broadcastReceiver, "broadcastReceiver");
        vuf.a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof vtr) {
            a((Object) broadcastReceiver, (vtr) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), vtr.class.getCanonicalName()}));
        }
    }

    static void a(Object obj, vtr vtr) {
        vtk j = vtr.j();
        vuf.a(j, "%s.androidInjector() returned null", vtr.getClass());
        j.a(obj);
    }
}
