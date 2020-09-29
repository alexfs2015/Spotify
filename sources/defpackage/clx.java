package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: clx reason: default package */
final class clx extends clz {
    private final /* synthetic */ Context a;
    private final /* synthetic */ clw b;

    clx(clw clw, Context context) {
        this.b = clw;
        this.a = context;
        super(0);
    }

    public final void a() {
        boolean z = false;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Editor edit = sharedPreferences.edit();
        synchronized (this.b.a) {
            this.b.c = sharedPreferences;
            this.b.d = edit;
            clw clw = this.b;
            if ((VERSION.SDK_INT >= 23) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            clw.e = z;
            this.b.f = this.b.c.getBoolean("use_https", this.b.f);
            this.b.r = this.b.c.getBoolean("content_url_opted_out", this.b.r);
            this.b.g = this.b.c.getString("content_url_hashes", this.b.g);
            this.b.i = this.b.c.getBoolean("auto_collect_location", this.b.i);
            this.b.s = this.b.c.getBoolean("content_vertical_opted_out", this.b.s);
            this.b.h = this.b.c.getString("content_vertical_hashes", this.b.h);
            this.b.o = this.b.c.getInt("version_code", this.b.o);
            this.b.j = this.b.c.getString("app_settings_json", this.b.j);
            this.b.k = this.b.c.getLong("app_settings_last_update_ms", this.b.k);
            this.b.l = this.b.c.getLong("app_last_background_time_ms", this.b.l);
            this.b.n = this.b.c.getInt("request_in_session_count", this.b.n);
            this.b.m = this.b.c.getLong("first_ad_req_time_ms", this.b.m);
            this.b.p = this.b.c.getStringSet("never_pool_slots", this.b.p);
            try {
                this.b.q = new JSONObject(this.b.c.getString("native_advanced_settings", "{}"));
            } catch (JSONException unused) {
                cow.a(5);
            }
            this.b.a(this.b.b());
        }
    }
}
