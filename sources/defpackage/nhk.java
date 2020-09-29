package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: nhk reason: default package */
public final class nhk implements wig<nhc> {
    private final wzi<gix> a;
    private final wzi<SpSharedPreferences<Object>> b;

    private nhk(wzi<gix> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nhk a(wzi<gix> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        return new nhk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        SpSharedPreferences spSharedPreferences = (SpSharedPreferences) this.b.get();
        return (nhc) wil.a(CC.a((gix) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
