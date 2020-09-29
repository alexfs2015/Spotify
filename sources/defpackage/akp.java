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

/* renamed from: akp reason: default package */
final class akp {
    private static final String a = akp.class.getName();
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static a c = new a(true, "com.facebook.sdk.AutoInitEnabled");
    private static a d = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */
    public static a e = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */
    public static a f = new a(false, "auto_event_setup_enabled");
    private static SharedPreferences g;
    private static Editor h;

    /* renamed from: akp$a */
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

    akp() {
    }

    private static void g() {
        if (akc.a()) {
            if (b.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = akc.g().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
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
                    Context g2 = akc.g();
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
            akc.e().execute(new Runnable() {
                public final void run() {
                    if (akp.e.a()) {
                        amg a2 = FetchedAppSettingsManager.a(akc.k(), false);
                        if (a2 != null && a2.j) {
                            alu a3 = alu.a(akc.g());
                            if (((a3 == null || a3.a() == null) ? null : a3.a()) != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString(Ad.METADATA_ADVERTISER_ID, a3.a());
                                String str = "auto_event_setup_enabled";
                                bundle.putString("fields", str);
                                akd a4 = akd.a((aju) null, akc.k(), (b) null);
                                a4.h = true;
                                a4.d = bundle;
                                JSONObject jSONObject = akd.a(a4).a;
                                if (jSONObject != null) {
                                    akp.f.b = Boolean.valueOf(jSONObject.optBoolean(str, false));
                                    akp.f.d = currentTimeMillis;
                                    akp.b(akp.f);
                                }
                            }
                        }
                    }
                }
            });
        }
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
            amw.a(a, (Exception) e2);
        }
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
            amw.a(a, (Exception) e2);
        }
    }

    private static void d(a aVar) {
        j();
        try {
            Context g2 = akc.g();
            ApplicationInfo applicationInfo = g2.getPackageManager().getApplicationInfo(g2.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(aVar.a))) {
                aVar.b = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.a, aVar.c));
            }
        } catch (NameNotFoundException e2) {
            amw.a(a, (Exception) e2);
        }
    }

    private static void i() {
        int i;
        if (b.get() && akc.a()) {
            Context g2 = akc.g();
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
                        akw akw = new akw(g2);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i3);
                        bundle.putInt("current", a2);
                        akw.b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                akw akw2 = new akw(g2);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i3);
                bundle2.putInt("current", a2);
                akw2.b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    private static void j() {
        if (!b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    public static boolean a() {
        g();
        return c.a();
    }

    public static boolean b() {
        g();
        return d.a();
    }

    public static boolean c() {
        g();
        return e.a();
    }

    public static boolean d() {
        g();
        return f.a();
    }
}
