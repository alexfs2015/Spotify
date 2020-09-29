package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: owf reason: default package */
final class owf {
    static final b<Object, Boolean> a = b.b("playlist.education.shuffle.dismissed");
    final SpSharedPreferences<Object> b;

    public owf(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }
}
