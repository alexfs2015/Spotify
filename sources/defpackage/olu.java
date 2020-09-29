package defpackage;

import io.reactivex.Scheduler;

/* renamed from: olu reason: default package */
public final class olu implements vua<olt> {
    private final wlc<ois> a;
    private final wlc<olo> b;
    private final wlc<spi> c;
    private final wlc<uxt> d;
    private final wlc<ofa> e;
    private final wlc<olv> f;
    private final wlc<ofh> g;
    private final wlc<String> h;
    private final wlc<Scheduler> i;

    private olu(wlc<ois> wlc, wlc<olo> wlc2, wlc<spi> wlc3, wlc<uxt> wlc4, wlc<ofa> wlc5, wlc<olv> wlc6, wlc<ofh> wlc7, wlc<String> wlc8, wlc<Scheduler> wlc9) {
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

    public static olu a(wlc<ois> wlc, wlc<olo> wlc2, wlc<spi> wlc3, wlc<uxt> wlc4, wlc<ofa> wlc5, wlc<olv> wlc6, wlc<ofh> wlc7, wlc<String> wlc8, wlc<Scheduler> wlc9) {
        olu olu = new olu(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return olu;
    }

    public final /* synthetic */ Object get() {
        olt olt = new olt(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        return olt;
    }
}
