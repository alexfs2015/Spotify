package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: rqd reason: default package */
public final class rqd {
    public static final b<Object, Boolean> a = b.b("data_saver_mode_user_enabled");
    public static final b<Object, Integer> b = b.b("data_saver_mode:streaming_quality_user_value");
    public static final ImmutableMap<String, b<Object, Integer>> c = ImmutableMap.b("stream_quality", b);
    public final SpSharedPreferences<Object> d;
    public final fnz<Boolean> e = fnz.a();

    rqd(SpSharedPreferences<Object> spSharedPreferences) {
        this.d = (SpSharedPreferences) fay.a(spSharedPreferences);
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
