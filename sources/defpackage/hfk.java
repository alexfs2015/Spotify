package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: hfk reason: default package */
public final class hfk implements wig<Boolean> {
    private final wzi<SpSharedPreferences<Object>> a;

    private hfk(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static hfk a(wzi<SpSharedPreferences<Object>> wzi) {
        return new hfk(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((SpSharedPreferences) this.a.get()).a(hff.a, false));
    }
}
