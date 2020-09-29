package defpackage;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akx reason: default package */
final class akx {
    private final SharedPreferences a = akq.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    akx() {
    }

    /* access modifiers changed from: 0000 */
    public final akw a() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new akw(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(akw akw) {
        anl.a((Object) akw, "profile");
        JSONObject c = akw.c();
        if (c != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
