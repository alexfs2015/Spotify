package defpackage;

import io.reactivex.Scheduler;

/* renamed from: onc reason: default package */
public final class onc implements vua<onb> {
    private final wlc<ois> a;
    private final wlc<omy> b;
    private final wlc<omt> c;
    private final wlc<uxt> d;
    private final wlc<tcn> e;
    private final wlc<ofh> f;
    private final wlc<String> g;
    private final wlc<Scheduler> h;

    private onc(wlc<ois> wlc, wlc<omy> wlc2, wlc<omt> wlc3, wlc<uxt> wlc4, wlc<tcn> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static onc a(wlc<ois> wlc, wlc<omy> wlc2, wlc<omt> wlc3, wlc<uxt> wlc4, wlc<tcn> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8) {
        onc onc = new onc(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return onc;
    }

    public final /* synthetic */ Object get() {
        onb onb = new onb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return onb;
    }
}
