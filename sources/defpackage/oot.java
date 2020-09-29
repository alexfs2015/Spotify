package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oot reason: default package */
public final class oot implements vua<oos> {
    private final wlc<Scheduler> a;
    private final wlc<a> b;
    private final wlc<a> c;
    private final wlc<ooz> d;
    private final wlc<onm> e;

    private oot(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<ooz> wlc4, wlc<onm> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static oot a(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<ooz> wlc4, wlc<onm> wlc5) {
        oot oot = new oot(wlc, wlc2, wlc3, wlc4, wlc5);
        return oot;
    }

    public final /* synthetic */ Object get() {
        oos oos = new oos(this.a, this.b, this.c, this.d, this.e);
        return oos;
    }
}
