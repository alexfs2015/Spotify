package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: gtu reason: default package */
public final class gtu implements wig<gtt> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<jwo> b;

    private gtu(wzi<SpSharedPreferences<Object>> wzi, wzi<jwo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gtu a(wzi<SpSharedPreferences<Object>> wzi, wzi<jwo> wzi2) {
        return new gtu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gtt((SpSharedPreferences) this.a.get(), (jwo) this.b.get());
    }
}
