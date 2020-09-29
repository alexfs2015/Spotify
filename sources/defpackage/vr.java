package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: vr reason: default package */
public final class vr implements wd {
    static long a;
    private static long h;
    private static long i;
    private static long j;
    private static long k;
    xg b;
    wg c;
    wf d = vv.a();
    xk e;
    a f;
    vt g;
    private ActivityState l;
    private xj m;
    private xk n;
    private String o;
    private String p;
    private wa q;
    private AdjustAttribution r;
    private we s;
    private wj t;
    private wx u;
    private wk v;

    /* renamed from: vr$a */
    public class a {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;

        public a() {
        }

        public final boolean a() {
            return !this.c;
        }

        public final boolean b() {
            return !this.d;
        }

        public final boolean c() {
            return !this.h;
        }
    }

    vr(vt vtVar) {
        this.g = vtVar;
        this.d.a();
        this.b = new xe("ActivityHandler");
        this.f = new a();
        this.f.a = vtVar.l != null ? vtVar.l.booleanValue() : true;
        this.f.b = vtVar.m;
        a aVar = this.f;
        aVar.c = true;
        aVar.d = false;
        aVar.e = false;
        aVar.g = false;
        aVar.h = false;
        this.b.a(new Runnable() {
            public final void run() {
                vr.a(vr.this);
            }
        });
    }

    private void a(long j2) {
        long j3 = j2 - this.l.lastActivity;
        this.l.sessionCount++;
        this.l.lastInterval = j3;
        c(j2);
        this.l.a(j2);
        x();
    }

    private void a(String str) {
        if (str != null && !str.equals(this.l.adid)) {
            this.l.adid = str;
            x();
        }
    }

    private void a(final String str, final boolean z) {
        this.b.a(new Runnable() {
            public final void run() {
                if (!z) {
                    new wz(vr.this.g.c).a(str);
                }
                if (!vr.this.f.c()) {
                    vr.a(vr.this, str);
                }
            }
        });
    }

    private void a(List<wi> list) {
        if (list != null) {
            for (wi a2 : list) {
                a2.a(this);
            }
        }
    }

