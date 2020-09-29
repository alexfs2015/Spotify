package defpackage;

import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.SettingsCacheBehavior;
import org.json.JSONObject;

/* renamed from: wly reason: default package */
final class wly implements wmg {
    private final wmk a;
    private final wmj b;
    private final wjx c;
    private final wlv d;
    private final wml e;
    private final wjf f;
    private final wln g = new wlo(this.f);

    public wly(wjf wjf, wmk wmk, wjx wjx, wmj wmj, wlv wlv, wml wml) {
        this.f = wjf;
        this.a = wmk;
        this.c = wjx;
        this.b = wmj;
        this.d = wlv;
        this.e = wml;
    }

    private static void a(JSONObject jSONObject, String str) {
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        a2.a("Fabric", sb.toString());
    }

    private String b() {
        return CommonUtils.a(CommonUtils.k(this.f.h));
    }

    private wmh b(SettingsCacheBehavior settingsCacheBehavior) {
        String str = "Fabric";
        wmh wmh = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject a2 = this.d.a();
            if (a2 != null) {
                wmh a3 = this.b.a(this.c, a2);
                a(a2, "Loaded cached settings: ");
                long a4 = this.c.a();
                if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                    if (a3.f < a4) {
                        wja.a().a(str, "Cached settings have expired.");
                        return null;
                    }
                }
                try {
                    wja.a().a(str, "Returning cached settings.");
                    return a3;
                } catch (Exception e2) {
                    e = e2;
                    wmh = a3;
                    wja.a().c(str, "Failed to get cached settings", e);
                    return wmh;
                }
            } else {
                wja.a().a(str, "No cached settings data found.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final wmh a() {
        return a(SettingsCacheBehavior.USE_CACHE);
    }

    public final wmh a(SettingsCacheBehavior settingsCacheBehavior) {
        new wkc();
        String str = "Fabric";
        wmh wmh = null;
        if (!wkc.b(this.f.h)) {
            wja.a().a(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            String str2 = "existing_instance_identifier";
            if (!wja.b()) {
                if (!(!this.g.a().getString(str2, "").equals(b()))) {
                    wmh = b(settingsCacheBehavior);
                }
            }
            if (wmh == null) {
                JSONObject a2 = this.e.a(this.a);
                if (a2 != null) {
                    wmh = this.b.a(this.c, a2);
                    this.d.a(wmh.f, a2);
                    a(a2, "Loaded settings: ");
                    String b2 = b();
                    Editor b3 = this.g.b();
                    b3.putString(str2, b2);
                    this.g.a(b3);
                }
            }
            if (wmh == null) {
                wmh = b(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            wja.a().c(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e2);
        }
        return wmh;
    }
}
