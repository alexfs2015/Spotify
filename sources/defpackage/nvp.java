package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nvp reason: default package */
public final class nvp implements vua<nvo> {
    private final wlc<nvy> a;
    private final wlc<nvg> b;
    private final wlc<kda> c;
    private final wlc<nvw> d;
    private final wlc<Scheduler> e;

    private nvp(wlc<nvy> wlc, wlc<nvg> wlc2, wlc<kda> wlc3, wlc<nvw> wlc4, wlc<Scheduler> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static nvp a(wlc<nvy> wlc, wlc<nvg> wlc2, wlc<kda> wlc3, wlc<nvw> wlc4, wlc<Scheduler> wlc5) {
        nvp nvp = new nvp(wlc, wlc2, wlc3, wlc4, wlc5);
        return nvp;
    }

    public final /* synthetic */ Object get() {
        nvo nvo = new nvo((nvy) this.a.get(), (nvg) this.b.get(), (kda) this.c.get(), (nvw) this.d.get(), (Scheduler) this.e.get());
        return nvo;
    }
}
