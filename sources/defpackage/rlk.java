package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rlk reason: default package */
public final class rlk implements vua<rlj> {
    private final wlc<glv> a;
    private final wlc<jrs> b;
    private final wlc<jro> c;
    private final wlc<String> d;
    private final wlc<String> e;
    private final wlc<SpSharedPreferences<Object>> f;
    private final wlc<Context> g;

    private rlk(wlc<glv> wlc, wlc<jrs> wlc2, wlc<jro> wlc3, wlc<String> wlc4, wlc<String> wlc5, wlc<SpSharedPreferences<Object>> wlc6, wlc<Context> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static rlk a(wlc<glv> wlc, wlc<jrs> wlc2, wlc<jro> wlc3, wlc<String> wlc4, wlc<String> wlc5, wlc<SpSharedPreferences<Object>> wlc6, wlc<Context> wlc7) {
        rlk rlk = new rlk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return rlk;
    }

    public final /* synthetic */ Object get() {
        rlj rlj = new rlj((glv) this.a.get(), (jrs) this.b.get(), (jro) this.c.get(), (String) this.d.get(), (String) this.e.get(), (SpSharedPreferences) this.f.get(), (Context) this.g.get());
        return rlj;
    }
}
