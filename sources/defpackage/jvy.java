package defpackage;

import android.content.Context;
import com.google.common.hash.Hashing;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jvy reason: default package */
public class jvy {
    private final String a;
    private final Map<String, SpSharedPreferences<?>> b;

    public jvy() {
        this("spotify_preferences");
    }

    private jvy(String str) {
        this.b = new HashMap(4);
        this.a = str;
    }

    public final synchronized SpSharedPreferences<Object> a(Context context) {
        return b(context, this.a);
    }

    @Deprecated
    public final synchronized SpSharedPreferences<Object> b(Context context) {
        return b(context, this.a);
    }

    @Deprecated
    public final synchronized SpSharedPreferences<Object> c(Context context) {
        return b(context);
    }

    public final synchronized SpSharedPreferences<Object> a(Context context, String str) {
        if (!str.isEmpty()) {
        } else {
            throw new IllegalArgumentException();
        }
        return c(context, str);
    }

    private synchronized SpSharedPreferences<?> b(Context context, String str) {
        SpSharedPreferences<?> spSharedPreferences;
        spSharedPreferences = (SpSharedPreferences) this.b.get(str);
        if (spSharedPreferences == null) {
            spSharedPreferences = new SpSharedPreferences<>(context.getApplicationContext(), str);
            this.b.put(str, spSharedPreferences);
        }
        return spSharedPreferences;
    }

    private synchronized SpSharedPreferences<?> c(Context context, String str) {
        SpSharedPreferences<?> spSharedPreferences;
        spSharedPreferences = (SpSharedPreferences) this.b.get(str);
        if (spSharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            SpSharedPreferences a2 = a(context);
            StringBuilder sb = new StringBuilder("user-");
            sb.append(Hashing.d().a(str, Charset.defaultCharset()).toString());
            spSharedPreferences = new jwb<>(applicationContext, a2, sb.toString());
            this.b.put(str, spSharedPreferences);
        }
        return spSharedPreferences;
    }
}
