package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: hwh reason: default package */
final class hwh {
    final b<Object, JSONArray> a;
    final SpSharedPreferences<Object> b;
    private final jtz c = jtp.a;

    hwh(b<Object, JSONArray> bVar, SpSharedPreferences<Object> spSharedPreferences, gcb gcb) {
        this.a = bVar;
        this.b = spSharedPreferences;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        if (this.b.e(this.a)) {
            try {
                JSONArray jSONArray = (JSONArray) fbp.a(this.b.a(this.a, new JSONArray()));
                if (jSONArray.length() != 2) {
                    Assertion.b("Token array is not of length 2");
                } else if (jSONArray.getLong(1) >= this.c.c()) {
                    return jSONArray.getString(0);
                }
            } catch (JSONException unused) {
                Logger.e("Stored token array is malformed", new Object[0]);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, long j) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(0, str);
            jSONArray.put(1, this.c.c() + j);
            this.b.a().a(this.a, jSONArray).b();
        } catch (JSONException unused) {
            Logger.e("Could not store access token", new Object[0]);
        }
    }
}
