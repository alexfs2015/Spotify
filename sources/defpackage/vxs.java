package defpackage;

import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.SettingsCacheBehavior;
import org.json.JSONObject;

/* renamed from: vxs reason: default package */
final class vxs implements vya {
    private final vye a;
    private final vyd b;
    private final vvr c;
    private final vxp d;
    private final vyf e;
    private final vuz f;
    private final vxh g = new vxi(this.f);

    public vxs(vuz vuz, vye vye, vvr vvr, vyd vyd, vxp vxp, vyf vyf) {
        this.f = vuz;
        this.a = vye;
        this.c = vvr;
        this.b = vyd;
        this.d = vxp;
        this.e = vyf;
    }

    public final vyb a() {
        return a(SettingsCacheBehavior.USE_CACHE);
    }

    public final vyb a(SettingsCacheBehavior settingsCacheBehavior) {
        new vvw();
        String str = "Fabric";
        vyb vyb = null;
        if (!vvw.b(this.f.h)) {
            vuu.a().a(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            String str2 = "existing_instance_identifier";
            if (!vuu.b()) {
                if (!(!this.g.a().getString(str2, "").equals(b()))) {
                    vyb = b(settingsCacheBehavior);
                }
            }
            if (vyb == null) {
                JSONObject a2 = this.e.a(this.a);
                if (a2 != null) {
                    vyb = this.b.a(this.c, a2);
                    this.d.a(vyb.f, a2);
                    a(a2, "Loaded settings: ");
                    String b2 = b();
                    Editor b3 = this.g.b();
                    b3.putString(str2, b2);
                    this.g.a(b3);
                }
            }
            if (vyb == null) {
                vyb = b(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            vuu.a().c(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e2);
        }
        return vyb;
    }

    private vyb b(SettingsCacheBehavior settingsCacheBehavior) {
        String str = "Fabric";
        vyb vyb = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject a2 = this.d.a();
            if (a2 != null) {
                vyb a3 = this.b.a(this.c, a2);
                a(a2, "Loaded cached settings: ");
                long a4 = this.c.a();
                if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                    if (a3.f < a4) {
                        vuu.a().a(str, "Cached settings have expired.");
                        return null;
                    }
                }
                try {
                    vuu.a().a(str, "Returning cached settings.");
                    return a3;
                } catch (Exception e2) {
                    e = e2;
                    vyb = a3;
                    vuu.a().c(str, "Failed to get cached settings", e);
                    return vyb;
                }
            } else {
                vuu.a().a(str, "No cached settings data found.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static void a(JSONObject jSONObject, String str) {
        vvc a2 = vuu.a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        a2.a("Fabric", sb.toString());
    }

    private String b() {
        return CommonUtils.a(CommonUtils.k(this.f.h));
    }
}
