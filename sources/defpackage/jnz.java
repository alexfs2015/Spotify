package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.lang.ref.WeakReference;

/* renamed from: jnz reason: default package */
public final class jnz implements jny {
    private static b<Object, String> c = b.b("CURRENT_OFFER");
    private static b<Object, Long> d = b.b("CURRENT_OFFER_TTL");
    private long a = -1;
    private final WeakReference<Context> b;
    private final ObjectMapper e;
    private final SpSharedPreferences<Object> f;

    public jnz(Context context, rwl rwl, jyg jyg) {
        this.b = new WeakReference<>(context);
        this.e = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(Include.NON_NULL).a();
        this.f = jyg.b(context);
    }

    public final void a() {
        if (((Context) this.b.get()) != null) {
            this.f.a().a(c).a(d).a();
        }
    }
}
