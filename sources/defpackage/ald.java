package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.internal.FetchedAppSettingsManager;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ald reason: default package */
final class ald {
    private static final String a = ald.class.getName();
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static a c = new a(true, "com.facebook.sdk.AutoInitEnabled");
    private static a d = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */
    public static a e = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */
    public static a f = new a(false, "auto_event_setup_enabled");
    private static SharedPreferences g;
    private static Editor h;

    /* renamed from: ald$a */
    static class a {
        String a;
        Boolean b;
        boolean c;
        long d;

        a(boolean z, String str) {
            this.c = z;
            this.a = str;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            Boolean bool = this.b;
            return bool == null ? this.c : bool.booleanValue();
        }
    }

    ald() {
    }

    public static boolean a() {
        g();
        return c.a();
    }

    /* access modifiers changed from: private */
    public static void b(a aVar) {
        j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.b);
            jSONObject.put("last_timestamp", aVar.d);
            h.putString(aVar.a, jSONObject.toString()).commit();
            i();
        } catch (JSONException e2) {
            ank.a(a, (Exception) e2);
        }
    }

    public static boolean b() {
        g();
        return d.a();
    }

    private static void c(a aVar) {
        j();
        try {
            String string = g.getString(aVar.a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                aVar.b = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e2) {
            ank.a(a, (Exception) e2);
        }
    }

    public static boolean c() {
        g();
        return e.a();
    }

    private static void d(a aVar) {
        j();
        try {
            Context g2 = akq.g();
            ApplicationInfo applicationInfo = g2.getPackageManager().getApplicationInfo(g2.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(aVar.a))) {
                aVar.b = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.a, aVar.c));
            }
        } catch (NameNotFoundException e2) {
            ank.a(a, (Exception) e2);
        }
    }

    public static boolean d() {
        g();
        return f.a();
    }

    private static void g() {
        if (akq.a()) {
            if (b.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = akq.g().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                g = sharedPreferences;
                h = sharedPreferences.edit();
                a[] aVarArr = {d, e, c};
                for (int i = 0; i < 3; i++) {
                    a aVar = aVarArr[i];
                    if (aVar == f) {
                        h();
                    } else if (aVar.b == null) {
                        c(aVar);
                        if (aVar.b == null) {
                            d(aVar);
                        }
                    } else {
                        b(aVar);
                    }
                }
                h();
                try {
                    Context g2 = akq.g();
                    ApplicationInfo applicationInfo = g2.getPackageManager().getApplicationInfo(g2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                        applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        c();
                    }
                } catch (NameNotFoundException unused) {
                }
                i();
            }
        }
    }

    private static void h() {
        c(f);
        final long currentTimeMillis = System.currentTimeMillis();
        if (f.b == null || currentTimeMillis - f.d >= 604800000) {
            a aVar = f;
            aVar.b = null;
            aVar.d = 0;
            akq.e().execute(new Runnable() {
                public final void run() {
                    if (ald.e.a()) {
                        amu a2 = FetchedAppSettingsManager.a(akq.k(), false);
                        if (a2 != null && a2.j) {
                            ami a3 = ami.a(akq.g());
                            if (((a3 == null || a3.a() == null) ? null : a3.a()) != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString(Ad.METADATA_ADVERTISER_ID, a3.a());
                                String str = "auto_event_setup_enabled";
                                bundle.putString("fields", str);
                                akr a4 = akr.a((aki) null, akq.k(), (b) null);
                                a4.h = true;
                                a4.d = bundle;
                                JSONObject jSONObject = akr.a(a4).a;
                                if (jSONObject != null) {
                                    ald.f.b = Boolean.valueOf(jSONObject.optBoolean(str, false));
                                    ald.f.d = currentTimeMillis;
                                    ald.b(ald.f);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    private static void i() {
        int i;
        if (b.get() && akq.a()) {
            Context g2 = akq.g();
            int i2 = 0;
            boolean a2 = c.a() | false | ((d.a() ? 1 : 0) << true) | ((e.a() ? 1 : 0) << true);
            String str = "com.facebook.sdk.USER_SETTINGS_BITMASK";
            int i3 = g.getInt(str, 0);
            if (i3 != a2) {
                h.putInt(str, a2 ? 1 : 0).commit();
                try {
                    ApplicationInfo applicationInfo = g2.getPackageManager().getApplicationInfo(g2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = {true, true, true};
                        int i4 = 0;
                        int i5 = 0;
                        i = 0;
                        while (i4 < 3) {
                            try {
                                i |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                                i5 |= (applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) ? 1 : 0) << i4;
                                i4++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i2 = i5;
                        alk alk = new alk(g2);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i3);
                        bundle.putInt("current", a2);
                        alk.b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                alk alk2 = new alk(g2);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i3);
                bundle2.putInt("current", a2);
                alk2.b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    private static void j() {
        if (!b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }
}
