package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qqg reason: default package */
public final class qqg implements wig<qqf> {
    private final wzi<SpSharedPreferences<Object>> a;

    private qqg(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static qqg a(wzi<SpSharedPreferences<Object>> wzi) {
        return new qqg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qqf((SpSharedPreferences) this.a.get());
    }
}
