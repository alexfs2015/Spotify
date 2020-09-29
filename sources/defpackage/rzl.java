package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rzl reason: default package */
public final class rzl implements wig<rzk> {
    private final wzi<SpSharedPreferences<Object>> a;

    private rzl(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static rzl a(wzi<SpSharedPreferences<Object>> wzi) {
        return new rzl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rzk((SpSharedPreferences) this.a.get());
    }
}
