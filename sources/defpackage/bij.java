package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

@cfp
/* renamed from: bij reason: default package */
public final class bij {
    private final Object a = new Object();
    private Context b;
    private long c = 0;

    public final void a(Context context, cpp cpp, String str, Runnable runnable) {
        a(context, cpp, true, null, str, null, runnable);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, cpp cpp, boolean z, clu clu, String str, String str2, Runnable runnable) {
        if (bkc.l().b() - this.c < 5000) {
            cpn.a(5);
            return;
        }
        this.c = bkc.l().b();
        boolean z2 = true;
        if (clu != null) {
            if (!(bkc.l().a() - clu.a > ((Long) dqe.f().a(dtg.cr)).longValue()) && clu.e) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                cpn.a(5);
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.b = applicationContext;
                ecf a2 = bkc.s().a(this.b, cpp);
                ecb<JSONObject> ecb = ecc.a;
                ebx a3 = a2.a("google.afma.config.fetchAppSettings", ecb, ecb);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    cqi b2 = a3.b(jSONObject);
                    cqi a4 = cpx.a(b2, bik.a, cqo.b);
                    if (runnable != null) {
                        b2.a(runnable, cqo.b);
                    }
                    cpv.a(a4, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    cml.a("Error requesting application settings", e);
                }
            } else {
                cpn.a(5);
            }
        }
    }
}
