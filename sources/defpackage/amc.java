package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amc reason: default package */
public class amc {
    private static final String a = amc.class.getCanonicalName();
    private String b;
    private Uri c;
    private JSONObject d;
    private Bundle e;
    private String f;

    private amc() {
    }

    public static amc a(Intent intent) {
        String str = "promo_code";
        if (intent == null) {
            return null;
        }
        Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
        if (bundleExtra == null) {
            return null;
        }
        amc amc = new amc();
        amc.c = intent.getData();
        if (amc.c == null) {
            String string = bundleExtra.getString("target_url");
            if (string != null) {
                amc.c = Uri.parse(string);
            }
        }
        amc.e = bundleExtra;
        amc.d = null;
        Bundle bundle = bundleExtra.getBundle("referer_data");
        if (bundle != null) {
            amc.b = bundle.getString("fb_ref");
        }
        Bundle bundle2 = bundleExtra.getBundle("extras");
        if (bundle2 != null) {
            String string2 = bundle2.getString("deeplink_context");
            if (string2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has(str)) {
                        amc.f = jSONObject.getString(str);
                    }
                } catch (JSONException e2) {
                    ank.a(a, "Unable to parse deeplink_context JSON", (Throwable) e2);
                }
            }
        }
        return amc;
    }
}
