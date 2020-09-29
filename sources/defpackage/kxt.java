package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kxt reason: default package */
public final class kxt implements wig<kxs> {
    private final wzi<SpSharedPreferences<Object>> a;

    private kxt(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static kxt a(wzi<SpSharedPreferences<Object>> wzi) {
        return new kxt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kxs((SpSharedPreferences) this.a.get());
    }
}
