package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: paw reason: default package */
public final class paw implements wig<pav> {
    private final wzi<SpSharedPreferences<Object>> a;

    private paw(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static paw a(wzi<SpSharedPreferences<Object>> wzi) {
        return new paw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pav((SpSharedPreferences) this.a.get());
    }
}
