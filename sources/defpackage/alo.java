package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: alo reason: default package */
public class alo {
    private static final String a = alo.class.getCanonicalName();
    private String b;
    private Uri c;
    private JSONObject d;
    private Bundle e;
    private String f;

    public static alo a(Intent intent) {
        String str = "promo_code";
        if (intent == null) {
            return null;
        }
        Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
        if (bundleExtra == null) {
            return null;
        }
        alo alo = new alo();
        alo.c = intent.getData();
        if (alo.c == null) {
            String string = bundleExtra.getString("target_url");
            if (string != null) {
                alo.c = Uri.parse(string);
            }
        }
        alo.e = bundleExtra;
        alo.d = null;
        Bundle bundle = bundleExtra.getBundle("referer_data");
        if (bundle != null) {
            alo.b = bundle.getString("fb_ref");
        }
        Bundle bundle2 = bundleExtra.getBundle("extras");
        if (bundle2 != null) {
            String string2 = bundle2.getString("deeplink_context");
            if (string2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has(str)) {
                        alo.f = jSONObject.getString(str);
                    }
                } catch (JSONException e2) {
                    amw.a(a, "Unable to parse deeplink_context JSON", (Throwable) e2);
                }
            }
        }
        return alo;
    }

    private alo() {
    }
}
