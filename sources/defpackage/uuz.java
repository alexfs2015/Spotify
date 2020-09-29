package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uuz reason: default package */
public final class uuz implements wig<uuy> {
    private final wzi<SpSharedPreferences<Object>> a;

    private uuz(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static uuz a(wzi<SpSharedPreferences<Object>> wzi) {
        return new uuz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uuy((SpSharedPreferences) this.a.get());
    }
}
