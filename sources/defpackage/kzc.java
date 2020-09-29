package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kzc reason: default package */
public final class kzc implements wig<kzb> {
    private final wzi<SpSharedPreferences<Object>> a;

    private kzc(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static kzc a(wzi<SpSharedPreferences<Object>> wzi) {
        return new kzc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kzb((SpSharedPreferences) this.a.get());
    }
}
