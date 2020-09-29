package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oqk reason: default package */
public final class oqk implements vua<oqj> {
    private final wlc<tcn> a;
    private final wlc<ois> b;
    private final wlc<oqe> c;
    private final wlc<String> d;
    private final wlc<hbj> e;
    private final wlc<Scheduler> f;

    private oqk(wlc<tcn> wlc, wlc<ois> wlc2, wlc<oqe> wlc3, wlc<String> wlc4, wlc<hbj> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static oqk a(wlc<tcn> wlc, wlc<ois> wlc2, wlc<oqe> wlc3, wlc<String> wlc4, wlc<hbj> wlc5, wlc<Scheduler> wlc6) {
        oqk oqk = new oqk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return oqk;
    }

    public final /* synthetic */ Object get() {
        oqj oqj = new oqj(this.a, this.b, this.c, this.d, this.e, this.f);
        return oqj;
    }
}
