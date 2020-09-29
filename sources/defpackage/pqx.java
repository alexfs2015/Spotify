package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pqx reason: default package */
public final class pqx implements vua<pox> {
    private final wlc<ppa> a;
    private final wlc<poy> b;
    private final wlc<psl> c;
    private final wlc<SpSharedPreferences<Object>> d;

    public static pox a(ppa ppa, poy poy, psl psl, SpSharedPreferences<Object> spSharedPreferences) {
        return (pox) vuf.a(CC.a(ppa, poy, psl, spSharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ppa) this.a.get(), (poy) this.b.get(), (psl) this.c.get(), (SpSharedPreferences) this.d.get());
    }
}
