package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: ali reason: default package */
public class ali {
    public static final String a = ali.class.getCanonicalName();
    private static ScheduledThreadPoolExecutor d;
    private static FlushBehavior e = FlushBehavior.AUTO;
    private static Object f = new Object();
    private static String g;
    private static boolean h;
    private final String b;
    private final AccessTokenAppIdPair c;

    public ali(Context context, String str, aki aki) {
        this(ank.c(context), str, aki);
    }

    ali(String str, String str2, aki aki) {
        anl.a();
        this.b = str;
        if (aki == null) {
            aki = aki.a();
        }
        if (!aki.b() || (str2 != null && !str2.equals(aki.h))) {
            if (str2 == null) {
                str2 = ank.a(akq.g());
            }
            this.c = new AccessTokenAppIdPair(null, str2);
        } else {
            this.c = new AccessTokenAppIdPair(aki);
        }
        g();
    }

    public static FlushBehavior a() {
        FlushBehavior flushBehavior;
        synchronized (f) {
            flushBehavior = e;
        }
        return flushBehavior;
    }

    public static String a(Context context) {
        if (g == null) {
            synchronized (f) {
                if (g == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    g = string;
                    if (string == null) {
                        StringBuilder sb = new StringBuilder("XZ");
                        sb.append(UUID.randomUUID().toString());
                        g = sb.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", g).apply();
                    }
                }
            }
        }
        return g;
    }

    public static void a(Application application, String str) {
        if (akq.a()) {
            ale.a();
            alm.a();
            if (str == null) {
                str = akq.k();
            }
            akq.a((Context) application, str);
            alu.a(application, str);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }

    public static void a(final Context context, String str) {
        if (akq.n()) {
            final ali ali = new ali(context, str, (aki) null);
            d.execute(new Runnable() {
                public final void run() {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 10; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    String str3 = "kitsBitmask";
                    if (sharedPreferences.getInt(str3, 0) != i) {
                        sharedPreferences.edit().putInt(str3, i).apply();
                        ali.a("fb_sdk_initialize", null, bundle);
                    }
                }
            });
        }
    }

    private static void a(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        alg.a(accessTokenAppIdPair, appEvent);
        if (!appEvent.isImplicit && !h) {
            if (appEvent.name.equals("fb_mobile_activate_app")) {
                h = true;
                return;
            }
            and.a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
    }

    public static void a(String str) {
        SharedPreferences sharedPreferences = akq.g().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            sharedPreferences.edit().putString("install_referrer", str).apply();
        }
    }

    public static void b() {
        alg.a(FlushReason.EXPLICIT);
    }

    public static void b(String str) {
        and.a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
    }

    public static void c() {
        alg.a();
    }

    static String d() {
        synchronized (f) {
        }
        return null;
    }

    static String e() {
        return akq.g().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    static Executor f() {
        if (d == null) {
            g();
        }
        return d;
    }

    private static void g() {
        synchronized (f) {
            if (d == null) {
                d = new ScheduledThreadPoolExecutor(1);
                d.scheduleAtFixedRate(new Runnable() {
                    public final void run() {
                        HashSet<String> hashSet = new HashSet<>();
                        for (AccessTokenAppIdPair accessTokenAppIdPair : alg.b()) {
                            hashSet.add(accessTokenAppIdPair.applicationId);
                        }
                        for (String a : hashSet) {
                            FetchedAppSettingsManager.a(a, true);
                        }
                    }
                }, 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    public final void a(String str, Bundle bundle) {
        a(str, null, bundle, false, alu.b());
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, Double d2, Bundle bundle) {
        a(str, d2, bundle, true, alu.b());
    }

    public final void a(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        String str2 = "AppEvents";
        if (amt.a("app_events_killswitch", akq.k(), false)) {
            and.a(LoggingBehavior.APP_EVENTS, str2, "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        try {
            AppEvent appEvent = new AppEvent(this.b, str, d2, bundle, z, alu.a(), uuid);
            a(appEvent, this.c);
        } catch (JSONException e2) {
            and.a(LoggingBehavior.APP_EVENTS, str2, "JSON encoding for app event failed: '%s'", e2.toString());
        } catch (FacebookException e3) {
            and.a(LoggingBehavior.APP_EVENTS, str2, "Invalid app event: %s", e3.toString());
        }
    }
}
