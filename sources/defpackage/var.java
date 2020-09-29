package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: var reason: default package */
public final class var<T> {
    final vap a;
    final ObjectMapper b;
    private final Class<T> c;

    public var(Class<T> cls, vap vap, ObjectMapper objectMapper) {
        this.c = cls;
        this.a = vap;
        this.b = objectMapper;
    }

    public final Optional<T> a(b<Object, JSONObject> bVar, String str) {
        Optional a2 = this.a.a(bVar, str);
        if (!a2.b()) {
            return Optional.e();
        }
        try {
            return Optional.c(this.b.readValue((String) a2.c(), this.c));
        } catch (IOException unused) {
            Logger.b("Could not map string to object for key: %s", bVar);
            return Optional.e();
        }
    }
}
