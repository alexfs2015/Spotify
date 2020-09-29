package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kub reason: default package */
public final class kub implements wig<Boolean> {
    private final wzi<SpSharedPreferences<Object>> a;

    private kub(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static kub a(wzi<SpSharedPreferences<Object>> wzi) {
        return new kub(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((SpSharedPreferences) this.a.get()).a(kty.a, true));
    }
}
