package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kzi reason: default package */
public final class kzi implements wig<kzh> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<jtz> b;

    private kzi(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kzi a(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        return new kzi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kzh((SpSharedPreferences) this.a.get(), (jtz) this.b.get());
    }
}
