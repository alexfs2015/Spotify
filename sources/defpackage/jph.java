package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: jph reason: default package */
public final class jph {
    public static final b<Object, Integer> a = b.b("playback_error_code");
    public static final b<Object, String> b = b.b("playback_error_uri");
    public final SpSharedPreferences<Object> c;

    public jph(Context context, jvy jvy) {
        this.c = jvy.b(context);
    }
}
