package defpackage;

import android.content.ContentResolver;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jrt reason: default package */
public final class jrt implements vua<jrs> {
    private final wlc<ContentResolver> a;
    private final wlc<SpSharedPreferences<Object>> b;

    private jrt(wlc<ContentResolver> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jrt a(wlc<ContentResolver> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        return new jrt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jrs((ContentResolver) this.a.get(), (SpSharedPreferences) this.b.get());
    }
}
