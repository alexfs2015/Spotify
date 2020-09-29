package defpackage;

import android.content.ContentResolver;
import android.text.TextUtils;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: wb reason: default package */
public final class wb {
    static vr a = vh.a();
    long b;
    vm c;
    vf d;
    a e;
    wj f;
    long g = -1;
    long h = -1;
    long i = -1;
    String j;
    String k;
    String l;
    String m;
    AdjustAttribution n;
    Map<String, String> o;

    /* renamed from: wb$a */
    class a {
        int a = -1;
        int b = -1;
        int c = -1;
        long d = -1;
        long e = -1;
        long f = -1;
        String g = null;
        String h = null;

        a(ActivityState activityState) {
            if (activityState != null) {
                this.a = activityState.eventCount;
                this.b = activityState.sessionCount;
                this.c = activityState.subsessionCount;
                this.d = activityState.timeSpent;
                this.e = activityState.lastInterval;
                this.f = activityState.sessionLength;
                this.g = activityState.uuid;
                this.h = activityState.pushToken;
            }
        }
    }

    wb(vf vfVar, vm vmVar, ActivityState activityState, wj wjVar, long j2) {
        this.b = j2;
        this.c = vmVar;
        this.d = vfVar;
        this.e = new a(activityState);
        this.f = wjVar;
    }

