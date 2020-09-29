package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pyq reason: default package */
public final class pyq implements wig<pyp> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<pyr> b;

    private pyq(wzi<SpSharedPreferences<Object>> wzi, wzi<pyr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pyq a(wzi<SpSharedPreferences<Object>> wzi, wzi<pyr> wzi2) {
        return new pyq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pyp((SpSharedPreferences) this.a.get(), (pyr) this.b.get());
    }
}
