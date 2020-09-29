package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;

/* renamed from: whp reason: default package */
public final class whp {
    public static void a(Activity activity) {
        wil.a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof whx) {
            a((Object) activity, (whx) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), whx.class.getCanonicalName()}));
        }
    }

    public static void a(Service service) {
        wil.a(service, "service");
        Application application = service.getApplication();
        if (application instanceof whx) {
            a((Object) service, (whx) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), whx.class.getCanonicalName()}));
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver, Context context) {
        wil.a(broadcastReceiver, "broadcastReceiver");
        wil.a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof whx) {
            a((Object) broadcastReceiver, (whx) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), whx.class.getCanonicalName()}));
        }
    }

    static void a(Object obj, whx whx) {
        whq j = whx.j();
        wil.a(j, "%s.androidInjector() returned null", whx.getClass());
        j.a(obj);
    }
}
