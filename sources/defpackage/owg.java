package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: owg reason: default package */
public final class owg implements wig<owf> {
    private final wzi<SpSharedPreferences<Object>> a;

    private owg(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static owg a(wzi<SpSharedPreferences<Object>> wzi) {
        return new owg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new owf((SpSharedPreferences) this.a.get());
    }
}
