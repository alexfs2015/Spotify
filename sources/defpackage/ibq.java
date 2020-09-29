package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ibq reason: default package */
public final class ibq {
    public static final b<Object, Integer> a = b.b("VideoAdsPreferences.overlayAutoHideTimeout");
    public static final b<Object, Boolean> b = b.b("record_audio_permission_request_shown");
    public final SpSharedPreferences<Object> c;

    public ibq(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = (SpSharedPreferences) fbp.a(spSharedPreferences);
    }

    public final void a(boolean z) {
        this.c.a().a(b, false).a();
    }
}
