package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oua reason: default package */
public final class oua implements vua<otz> {
    private final wlc<rsj> a;
    private final wlc<ois> b;
    private final wlc<ott> c;
    private final wlc<uxt> d;
    private final wlc<otw> e;
    private final wlc<ofh> f;
    private final wlc<String> g;
    private final wlc<Scheduler> h;
    private final wlc<ots> i;

    private oua(wlc<rsj> wlc, wlc<ois> wlc2, wlc<ott> wlc3, wlc<uxt> wlc4, wlc<otw> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8, wlc<ots> wlc9) {
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

    public static oua a(wlc<rsj> wlc, wlc<ois> wlc2, wlc<ott> wlc3, wlc<uxt> wlc4, wlc<otw> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8, wlc<ots> wlc9) {
        oua oua = new oua(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return oua;
    }

    public final /* synthetic */ Object get() {
        otz otz = new otz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        return otz;
    }
}
