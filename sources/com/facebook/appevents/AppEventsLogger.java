package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class AppEventsLogger {
    private aku a;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    static {
        AppEventsLogger.class.getCanonicalName();
    }

    public static void a(Application application, String str) {
        aku.a(application, str);
    }

    public static void a(Context context, String str) {
        aku.a(context, str);
    }

    public static AppEventsLogger a(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    private AppEventsLogger(Context context, String str, aju aju) {
        this.a = new aku(context, (String) null, (aju) null);
    }

    public static FlushBehavior a() {
        return aku.a();
    }

    public final void a(String str, Bundle bundle) {
        this.a.a(str, bundle);
    }

    public static void b() {
        aku.c();
    }

    public static String c() {
        return akq.b();
    }

    public static String d() {
        return aky.b();
    }

    public static String b(Context context) {
        return aku.a(context);
    }

    public static void a(String str) {
        aku.a(str);
    }
}
