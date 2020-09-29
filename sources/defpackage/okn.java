package defpackage;

import io.reactivex.Scheduler;

/* renamed from: okn reason: default package */
public final class okn implements vua<okm> {
    private final wlc<ois> a;
    private final wlc<okh> b;
    private final wlc<hbj> c;
    private final wlc<spi> d;
    private final wlc<String> e;
    private final wlc<Scheduler> f;

    private okn(wlc<ois> wlc, wlc<okh> wlc2, wlc<hbj> wlc3, wlc<spi> wlc4, wlc<String> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static okn a(wlc<ois> wlc, wlc<okh> wlc2, wlc<hbj> wlc3, wlc<spi> wlc4, wlc<String> wlc5, wlc<Scheduler> wlc6) {
        okn okn = new okn(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return okn;
    }

    public final /* synthetic */ Object get() {
        okm okm = new okm(this.a, this.b, this.c, this.d, this.e, this.f);
        return okm;
    }
}
