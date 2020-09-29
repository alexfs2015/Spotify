package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: hrz reason: default package */
public final class hrz implements vua<hry> {
    private final wlc<hpg> a;
    private final wlc<Context> b;
    private final wlc<RxResolver> c;
    private final wlc<hec> d;
    private final wlc<hvl> e;
    private final wlc<hed> f;
    private final wlc<wug> g;

    private hrz(wlc<hpg> wlc, wlc<Context> wlc2, wlc<RxResolver> wlc3, wlc<hec> wlc4, wlc<hvl> wlc5, wlc<hed> wlc6, wlc<wug> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static hrz a(wlc<hpg> wlc, wlc<Context> wlc2, wlc<RxResolver> wlc3, wlc<hec> wlc4, wlc<hvl> wlc5, wlc<hed> wlc6, wlc<wug> wlc7) {
        hrz hrz = new hrz(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return hrz;
    }

    public final /* synthetic */ Object get() {
        hry hry = new hry((hpg) this.a.get(), (Context) this.b.get(), (RxResolver) this.c.get(), (hec) this.d.get(), (hvl) this.e.get(), (hed) this.f.get(), (wug) this.g.get());
        return hry;
    }
}