    /* access modifiers changed from: 0000 */
    public final ActivityPackage a(boolean z) {
        Map<String, String> b2 = b(z);
        ActivityPackage a2 = a(ActivityKind.SESSION);
        a2.path = "/session";
        a2.suffix = "";
        a2.parameters = b2;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final ActivityPackage a(String str) {
        Map<String, String> b2 = b(str);
        ActivityPackage a2 = a(ActivityKind.CLICK);
        a2.path = "/sdk_click";
        a2.suffix = "";
        a2.clickTimeInMilliseconds = this.h;
        a2.clickTimeInSeconds = this.g;
        a2.installBeginTimeInSeconds = this.i;
        a2.parameters = b2;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final ActivityPackage a() {
        Map<String, String> b2 = b();
        ActivityPackage a2 = a(ActivityKind.GDPR);
        a2.path = "/gdpr_forget_device";
        a2.suffix = "";
        a2.parameters = b2;
        return a2;
    }

    private Map<String, String> b(boolean z) {
        ContentResolver contentResolver = this.d.c.getContentResolver();
        HashMap hashMap = new HashMap();
        Map a2 = we.a(this.d.c, a);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        if (!z) {
            a((Map<String, String>) hashMap, "callback_params", this.f.a);
            a((Map<String, String>) hashMap, "partner_params", this.f.b);
        }
        this.c.a(this.d.c);
        a((Map<String, String>) hashMap, "android_uuid", this.e.g);
        a((Map<String, String>) hashMap, "tracking_enabled", this.c.c);
        a((Map<String, String>) hashMap, "gps_adid", this.c.a);
        a((Map<String, String>) hashMap, "gps_adid_src", this.c.b);
        if (!a((Map<String, String>) hashMap)) {
            a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.c.b(this.d.c);
            a((Map<String, String>) hashMap, "mac_sha1", this.c.d);
            a((Map<String, String>) hashMap, "mac_md5", this.c.e);
            a((Map<String, String>) hashMap, "android_id", this.c.f);
        }
        a((Map<String, String>) hashMap, "api_level", this.c.p);
        a((Map<String, String>) hashMap, "app_secret", (String) null);
        a((Map<String, String>) hashMap, "app_token", this.d.d);
        a((Map<String, String>) hashMap, "app_version", this.c.j);
        a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
        a((Map<String, String>) hashMap, "connectivity_type", (long) wm.e(this.d.c));
        a((Map<String, String>) hashMap, "country", this.c.r);
        a((Map<String, String>) hashMap, "cpu_type", this.c.y);
        b(hashMap, "created_at", this.b);
        a((Map<String, String>) hashMap, "default_tracker", this.d.g);
        a((Map<String, String>) hashMap, "device_known", (Boolean) null);
        a((Map<String, String>) hashMap, "device_manufacturer", this.c.m);
        a((Map<String, String>) hashMap, "device_name", this.c.l);
        a((Map<String, String>) hashMap, "device_type", this.c.k);
        a((Map<String, String>) hashMap, "display_height", this.c.w);
        a((Map<String, String>) hashMap, "display_width", this.c.v);
        a((Map<String, String>) hashMap, "environment", this.d.e);
        a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
        a((Map<String, String>) hashMap, "fb_id", this.c.g);
        a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
        a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
        a((Map<String, String>) hashMap, "hardware_name", this.c.x);
        a((Map<String, String>) hashMap, "installed_at", this.c.A);
        a((Map<String, String>) hashMap, "language", this.c.q);
        c(hashMap, "last_interval", this.e.e);
        a((Map<String, String>) hashMap, "mcc", wm.g(this.d.c));
        a((Map<String, String>) hashMap, "mnc", wm.h(this.d.c));
        a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
        a((Map<String, String>) hashMap, "network_type", (long) wm.f(this.d.c));
        a((Map<String, String>) hashMap, "os_build", this.c.z);
        a((Map<String, String>) hashMap, "os_name", this.c.n);
        a((Map<String, String>) hashMap, "os_version", this.c.o);
        a((Map<String, String>) hashMap, "package_name", this.c.i);
        a((Map<String, String>) hashMap, "push_token", this.e.h);
        a((Map<String, String>) hashMap, "screen_density", this.c.u);
        a((Map<String, String>) hashMap, "screen_format", this.c.t);
        a((Map<String, String>) hashMap, "screen_size", this.c.s);
        a((Map<String, String>) hashMap, "secret_id", (String) null);
        a((Map<String, String>) hashMap, "session_count", (long) this.e.b);
        c(hashMap, "session_length", this.e.f);
        a((Map<String, String>) hashMap, "subsession_count", (long) this.e.c);
        c(hashMap, "time_spent", this.e.d);
        a((Map<String, String>) hashMap, "updated_at", this.c.B);
        b((Map<String, String>) hashMap);
        return hashMap;
    }

    private Map<String, String> b(String str) {
        ContentResolver contentResolver = this.d.c.getContentResolver();
        HashMap hashMap = new HashMap();
        Map a2 = we.a(this.d.c, a);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        this.c.a(this.d.c);
        a((Map<String, String>) hashMap, "android_uuid", this.e.g);
        a((Map<String, String>) hashMap, "tracking_enabled", this.c.c);
        a((Map<String, String>) hashMap, "gps_adid", this.c.a);
        a((Map<String, String>) hashMap, "gps_adid_src", this.c.b);
        if (!a((Map<String, String>) hashMap)) {
            a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.c.b(this.d.c);
            a((Map<String, String>) hashMap, "mac_sha1", this.c.d);
            a((Map<String, String>) hashMap, "mac_md5", this.c.e);
            a((Map<String, String>) hashMap, "android_id", this.c.f);
        }
        AdjustAttribution adjustAttribution = this.n;
        if (adjustAttribution != null) {
            a((Map<String, String>) hashMap, "tracker", adjustAttribution.trackerName);
            a((Map<String, String>) hashMap, "campaign", this.n.campaign);
            a((Map<String, String>) hashMap, "adgroup", this.n.adgroup);
            a((Map<String, String>) hashMap, "creative", this.n.creative);
        }
        a((Map<String, String>) hashMap, "api_level", this.c.p);
        a((Map<String, String>) hashMap, "app_secret", (String) null);
        a((Map<String, String>) hashMap, "app_token", this.d.d);
        a((Map<String, String>) hashMap, "app_version", this.c.j);
        a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
        a((Map<String, String>) hashMap, "callback_params", this.f.a);
        String str2 = "click_time";
        b(hashMap, str2, this.h);
        d(hashMap, str2, this.g);
        a((Map<String, String>) hashMap, "connectivity_type", (long) wm.e(this.d.c));
        a((Map<String, String>) hashMap, "country", this.c.r);
        a((Map<String, String>) hashMap, "cpu_type", this.c.y);
        b(hashMap, "created_at", this.b);
        a((Map<String, String>) hashMap, "deeplink", this.k);
        a((Map<String, String>) hashMap, "device_known", (Boolean) null);
        a((Map<String, String>) hashMap, "device_manufacturer", this.c.m);
        a((Map<String, String>) hashMap, "device_name", this.c.l);
        a((Map<String, String>) hashMap, "device_type", this.c.k);
        a((Map<String, String>) hashMap, "display_height", this.c.w);
        a((Map<String, String>) hashMap, "display_width", this.c.v);
        a((Map<String, String>) hashMap, "environment", this.d.e);
        a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
        a((Map<String, String>) hashMap, "fb_id", this.c.g);
        a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
        a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
        a((Map<String, String>) hashMap, "hardware_name", this.c.x);
        d(hashMap, "install_begin_time", this.i);
        a((Map<String, String>) hashMap, "installed_at", this.c.A);
        a((Map<String, String>) hashMap, "language", this.c.q);
        c(hashMap, "last_interval", this.e.e);
        a((Map<String, String>) hashMap, "mcc", wm.g(this.d.c));
        a((Map<String, String>) hashMap, "mnc", wm.h(this.d.c));
        a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
        a((Map<String, String>) hashMap, "network_type", (long) wm.f(this.d.c));
        a((Map<String, String>) hashMap, "os_build", this.c.z);
        a((Map<String, String>) hashMap, "os_name", this.c.n);
        a((Map<String, String>) hashMap, "os_version", this.c.o);
        a((Map<String, String>) hashMap, "package_name", this.c.i);
        a((Map<String, String>) hashMap, "params", this.o);
        a((Map<String, String>) hashMap, "partner_params", this.f.b);
        a((Map<String, String>) hashMap, "push_token", this.e.h);
        a((Map<String, String>) hashMap, "raw_referrer", this.m);
        a((Map<String, String>) hashMap, "referrer", this.l);
        a((Map<String, String>) hashMap, "reftag", this.j);
        a((Map<String, String>) hashMap, "screen_density", this.c.u);
        a((Map<String, String>) hashMap, "screen_format", this.c.t);
        a((Map<String, String>) hashMap, "screen_size", this.c.s);
        a((Map<String, String>) hashMap, "secret_id", (String) null);
        a((Map<String, String>) hashMap, "session_count", (long) this.e.b);
        c(hashMap, "session_length", this.e.f);
        a((Map<String, String>) hashMap, "source", str);
        a((Map<String, String>) hashMap, "subsession_count", (long) this.e.c);
        c(hashMap, "time_spent", this.e.d);
        a((Map<String, String>) hashMap, "updated_at", this.c.B);
        b((Map<String, String>) hashMap);
        return hashMap;
    }

    private Map<String, String> b() {
        ContentResolver contentResolver = this.d.c.getContentResolver();
        HashMap hashMap = new HashMap();
        Map a2 = we.a(this.d.c, a);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        this.c.a(this.d.c);
        a((Map<String, String>) hashMap, "android_uuid", this.e.g);
        a((Map<String, String>) hashMap, "tracking_enabled", this.c.c);
        a((Map<String, String>) hashMap, "gps_adid", this.c.a);
        a((Map<String, String>) hashMap, "gps_adid_src", this.c.b);
        if (!a((Map<String, String>) hashMap)) {
            a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
            this.c.b(this.d.c);
            a((Map<String, String>) hashMap, "mac_sha1", this.c.d);
            a((Map<String, String>) hashMap, "mac_md5", this.c.e);
            a((Map<String, String>) hashMap, "android_id", this.c.f);
        }
        a((Map<String, String>) hashMap, "api_level", this.c.p);
        a((Map<String, String>) hashMap, "app_secret", (String) null);
        a((Map<String, String>) hashMap, "app_token", this.d.d);
        a((Map<String, String>) hashMap, "app_version", this.c.j);
        a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
        b(hashMap, "created_at", this.b);
        a((Map<String, String>) hashMap, "device_known", (Boolean) null);
        a((Map<String, String>) hashMap, "device_name", this.c.l);
        a((Map<String, String>) hashMap, "device_type", this.c.k);
        a((Map<String, String>) hashMap, "environment", this.d.e);
        a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
        a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
        a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
        a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
        a((Map<String, String>) hashMap, "os_name", this.c.n);
        a((Map<String, String>) hashMap, "os_version", this.c.o);
        a((Map<String, String>) hashMap, "package_name", this.c.i);
        a((Map<String, String>) hashMap, "push_token", this.e.h);
        a((Map<String, String>) hashMap, "secret_id", (String) null);
        b((Map<String, String>) hashMap);
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    public ActivityPackage a(ActivityKind activityKind) {
        ActivityPackage activityPackage = new ActivityPackage(activityKind);
        activityPackage.clientSdk = this.c.h;
        return activityPackage;
    }

    public static void a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void a(Map<String, String> map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, bool.booleanValue() ? 1 : 0);
        }
    }

    static void a(Map<String, String> map, String str, Map<String, String> map2) {
        if (map2 != null && map2.size() != 0) {
            a(map, str, new JSONObject(map2).toString());
        }
    }

    static void a(Map<String, String> map, String str, long j2) {
        if (j2 >= 0) {
            a(map, str, Long.toString(j2));
        }
    }

    static void b(Map<String, String> map, String str, long j2) {
        if (j2 > 0) {
            a(map, str, new Date(j2));
        }
    }

    private static void d(Map<String, String> map, String str, long j2) {
        if (j2 > 0) {
            a(map, str, new Date(j2 * 1000));
        }
    }

    private static void a(Map<String, String> map, String str, Date date) {
        a(map, str, wm.b.format(date));
    }

    static void c(Map<String, String> map, String str, long j2) {
        if (j2 >= 0) {
            a(map, str, (j2 + 500) / 1000);
        }
    }

    static void a(Map<String, String> map, String str, Double d2) {
        if (d2 != null) {
            a(map, str, wm.a("%.5f", d2));
        }
    }

    static boolean a(Map<String, String> map) {
        return map.containsKey("tracking_enabled") || map.containsKey("gps_adid");
    }

    static void b(Map<String, String> map) {
        if (!map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid")) {
            a.f("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    static String a(vg vgVar) {
        return wm.a("'%s'", vgVar.a);
    }
}
