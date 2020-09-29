package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: rzo reason: default package */
public final class rzo {
    public static final b<Object, Boolean> a = b.b("data_saver_mode_user_enabled");
    public static final b<Object, Integer> b = b.b("data_saver_mode:streaming_quality_user_value");
    public static final ImmutableMap<String, b<Object, Integer>> c = ImmutableMap.b("stream_quality", b);
    public final SpSharedPreferences<Object> d;
    public final fot<Boolean> e = fot.a();

    rzo(SpSharedPreferences<Object> spSharedPreferences) {
        this.d = (SpSharedPreferences) fbp.a(spSharedPreferences);
    }

    public final boolean a(boolean z) {
        return this.d.a(a, false);
    }

    public final void b(boolean z) {
        this.d.a().a(a, z).b();
        this.e.accept(Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        b(z);
    }
}
