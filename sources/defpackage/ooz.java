package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ooz reason: default package */
final class ooz {
    static final b<Object, Boolean> a = b.b("playlist.education.shuffle.dismissed");
    final SpSharedPreferences<Object> b;

    public ooz(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }
}
