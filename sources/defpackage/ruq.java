package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ruq reason: default package */
public final class ruq implements wig<rup> {
    private final wzi<gnk> a;
    private final wzi<juc> b;
    private final wzi<jty> c;
    private final wzi<String> d;
    private final wzi<String> e;
    private final wzi<SpSharedPreferences<Object>> f;
    private final wzi<Context> g;

    private ruq(wzi<gnk> wzi, wzi<juc> wzi2, wzi<jty> wzi3, wzi<String> wzi4, wzi<String> wzi5, wzi<SpSharedPreferences<Object>> wzi6, wzi<Context> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static ruq a(wzi<gnk> wzi, wzi<juc> wzi2, wzi<jty> wzi3, wzi<String> wzi4, wzi<String> wzi5, wzi<SpSharedPreferences<Object>> wzi6, wzi<Context> wzi7) {
        ruq ruq = new ruq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return ruq;
    }

    public final /* synthetic */ Object get() {
        rup rup = new rup((gnk) this.a.get(), (juc) this.b.get(), (jty) this.c.get(), (String) this.d.get(), (String) this.e.get(), (SpSharedPreferences) this.f.get(), (Context) this.g.get());
        return rup;
    }
}
