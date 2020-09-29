package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ixw reason: default package */
public final class ixw implements vua<ixv> {
    private final wlc<ixx> a;
    private final wlc<izb> b;
    private final wlc<izd> c;
    private final wlc<iyx> d;
    private final wlc<iya> e;
    private final wlc<Scheduler> f;

    private ixw(wlc<ixx> wlc, wlc<izb> wlc2, wlc<izd> wlc3, wlc<iyx> wlc4, wlc<iya> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ixw a(wlc<ixx> wlc, wlc<izb> wlc2, wlc<izd> wlc3, wlc<iyx> wlc4, wlc<iya> wlc5, wlc<Scheduler> wlc6) {
        ixw ixw = new ixw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ixw;
    }

    public final /* synthetic */ Object get() {
        ixv ixv = new ixv((ixx) this.a.get(), (izb) this.b.get(), (izd) this.c.get(), (iyx) this.d.get(), (iya) this.e.get(), (Scheduler) this.f.get());
        return ixv;
    }
}
