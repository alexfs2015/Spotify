package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: cin reason: default package */
public final class cin extends cip {
    final Context a;
    SharedPreferences b;
    private final Object c = new Object();
    private final ebx<JSONObject, JSONObject> d;

    public cin(Context context, ebx<JSONObject, JSONObject> ebx) {
        this.a = context.getApplicationContext();
        this.d = ebx;
    }

    public final cqi<Void> a() {
        synchronized (this.c) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (bkc.l().a() - this.b.getLong("js_last_update", 0) < ((Long) dqe.f().a(dtg.bS)).longValue()) {
            return cpx.a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", cpp.a().a);
            jSONObject.put("mf", dqe.f().a(dtg.bT));
            jSONObject.put("cl", "193400285");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return cpx.a(this.d.b(jSONObject), (cpt<A, B>) new cio<A,B>(this), cqo.b);
        } catch (JSONException e) {
            cml.a("Unable to populate SDK Core Constants parameters.", e);
            return cpx.a(null);
        }
    }
}
