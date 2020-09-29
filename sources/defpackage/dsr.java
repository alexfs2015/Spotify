package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@cey
/* renamed from: dsr reason: default package */
public final class dsr {
    String a;
    Map<String, String> b;
    Context c = null;
    String d = null;

    public dsr(Context context, String str) {
        this.c = context;
        this.d = str;
        this.a = (String) dpn.f().a(dsp.O);
        this.b = new LinkedHashMap();
        this.b.put("s", "gmob_sdk");
        this.b.put("v", "3");
        this.b.put("os", VERSION.RELEASE);
        this.b.put("sdk", VERSION.SDK);
        Map<String, String> map = this.b;
        bjl.e();
        map.put("device", cmd.b());
        this.b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.b;
        bjl.e();
        map2.put("is_lite_sdk", cmd.j(context) ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        Future a2 = bjl.p().a(this.c);
        try {
            a2.get();
            this.b.put("network_coarse", Integer.toString(((chr) a2.get()).n));
            this.b.put("network_fine", Integer.toString(((chr) a2.get()).o));
        } catch (Exception e) {
            bjl.i().a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }
}
