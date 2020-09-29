package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: bik reason: default package */
final /* synthetic */ class bik implements cps {
    static final cps a = new bik();

    private bik() {
    }

    public final cqi a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            String string = jSONObject.getString("appSettingsJson");
            cmn g = bkc.i().g();
            g.a();
            synchronized (g.a) {
                long a2 = bkc.l().a();
                g.k = a2;
                if (string != null) {
                    if (!string.equals(g.j)) {
                        g.j = string;
                        if (g.d != null) {
                            g.d.putString("app_settings_json", string);
                            g.d.putLong("app_settings_last_update_ms", a2);
                            g.d.apply();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("app_settings_json", string);
                        bundle.putLong("app_settings_last_update_ms", a2);
                        g.a(bundle);
                    }
                }
            }
        }
        return cpx.a(null);
    }
}
