package defpackage;

import android.content.Context;

/* renamed from: kpa reason: default package */
public final class kpa implements vua<koz> {
    private final wlc<Context> a;
    private final wlc<tui> b;
    private final wlc<kos> c;
    private final wlc<kop> d;

    private kpa(wlc<Context> wlc, wlc<tui> wlc2, wlc<kos> wlc3, wlc<kop> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static kpa a(wlc<Context> wlc, wlc<tui> wlc2, wlc<kos> wlc3, wlc<kop> wlc4) {
        return new kpa(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new koz((Context) this.a.get(), (tui) this.b.get(), (kos) this.c.get(), (kop) this.d.get());
    }
}
