package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: sts reason: default package */
public final class sts implements wig<str> {
    private final wzi<SpSharedPreferences<Object>> a;

    private sts(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static sts a(wzi<SpSharedPreferences<Object>> wzi) {
        return new sts(wzi);
    }

    public final /* synthetic */ Object get() {
        return new str((SpSharedPreferences) this.a.get());
    }
}
