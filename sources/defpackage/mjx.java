package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: mjx reason: default package */
public final class mjx implements wig<mjw> {
    private final wzi<SpSharedPreferences<Object>> a;

    private mjx(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static mjx a(wzi<SpSharedPreferences<Object>> wzi) {
        return new mjx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mjw((SpSharedPreferences) this.a.get());
    }
}
