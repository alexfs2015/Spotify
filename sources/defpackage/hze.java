package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: hze reason: default package */
public final class hze {
    public static final b<Object, Integer> a = b.b("VideoAdsPreferences.overlayAutoHideTimeout");
    public static final b<Object, Boolean> b = b.b("record_audio_permission_request_shown");
    public final SpSharedPreferences<Object> c;

    public hze(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = (SpSharedPreferences) fay.a(spSharedPreferences);
    }
}
