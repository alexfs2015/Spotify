package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kyl reason: default package */
public final class kyl implements wig<kyk> {
    private final wzi<SpSharedPreferences<Object>> a;

    private kyl(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static kyl a(wzi<SpSharedPreferences<Object>> wzi) {
        return new kyl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kyk((SpSharedPreferences) this.a.get());
    }
}
