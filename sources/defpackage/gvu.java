package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: gvu reason: default package */
public final class gvu implements wig<gvt> {
    private final wzi<gwd> a;
    private final wzi<SpSharedPreferences<Object>> b;

    private gvu(wzi<gwd> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gvu a(wzi<gwd> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        return new gvu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gvt((gwd) this.a.get(), (SpSharedPreferences) this.b.get());
    }
}
