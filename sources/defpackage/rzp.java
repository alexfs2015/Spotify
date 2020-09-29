package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rzp reason: default package */
public final class rzp implements wig<rzo> {
    private final wzi<SpSharedPreferences<Object>> a;

    private rzp(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static rzp a(wzi<SpSharedPreferences<Object>> wzi) {
        return new rzp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rzo((SpSharedPreferences) this.a.get());
    }
}
