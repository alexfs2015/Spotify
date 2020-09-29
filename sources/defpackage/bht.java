package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: bht reason: default package */
final /* synthetic */ class bht implements cpb {
    static final cpb a = new bht();

    private bht() {
    }

    public final cpr a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            String string = jSONObject.getString("appSettingsJson");
            clw g = bjl.i().g();
            g.a();
            synchronized (g.a) {
                long a2 = bjl.l().a();
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
        return cpg.a(null);
    }
}