    static /* synthetic */ void a(vr vrVar) {
        vr vrVar2 = vrVar;
        String str = "Session Partner parameters";
        String str2 = "Session Callback parameters";
        String str3 = "Activity state";
        String str4 = "Attribution";
        String str5 = "Failed to read %s file (%s)";
        j = vv.d();
        k = vv.e();
        h = vv.b();
        i = vv.c();
        a = vv.b();
        try {
            vrVar2.r = (AdjustAttribution) xa.a(vrVar2.g.c, "AdjustAttribution", str4, AdjustAttribution.class);
        } catch (Exception e2) {
            vrVar2.d.f(str5, str4, e2.getMessage());
            vrVar2.r = null;
        }
        try {
            vrVar2.l = (ActivityState) xa.a(vrVar2.g.c, "AdjustIoActivityState", str3, ActivityState.class);
        } catch (Exception e3) {
            vrVar2.d.f(str5, str3, e3.getMessage());
            vrVar2.l = null;
        }
        if (vrVar2.l != null) {
            vrVar2.f.h = true;
        }
        vrVar2.u = new wx();
        Context context = vrVar2.g.c;
        try {
            vrVar2.u.a = (Map) xa.a(context, "AdjustSessionCallbackParameters", str2, Map.class);
        } catch (Exception e4) {
            vrVar2.d.f(str5, str2, e4.getMessage());
            vrVar2.u.a = null;
        }
        Context context2 = vrVar2.g.c;
        try {
            vrVar2.u.b = (Map) xa.a(context2, "AdjustSessionPartnerParameters", str, Map.class);
        } catch (Exception e5) {
            vrVar2.d.f(str5, str, e5.getMessage());
            vrVar2.u.b = null;
        }
        if (vrVar2.g.l != null) {
            if (vrVar2.g.j == null) {
                vrVar2.g.j = new ArrayList();
            }
            vrVar2.g.j.add(new wi() {
                public final void a(vr vrVar) {
                    vrVar.b(vr.this.g.l.booleanValue());
                }
            });
        }
        if (vrVar2.f.h) {
            vrVar2.f.a = vrVar2.l.enabled;
            vrVar2.f.e = vrVar2.l.updatePackages;
            vrVar2.f.f = false;
        } else {
            vrVar2.f.f = true;
        }
        try {
            InputStream open = vrVar2.g.c.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            vrVar2.d.a("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                vrVar2.g.g = property;
            }
        } catch (Exception e6) {
            vrVar2.d.b("%s file not found in this app", e6.getMessage());
        }
        vrVar2.q = new wa(vrVar2.g.c, null);
        vrVar2.q.a(vrVar2.g.c);
        if (vrVar2.q.a == null) {
            vrVar2.d.d("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            if (vrVar2.q.d == null && vrVar2.q.e == null && vrVar2.q.f == null) {
                vrVar2.d.f("Unable to get any device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
            }
        } else {
            vrVar2.d.c("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        if (vrVar2.g.g != null) {
            vrVar2.d.c("Default tracker: '%s'", vrVar2.g.g);
        }
        if (vrVar2.g.k != null) {
            vrVar2.d.c("Push token: '%s'", vrVar2.g.k);
            if (vrVar2.f.h) {
                vrVar2.a(vrVar2.g.k, false);
            } else {
                new wz(vrVar2.g.c).a(vrVar2.g.k);
            }
        } else if (vrVar2.f.h) {
            vrVar2.a(new wz(vrVar2.g.c).c(), true);
        }
        if (vrVar2.f.h && new wz(vrVar2.g.c).g()) {
            vrVar2.b.a(new Runnable() {
                public final void run() {
                    vr.this.w();
                }
            });
        }
        xj xjVar = new xj(new Runnable() {
            public final void run() {
                vr vrVar = vr.this;
                vrVar.b.a(new Runnable() {
                    public final void run() {
                        vr.i(vr.this);
                    }
                });
            }
        }, i, h, "Foreground timer");
        vrVar2.m = xjVar;
        xb.a = null;
        vrVar2.o = vrVar2.g.a;
        vrVar2.p = vrVar2.g.b;
        vrVar2.c = vv.a(vrVar2, vrVar2.g.c, vrVar2.d(false));
        vrVar2.s = vv.a((wd) vrVar2, vrVar2.d(false));
        vrVar2.t = vv.b(vrVar2, vrVar2.d(true));
        if (vrVar.v()) {
            vrVar.u();
        }
        vrVar2.v = new wk(vrVar2.g.c, new wl() {
            public final void a(String str, long j, long j2) {
                vr vrVar = vr.this;
                xg xgVar = vrVar.b;
                AnonymousClass2 r0 = new Runnable(str, j, j2) {
                    private /* synthetic */ String a;
                    private /* synthetic */ long b;
                    private /* synthetic */ long c;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r5;
                    }

                    public final void run() {
                        vr.a(vr.this, this.a, this.b, this.c);
                    }
                };
                xgVar.a(r0);
            }
        });
        vrVar2.a(vrVar2.g.j);
        vrVar.q();
    }

    static /* synthetic */ void a(vr vrVar, Uri uri, long j2) {
        if (vrVar.o()) {
            if (xa.a(uri)) {
                wf wfVar = vrVar.d;
                StringBuilder sb = new StringBuilder("Deep link (");
                sb.append(uri.toString());
                sb.append(") processing skipped");
                wfVar.b(sb.toString(), new Object[0]);
                return;
            }
            ActivityState activityState = vrVar.l;
            vt vtVar = vrVar.g;
            wa waVar = vrVar.q;
            wx wxVar = vrVar.u;
            ActivityPackage activityPackage = null;
            if (uri != null) {
                String uri2 = uri.toString();
                if (!(uri2 == null || uri2.length() == 0)) {
                    vv.a().a("Url to parse (%s)", uri);
                    UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                    urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
                    urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                    urlQuerySanitizer.parseUrl(uri2);
                    wp a2 = wq.a(urlQuerySanitizer.getParameterList(), activityState, vtVar, waVar, wxVar);
                    if (a2 != null) {
                        a2.k = uri.toString();
                        a2.h = j2;
                        activityPackage = a2.a("deeplink");
                    }
                }
            }
            if (activityPackage != null) {
                vrVar.t.a(activityPackage);
            }
        }
    }

    static /* synthetic */ void a(vr vrVar, String str) {
        if (vrVar.y() && vrVar.o() && !vrVar.l.isGdprForgotten && str != null && !str.equals(vrVar.l.pushToken)) {
            vrVar.l.pushToken = str;
            vrVar.x();
            wp wpVar = new wp(vrVar.g, vrVar.q, vrVar.l, vrVar.u, System.currentTimeMillis());
            ContentResolver contentResolver = wpVar.d.c.getContentResolver();
            HashMap hashMap = new HashMap();
            Map a2 = ws.a(wpVar.d.c, wp.a);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            wpVar.c.a(wpVar.d.c);
            wp.a((Map<String, String>) hashMap, "android_uuid", wpVar.e.g);
            wp.a((Map<String, String>) hashMap, "tracking_enabled", wpVar.c.c);
            wp.a((Map<String, String>) hashMap, "gps_adid", wpVar.c.a);
            wp.a((Map<String, String>) hashMap, "gps_adid_src", wpVar.c.b);
            if (!wp.a((Map<String, String>) hashMap)) {
                wp.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                wpVar.c.b(wpVar.d.c);
                wp.a((Map<String, String>) hashMap, "mac_sha1", wpVar.c.d);
                wp.a((Map<String, String>) hashMap, "mac_md5", wpVar.c.e);
                wp.a((Map<String, String>) hashMap, "android_id", wpVar.c.f);
            }
            wp.a((Map<String, String>) hashMap, "app_secret", (String) null);
            wp.a((Map<String, String>) hashMap, "app_token", wpVar.d.d);
            wp.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
            wp.b(hashMap, "created_at", wpVar.b);
            wp.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
            wp.a((Map<String, String>) hashMap, "environment", wpVar.d.e);
            wp.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
            wp.a((Map<String, String>) hashMap, "fire_adid", xa.a(contentResolver));
            wp.a((Map<String, String>) hashMap, "fire_tracking_enabled", xa.b(contentResolver));
            wp.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
            wp.a((Map<String, String>) hashMap, "push_token", wpVar.e.h);
            wp.a((Map<String, String>) hashMap, "secret_id", (String) null);
            wp.a((Map<String, String>) hashMap, "source", "push");
            wp.b((Map<String, String>) hashMap);
            ActivityPackage a3 = wpVar.a(ActivityKind.INFO);
            a3.path = "/sdk_info";
            a3.suffix = "";
            a3.parameters = hashMap;
            vrVar.c.a(a3);
            new wz(vrVar.g.c).d();
            vrVar.c.a();
        }
    }

    static /* synthetic */ void a(vr vrVar, String str, long j2, long j3) {
        ActivityPackage activityPackage;
        if (vrVar.o() && str != null) {
            if (j2 != vrVar.l.clickTime || j3 != vrVar.l.installBegin || !str.equals(vrVar.l.installReferrer)) {
                ActivityState activityState = vrVar.l;
                vt vtVar = vrVar.g;
                wa waVar = vrVar.q;
                wx wxVar = vrVar.u;
                if (str == null || str.length() == 0) {
                    activityPackage = null;
                } else {
                    wp wpVar = new wp(vtVar, waVar, activityState, wxVar, System.currentTimeMillis());
                    wpVar.l = str;
                    wpVar.g = j2;
                    wpVar.i = j3;
                    activityPackage = wpVar.a("install_referrer");
                }
                vrVar.t.a(activityPackage);
            }
        }
    }

    static /* synthetic */ void a(vr vrVar, vu vuVar) {
        boolean z;
        if (vrVar.y() && vrVar.o()) {
            if (vuVar == null) {
                vrVar.d.f("Event missing", new Object[0]);
            } else {
                if (!(vuVar.a != null)) {
                    vrVar.d.f("Event not initialized correctly", new Object[0]);
                } else {
                    z = true;
                    if (z && !vrVar.l.isGdprForgotten) {
                        long currentTimeMillis = System.currentTimeMillis();
                        vrVar.l.eventCount++;
                        vrVar.b(currentTimeMillis);
                        wp wpVar = new wp(vrVar.g, vrVar.q, vrVar.l, vrVar.u, currentTimeMillis);
                        boolean z2 = vrVar.f.d;
                        ContentResolver contentResolver = wpVar.d.c.getContentResolver();
                        HashMap hashMap = new HashMap();
                        Map a2 = ws.a(wpVar.d.c, wp.a);
                        if (a2 != null) {
                            hashMap.putAll(a2);
                        }
                        if (!z2) {
                            wp.a((Map<String, String>) hashMap, "callback_params", xa.a(wpVar.f.a, vuVar.b, "Callback"));
                            wp.a((Map<String, String>) hashMap, "partner_params", xa.a(wpVar.f.b, null, "Partner"));
                        }
                        wpVar.c.a(wpVar.d.c);
                        wp.a((Map<String, String>) hashMap, "android_uuid", wpVar.e.g);
                        wp.a((Map<String, String>) hashMap, "tracking_enabled", wpVar.c.c);
                        wp.a((Map<String, String>) hashMap, "gps_adid", wpVar.c.a);
                        wp.a((Map<String, String>) hashMap, "gps_adid_src", wpVar.c.b);
                        if (!wp.a((Map<String, String>) hashMap)) {
                            wp.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                            wpVar.c.b(wpVar.d.c);
                            wp.a((Map<String, String>) hashMap, "mac_sha1", wpVar.c.d);
                            wp.a((Map<String, String>) hashMap, "mac_md5", wpVar.c.e);
                            wp.a((Map<String, String>) hashMap, "android_id", wpVar.c.f);
                        }
                        wp.a((Map<String, String>) hashMap, "api_level", wpVar.c.p);
                        wp.a((Map<String, String>) hashMap, "app_secret", (String) null);
                        wp.a((Map<String, String>) hashMap, "app_token", wpVar.d.d);
                        wp.a((Map<String, String>) hashMap, "app_version", wpVar.c.j);
                        wp.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
                        wp.a((Map<String, String>) hashMap, "connectivity_type", (long) xa.e(wpVar.d.c));
                        wp.a((Map<String, String>) hashMap, "country", wpVar.c.r);
                        wp.a((Map<String, String>) hashMap, "cpu_type", wpVar.c.y);
                        wp.b(hashMap, "created_at", wpVar.b);
                        wp.a((Map<String, String>) hashMap, "currency", (String) null);
                        wp.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
                        wp.a((Map<String, String>) hashMap, "device_manufacturer", wpVar.c.m);
                        wp.a((Map<String, String>) hashMap, "device_name", wpVar.c.l);
                        wp.a((Map<String, String>) hashMap, "device_type", wpVar.c.k);
                        wp.a((Map<String, String>) hashMap, "display_height", wpVar.c.w);
                        wp.a((Map<String, String>) hashMap, "display_width", wpVar.c.v);
                        wp.a((Map<String, String>) hashMap, "environment", wpVar.d.e);
                        wp.a((Map<String, String>) hashMap, "event_callback_id", (String) null);
                        wp.a((Map<String, String>) hashMap, "event_count", (long) wpVar.e.a);
                        wp.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
                        wp.a((Map<String, String>) hashMap, "event_token", vuVar.a);
                        wp.a((Map<String, String>) hashMap, "fb_id", wpVar.c.g);
                        wp.a((Map<String, String>) hashMap, "fire_adid", xa.a(contentResolver));
                        wp.a((Map<String, String>) hashMap, "fire_tracking_enabled", xa.b(contentResolver));
                        wp.a((Map<String, String>) hashMap, "hardware_name", wpVar.c.x);
                        wp.a((Map<String, String>) hashMap, "language", wpVar.c.q);
                        wp.a((Map<String, String>) hashMap, "mcc", xa.g(wpVar.d.c));
                        wp.a((Map<String, String>) hashMap, "mnc", xa.h(wpVar.d.c));
                        wp.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
                        wp.a((Map<String, String>) hashMap, "network_type", (long) xa.f(wpVar.d.c));
                        wp.a((Map<String, String>) hashMap, "os_build", wpVar.c.z);
                        wp.a((Map<String, String>) hashMap, "os_name", wpVar.c.n);
                        wp.a((Map<String, String>) hashMap, "os_version", wpVar.c.o);
                        wp.a((Map<String, String>) hashMap, "package_name", wpVar.c.i);
                        wp.a((Map<String, String>) hashMap, "push_token", wpVar.e.h);
                        wp.a((Map<String, String>) hashMap, "revenue", (Double) null);
                        wp.a((Map<String, String>) hashMap, "screen_density", wpVar.c.u);
                        wp.a((Map<String, String>) hashMap, "screen_format", wpVar.c.t);
                        wp.a((Map<String, String>) hashMap, "screen_size", wpVar.c.s);
                        wp.a((Map<String, String>) hashMap, "secret_id", (String) null);
                        wp.a((Map<String, String>) hashMap, "session_count", (long) wpVar.e.b);
                        wp.c(hashMap, "session_length", wpVar.e.f);
                        wp.a((Map<String, String>) hashMap, "subsession_count", (long) wpVar.e.c);
                        wp.c(hashMap, "time_spent", wpVar.e.d);
                        wp.b((Map<String, String>) hashMap);
                        ActivityPackage a3 = wpVar.a(ActivityKind.EVENT);
                        a3.path = "/event";
                        a3.suffix = wp.a(vuVar);
                        a3.parameters = hashMap;
                        if (z2) {
                            a3.callbackParameters = vuVar.b;
                            a3.partnerParameters = null;
                        }
                        vrVar.c.a(a3);
                        vrVar.c.a();
                        vrVar.x();
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    static /* synthetic */ void a(vr vrVar, vz vzVar) {
        vrVar.a(vzVar.d);
        Handler handler = new Handler(vrVar.g.c.getMainLooper());
        vrVar.a(vzVar.i);
        final Uri uri = vzVar.a;
        if (uri != null) {
            vrVar.d.c("Deferred deeplink received (%s)", uri);
            final Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            intent.setPackage(vrVar.g.c.getPackageName());
            handler.post(new Runnable() {
                public final void run() {
                    if (vr.this.g != null) {
                        if (vr.this.g.h != null ? vr.this.g.h.launchReceivedDeeplink(uri) : true) {
                            vr vrVar = vr.this;
                            Intent intent = intent;
                            Uri uri = uri;
                            if (!(vrVar.g.c.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
                                vrVar.d.f("Unable to open deferred deep link (%s)", uri);
                            } else {
                                vrVar.d.c("Open deferred deep link (%s)", uri);
                                vrVar.g.c.startActivity(intent);
                            }
                        }
                    }
                }
            });
        }
    }

    static /* synthetic */ void a(vr vrVar, wb wbVar) {
        vrVar.a(wbVar.d);
        new Handler(vrVar.g.c.getMainLooper());
    }

    static /* synthetic */ void a(vr vrVar, ww wwVar) {
        vrVar.a(wwVar.d);
        new Handler(vrVar.g.c.getMainLooper());
        vrVar.a(wwVar.i);
    }

    static /* synthetic */ void a(vr vrVar, wy wyVar) {
        vrVar.a(wyVar.d);
        new Handler(vrVar.g.c.getMainLooper());
        vrVar.a(wyVar.i);
        if (vrVar.r == null && !vrVar.l.askingAttribution) {
            vrVar.s.a();
        }
        if (wyVar.b) {
            new wz(vrVar.g.c).e();
        }
        vrVar.f.g = true;
    }

    private void a(wz wzVar) {
        String c2 = wzVar.c();
        if (c2 != null && !c2.equals(this.l.pushToken)) {
            a(c2, true);
        }
        wzVar.a();
        h();
        this.v.a();
    }

    private void a(boolean z, String str, String str2, String str3) {
        if (z) {
            this.d.c(str, new Object[0]);
        } else if (!c(false)) {
            this.d.c(str3, new Object[0]);
        } else if (c(true)) {
            this.d.c(str2, new Object[0]);
        } else {
            wf wfVar = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(", except the Sdk Click Handler");
            wfVar.c(sb.toString(), new Object[0]);
        }
        r();
    }

    private boolean a(AdjustAttribution adjustAttribution) {
        if (adjustAttribution == null || adjustAttribution.equals(this.r)) {
            return false;
        }
        this.r = adjustAttribution;
        synchronized (AdjustAttribution.class) {
            if (this.r != null) {
                xa.a(this.r, this.g.c, "AdjustAttribution", "Attribution");
            }
        }
        return true;
    }

    static /* synthetic */ void b(vr vrVar) {
        double d2;
        if (!vrVar.f.b() && !vrVar.v()) {
            long h2 = vv.h();
            if (0 > h2) {
                d2 = (double) (h2 / 1000);
                String format = xa.a.format(0.0d);
                String format2 = xa.a.format(d2);
                vrVar.d.d("Delay start of %s seconds bigger than max allowed value of %s seconds", format, format2);
            } else {
                h2 = 0;
                d2 = 0.0d;
            }
            String format3 = xa.a.format(d2);
            vrVar.d.c("Waiting %s seconds before starting first session", format3);
            vrVar.n.a(h2);
            vrVar.f.e = true;
            ActivityState activityState = vrVar.l;
            if (activityState != null) {
                activityState.updatePackages = true;
                vrVar.x();
            }
        }
    }

    static /* synthetic */ void b(vr vrVar, boolean z) {
        vrVar.l.askingAttribution = z;
        vrVar.x();
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        boolean z2;
        boolean o2 = o();
        if (o2 != z) {
            z2 = true;
        } else {
            if (o2) {
                this.d.b("Adjust already enabled", new Object[0]);
            } else {
                this.d.b("Adjust already disabled", new Object[0]);
            }
            z2 = false;
        }
        if (z2) {
            if (!z || !this.l.isGdprForgotten) {
                a aVar = this.f;
                aVar.a = z;
                if (aVar.c()) {
                    a(!z, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                    return;
                }
                this.l.enabled = z;
                x();
                if (z) {
                    wz wzVar = new wz(this.g.c);
                    if (wzVar.g()) {
                        w();
                    }
                    if (!wzVar.f()) {
                        a(System.currentTimeMillis());
                    }
                    a(wzVar);
                }
                a(!z, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
                return;
            }
            this.d.f("Re-enabling SDK not possible for forgotten user", new Object[0]);
        }
    }

    private boolean b(long j2) {
        if (!y()) {
            return false;
        }
        long j3 = j2 - this.l.lastActivity;
        if (j3 > j) {
            return false;
        }
        ActivityState activityState = this.l;
        activityState.lastActivity = j2;
        if (j3 < 0) {
            this.d.f("Time travel!", new Object[0]);
        } else {
            activityState.sessionLength += j3;
            this.l.timeSpent += j3;
        }
        return true;
    }

    private void c(long j2) {
        wp wpVar = new wp(this.g, this.q, this.l, this.u, j2);
        this.c.a(wpVar.a(this.f.d));
        this.c.a();
    }

    static /* synthetic */ void c(vr vrVar) {
        if (vrVar.o()) {
            xj xjVar = vrVar.m;
            if (!xjVar.g) {
                xjVar.h.a("%s is already started", xjVar.c);
                return;
            }
            xjVar.h.a("%s starting", xjVar.c);
            xjVar.b = xjVar.a.a(new Runnable() {
                public final void run() {
                    xj.this.h.a("%s fired", xj.this.c);
                    xj.this.d.run();
                }
            }, xjVar.e, xjVar.f);
            xjVar.g = false;
        }
    }

    private boolean c(boolean z) {
        return z ? this.f.b || !o() : this.f.b || !o() || this.f.d;
    }

    static /* synthetic */ void d(vr vrVar) {
        if (vrVar.f.c()) {
            vrVar.r();
            vrVar.l = new ActivityState();
            vrVar.f.h = true;
            long currentTimeMillis = System.currentTimeMillis();
            wz wzVar = new wz(vrVar.g.c);
            vrVar.l.pushToken = wzVar.c();
            if (vrVar.f.a) {
                if (!wzVar.g()) {
                    vrVar.l.sessionCount = 1;
                    vrVar.c(currentTimeMillis);
                    vrVar.a(wzVar);
                } else {
                    vrVar.w();
                }
            }
            vrVar.l.a(currentTimeMillis);
            vrVar.l.enabled = vrVar.f.a;
            vrVar.l.updatePackages = vrVar.f.e;
            vrVar.x();
            wzVar.d();
            wzVar.h();
            vrVar.p();
            return;
        }
        if (vrVar.l.enabled) {
            vrVar.r();
            if (!vrVar.l.isGdprForgotten) {
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - vrVar.l.lastActivity;
                if (j2 < 0) {
                    vrVar.d.f("Time travel!", new Object[0]);
                    vrVar.l.lastActivity = currentTimeMillis2;
                    vrVar.x();
                } else if (j2 > j) {
                    vrVar.a(currentTimeMillis2);
                    vrVar.a(new wz(vrVar.g.c));
                } else if (j2 > k) {
                    vrVar.l.subsessionCount++;
                    vrVar.l.sessionLength += j2;
                    ActivityState activityState = vrVar.l;
                    activityState.lastActivity = currentTimeMillis2;
                    vrVar.d.a("Started subsession %d of session %d", Integer.valueOf(activityState.subsessionCount), Integer.valueOf(vrVar.l.sessionCount));
                    vrVar.x();
                    vrVar.v.a();
                } else {
                    vrVar.d.a("Time span since last activity too short for a new subsession", new Object[0]);
                }
            }
            if (vrVar.y() && ((!vrVar.f.f || !(!vrVar.f.g)) && (vrVar.r == null || vrVar.l.askingAttribution))) {
                vrVar.s.a();
            }
            vrVar.p();
        }
    }

    private boolean d(boolean z) {
        if (c(z)) {
            return false;
        }
        return this.f.a();
    }

    static /* synthetic */ void e(vr vrVar) {
        if (!vrVar.d(false)) {
            vrVar.s();
        }
        if (vrVar.b(System.currentTimeMillis())) {
            vrVar.x();
        }
    }

    static /* synthetic */ void h(vr vrVar) {
        vrVar.l.isGdprForgotten = true;
        vrVar.x();
        vrVar.c.d();
        vrVar.b(false);
    }

    static /* synthetic */ void i(vr vrVar) {
        if (!vrVar.o()) {
            vrVar.m();
            return;
        }
        if (vrVar.d(false)) {
            vrVar.c.a();
        }
        if (vrVar.b(System.currentTimeMillis())) {
            vrVar.x();
        }
    }

    private boolean o() {
        ActivityState activityState = this.l;
        return activityState != null ? activityState.enabled : this.f.a;
    }

    private void p() {
        if (y()) {
            wz wzVar = new wz(this.g.c);
            String i2 = wzVar.i();
            long j2 = wzVar.j();
            if (i2 != null && j2 != -1) {
                a(Uri.parse(i2), j2);
                wzVar.k();
            }
        }
    }

    /* access modifiers changed from: private */
    public void q() {
        if (o() && !this.f.c()) {
            this.t.c();
        }
    }

    private void r() {
        if (!d(false)) {
            s();
            return;
        }
        t();
        this.c.a();
    }

    private void s() {
        this.s.b();
        this.c.b();
        if (!d(true)) {
            this.t.a();
        } else {
            this.t.b();
        }
    }

    private void t() {
        this.s.c();
        this.c.c();
        this.t.b();
    }

    private void u() {
        this.c.a(this.u);
        this.f.e = false;
        ActivityState activityState = this.l;
        if (activityState != null) {
            activityState.updatePackages = false;
            x();
        }
    }

    private boolean v() {
        ActivityState activityState = this.l;
        return activityState != null ? activityState.updatePackages : this.f.e;
    }

    /* access modifiers changed from: private */
    public void w() {
        if (y() && o() && !this.l.isGdprForgotten) {
            this.l.isGdprForgotten = true;
            x();
            wp wpVar = new wp(this.g, this.q, this.l, this.u, System.currentTimeMillis());
            this.c.a(wpVar.a());
            new wz(this.g.c).h();
            this.c.a();
        }
    }

    private void x() {
        synchronized (ActivityState.class) {
            if (this.l != null) {
                xa.a(this.l, this.g.c, "AdjustIoActivityState", "Activity state");
            }
        }
    }

    private boolean y() {
        if (!this.f.c()) {
            return true;
        }
        this.d.f("Sdk did not yet start", new Object[0]);
        return false;
    }

    public final vt a() {
        return this.g;
    }

    public final void a(final Uri uri, final long j2) {
        this.b.a(new Runnable() {
            public final void run() {
                vr.a(vr.this, uri, j2);
            }
        });
    }

    public final void a(final vu vuVar) {
        this.b.a(new Runnable() {
            public final void run() {
                if (vr.this.f.c()) {
                    vr.this.d.d("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                    vr.d(vr.this);
                }
                vr.a(vr.this, vuVar);
            }
        });
    }

    public final void a(final vz vzVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vr.a(vr.this, vzVar);
            }
        });
    }

    public final void a(wu wuVar) {
        if (wuVar instanceof wy) {
            this.s.a((wy) wuVar);
        } else if (wuVar instanceof ww) {
            ww wwVar = (ww) wuVar;
            if (wwVar.a) {
                this.l.clickTime = wwVar.j;
                this.l.installBegin = wwVar.k;
                this.l.installReferrer = wwVar.l;
                x();
            }
            this.s.a(wwVar);
        } else {
            if (wuVar instanceof wb) {
                final wb wbVar = (wb) wuVar;
                this.b.a(new Runnable() {
                    public final void run() {
                        vr.a(vr.this, wbVar);
                    }
                });
            }
        }
    }

    public final void a(final ww wwVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vr.a(vr.this, wwVar);
            }
        });
    }

    public final void a(final wy wyVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vr.a(vr.this, wyVar);
            }
        });
    }

    public final void a(final boolean z) {
        this.b.a(new Runnable() {
            public final void run() {
                vr.b(vr.this, z);
            }
        });
    }

    public final wa b() {
        return this.q;
    }

    public final ActivityState c() {
        return this.l;
    }

    public final wx d() {
        return this.u;
    }

    public final void e() {
        this.f.c = false;
        this.b.a(new Runnable() {
            public final void run() {
                vr.b(vr.this);
                vr vrVar = vr.this;
                if (vrVar.e != null) {
                    vrVar.e.a(false);
                }
                vr.c(vr.this);
                vr.this.d.a("Subsession start", new Object[0]);
                vr.d(vr.this);
            }
        });
    }

    public final void f() {
        this.f.c = true;
        this.b.a(new Runnable() {
            public final void run() {
                vr.this.m();
                vr vrVar = vr.this;
                if (vrVar.e != null && vrVar.n() && vrVar.e.a() <= 0) {
                    vrVar.e.a(vr.a);
                }
                vr.this.d.a("Subsession end", new Object[0]);
                vr.e(vr.this);
            }
        });
    }

    public final boolean g() {
        return o();
    }

    public final void h() {
        this.b.a(new Runnable() {
            public final void run() {
                vr.this.q();
            }
        });
    }

    public final void i() {
        this.b.a(new Runnable() {
            public final void run() {
                vr.h(vr.this);
            }
        });
    }

    public final Context j() {
        return this.g.c;
    }

    public final String k() {
        return this.o;
    }

    public final String l() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        xj xjVar = this.m;
        if (xjVar.g) {
            xjVar.h.a("%s is already suspended", xjVar.c);
            return;
        }
        xjVar.e = xjVar.b.getDelay(TimeUnit.MILLISECONDS);
        xjVar.b.cancel(false);
        DecimalFormat decimalFormat = xa.a;
        double d2 = (double) xjVar.e;
        Double.isNaN(d2);
        String format = decimalFormat.format(d2 / 1000.0d);
        xjVar.h.a("%s suspended with %s seconds left", xjVar.c, format);
        xjVar.g = true;
    }

    /* access modifiers changed from: 0000 */
    public boolean n() {
        return d(false);
    }
}
