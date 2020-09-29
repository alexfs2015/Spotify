package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lzz reason: default package */
public final class lzz implements vua<lzy> {
    private final wlc<hec> a;
    private final wlc<maa> b;
    private final wlc<kvd> c;
    private final wlc<kvk> d;
    private final wlc<kvb> e;
    private final wlc<Scheduler> f;

    private lzz(wlc<hec> wlc, wlc<maa> wlc2, wlc<kvd> wlc3, wlc<kvk> wlc4, wlc<kvb> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static lzz a(wlc<hec> wlc, wlc<maa> wlc2, wlc<kvd> wlc3, wlc<kvk> wlc4, wlc<kvb> wlc5, wlc<Scheduler> wlc6) {
        lzz lzz = new lzz(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return lzz;
    }

    public final /* synthetic */ Object get() {
        lzy lzy = new lzy((hec) this.a.get(), (maa) this.b.get(), (kvd) this.c.get(), (kvk) this.d.get(), (kvb) this.e.get(), (Scheduler) this.f.get());
        return lzy;
    }
}
