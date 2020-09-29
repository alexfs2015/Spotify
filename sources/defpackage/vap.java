package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vap reason: default package */
public final class vap {
    final SpSharedPreferences<Object> a;
    final jtz b;

    public vap(SpSharedPreferences<Object> spSharedPreferences, jtz jtz) {
        this.a = spSharedPreferences;
        this.b = jtz;
    }

    public final Optional<String> a(b<Object, JSONObject> bVar, String str) {
        if (!this.a.e(bVar)) {
            return Optional.e();
        }
        try {
            JSONObject d = this.a.d(bVar);
            String string = d.getString("id");
            if (string != null) {
                if (string.equals(str)) {
                    if (this.b.a() < d.getLong("timestamp_ms") + d.getLong("ttl")) {
                        return Optional.c(d.getString("wrapped_value"));
                    }
                    this.a.a().a(bVar);
                    return Optional.e();
                }
            }
            return Optional.e();
        } catch (JSONException unused) {
            Logger.b("Unable to read value for key: %s", bVar.a);
        }
    }
}
