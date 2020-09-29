package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: syf reason: default package */
public final class syf implements wig<sye> {
    private final wzi<SpSharedPreferences<Object>> a;

    private syf(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static syf a(wzi<SpSharedPreferences<Object>> wzi) {
        return new syf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sye((SpSharedPreferences) this.a.get());
    }
}
