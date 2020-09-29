package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: upm reason: default package */
public final class upm<T> {
    final upk a;
    final ObjectMapper b;
    private final Class<T> c;

    public upm(Class<T> cls, upk upk, ObjectMapper objectMapper) {
        this.c = cls;
        this.a = upk;
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
