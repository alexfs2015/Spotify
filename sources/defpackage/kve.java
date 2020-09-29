package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kve reason: default package */
public final class kve implements wig<kvd> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<jtz> b;

    private kve(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kve a(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        return new kve(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kvd((SpSharedPreferences) this.a.get(), (jtz) this.b.get());
    }
}
