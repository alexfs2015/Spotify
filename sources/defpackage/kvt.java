package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kvt reason: default package */
public final class kvt implements vua<kvs> {
    private final wlc<SpSharedPreferences<Object>> a;

    private kvt(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static kvt a(wlc<SpSharedPreferences<Object>> wlc) {
        return new kvt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kvs((SpSharedPreferences) this.a.get());
    }
}
