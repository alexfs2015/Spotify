package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: upo reason: default package */
public final class upo implements wig<upn> {
    private final wzi<SpSharedPreferences<Object>> a;

    private upo(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static upo a(wzi<SpSharedPreferences<Object>> wzi) {
        return new upo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new upn((SpSharedPreferences) this.a.get());
    }
}
