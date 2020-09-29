package defpackage;

import android.content.Context;

/* renamed from: twb reason: default package */
public final class twb implements vua<twa> {
    private final wlc<Context> a;
    private final wlc<tuc> b;
    private final wlc<Boolean> c;
    private final wlc<tvx> d;
    private final wlc<twc> e;
    private final wlc<tuf> f;
    private final wlc<twi> g;
    private final wlc<ttd> h;
    private final wlc<tsu> i;

    private twb(wlc<Context> wlc, wlc<tuc> wlc2, wlc<Boolean> wlc3, wlc<tvx> wlc4, wlc<twc> wlc5, wlc<tuf> wlc6, wlc<twi> wlc7, wlc<ttd> wlc8, wlc<tsu> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static twb a(wlc<Context> wlc, wlc<tuc> wlc2, wlc<Boolean> wlc3, wlc<tvx> wlc4, wlc<twc> wlc5, wlc<tuf> wlc6, wlc<twi> wlc7, wlc<ttd> wlc8, wlc<tsu> wlc9) {
        twb twb = new twb(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return twb;
    }

    public final /* synthetic */ Object get() {
        twa twa = new twa((Context) this.a.get(), vtz.b(this.b), ((Boolean) this.c.get()).booleanValue(), (tvx) this.d.get(), (twc) this.e.get(), (tuf) this.f.get(), (twi) this.g.get(), (ttd) this.h.get(), (tsu) this.i.get());
        return twa;
    }
}
