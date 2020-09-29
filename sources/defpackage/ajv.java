package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ajv reason: default package */
final class ajv {
    private final SharedPreferences a;
    private final a b;
    private akh c;

    /* renamed from: ajv$a */
    static class a {
        a() {
        }
    }

    private ajv(SharedPreferences sharedPreferences, a aVar) {
        this.a = sharedPreferences;
        this.b = aVar;
    }

    public ajv() {
        this(akc.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
    }

    public final void a(aju aju) {
        amx.a((Object) aju, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aju.e().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final void b() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (akc.d()) {
            d().b();
        }
    }

    private aju c() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return aju.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private akh d() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new akh(akc.g());
                }
            }
        }
        return this.c;
    }

    public final aju a() {
        aju aju = null;
        if (this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return c();
        }
        if (!akc.d()) {
            return null;
        }
        Bundle a2 = d().a();
        if (a2 != null && akh.a(a2)) {
            aju = aju.a(a2);
        }
        if (aju == null) {
            return aju;
        }
        a(aju);
        d().b();
        return aju;
    }
}
