package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

@cey
/* renamed from: bhs reason: default package */
public final class bhs {
    private final Object a = new Object();
    private Context b;
    private long c = 0;

    public final void a(Context context, coy coy, String str, Runnable runnable) {
        a(context, coy, true, null, str, null, runnable);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, coy coy, boolean z, cld cld, String str, String str2, Runnable runnable) {
        if (bjl.l().b() - this.c < 5000) {
            cow.a(5);
            return;
        }
        this.c = bjl.l().b();
        boolean z2 = true;
        if (cld != null) {
            if (!(bjl.l().a() - cld.a > ((Long) dpn.f().a(dsp.cr)).longValue()) && cld.e) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                cow.a(5);
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.b = applicationContext;
                ebo a2 = bjl.s().a(this.b, coy);
                ebk<JSONObject> ebk = ebl.a;
                ebg a3 = a2.a("google.afma.config.fetchAppSettings", ebk, ebk);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    cpr b2 = a3.b(jSONObject);
                    cpr a4 = cpg.a(b2, bht.a, cpx.b);
                    if (runnable != null) {
                        b2.a(runnable, cpx.b);
                    }
                    cpe.a(a4, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    clu.a("Error requesting application settings", e);
                }
            } else {
                cow.a(5);
            }
        }
    }
}
