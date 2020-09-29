package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: nkl reason: default package */
public final class nkl implements wig<nki> {
    private final wzi<SpSharedPreferences<Object>> a;

    private nkl(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static nkl a(wzi<SpSharedPreferences<Object>> wzi) {
        return new nkl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nki((SpSharedPreferences) this.a.get());
    }
}
