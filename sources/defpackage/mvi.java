package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mvi reason: default package */
public final class mvi implements wig<mvh> {
    private final wzi<muf> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;
    private final wzi<mwc> d;
    private final wzi<mwg> e;
    private final wzi<mwe> f;

    private mvi(wzi<muf> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3, wzi<mwc> wzi4, wzi<mwg> wzi5, wzi<mwe> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static mvi a(wzi<muf> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3, wzi<mwc> wzi4, wzi<mwg> wzi5, wzi<mwe> wzi6) {
        mvi mvi = new mvi(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return mvi;
    }

    public final /* synthetic */ Object get() {
        mvh mvh = new mvh((muf) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get(), (mwc) this.d.get(), (mwg) this.e.get(), (mwe) this.f.get());
        return mvh;
    }
}
