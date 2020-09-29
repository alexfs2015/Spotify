package defpackage;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akj reason: default package */
final class akj {
    private final SharedPreferences a = akc.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    akj() {
    }

    /* access modifiers changed from: 0000 */
    public final aki a() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new aki(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(aki aki) {
        amx.a((Object) aki, "profile");
        JSONObject c = aki.c();
        if (c != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
