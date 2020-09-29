package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class AppEventsLogger {
    private ali a;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    static {
        AppEventsLogger.class.getCanonicalName();
    }

    private AppEventsLogger(Context context, String str, aki aki) {
        this.a = new ali(context, (String) null, (aki) null);
    }

    public static FlushBehavior a() {
        return ali.a();
    }

    public static AppEventsLogger a(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    public static void a(Application application, String str) {
        ali.a(application, str);
    }

    public static void a(Context context, String str) {
        ali.a(context, str);
    }

    public static void a(String str) {
        ali.a(str);
    }

    public static String b(Context context) {
        return ali.a(context);
    }

    public static void b() {
        ali.c();
    }

    public static String c() {
        return ale.b();
    }

    public static String d() {
        return alm.b();
    }

    public final void a(String str, Bundle bundle) {
        this.a.a(str, bundle);
    }
}
