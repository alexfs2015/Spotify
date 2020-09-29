package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akj reason: default package */
final class akj {
    private final SharedPreferences a;
    private final a b;
    private akv c;

    /* renamed from: akj$a */
    static class a {
        a() {
        }
    }

    public akj() {
        this(akq.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
    }

    private akj(SharedPreferences sharedPreferences, a aVar) {
        this.a = sharedPreferences;
        this.b = aVar;
    }

    private aki c() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return aki.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private akv d() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new akv(akq.g());
                }
            }
        }
        return this.c;
    }

    public final aki a() {
        aki aki = null;
        if (this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return c();
        }
        if (!akq.d()) {
            return null;
        }
        Bundle a2 = d().a();
        if (a2 != null && akv.a(a2)) {
            aki = aki.a(a2);
        }
        if (aki == null) {
            return aki;
        }
        a(aki);
        d().b();
        return aki;
    }

    public final void a(aki aki) {
        anl.a((Object) aki, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aki.e().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final void b() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (akq.d()) {
            d().b();
        }
    }
}
