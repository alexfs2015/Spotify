package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: chw reason: default package */
public final class chw extends chy {
    final Context a;
    SharedPreferences b;
    private final Object c = new Object();
    private final ebg<JSONObject, JSONObject> d;

    public chw(Context context, ebg<JSONObject, JSONObject> ebg) {
        this.a = context.getApplicationContext();
        this.d = ebg;
    }

    public final cpr<Void> a() {
        synchronized (this.c) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (bjl.l().a() - this.b.getLong("js_last_update", 0) < ((Long) dpn.f().a(dsp.bS)).longValue()) {
            return cpg.a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", coy.a().a);
            jSONObject.put("mf", dpn.f().a(dsp.bT));
            jSONObject.put("cl", "193400285");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return cpg.a(this.d.b(jSONObject), (cpc<A, B>) new chx<A,B>(this), cpx.b);
        } catch (JSONException e) {
            clu.a("Unable to populate SDK Core Constants parameters.", e);
            return cpg.a(null);
        }
    }
}
