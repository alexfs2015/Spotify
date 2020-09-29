package defpackage;

import io.reactivex.Scheduler;

/* renamed from: kvv reason: default package */
public final class kvv implements vua<kvu> {
    private final wlc<kvs> a;
    private final wlc<kwg> b;
    private final wlc<ueb> c;
    private final wlc<Scheduler> d;

    private kvv(wlc<kvs> wlc, wlc<kwg> wlc2, wlc<ueb> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static kvv a(wlc<kvs> wlc, wlc<kwg> wlc2, wlc<ueb> wlc3, wlc<Scheduler> wlc4) {
        return new kvv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new kvu((kvs) this.a.get(), (kwg) this.b.get(), (ueb) this.c.get(), (Scheduler) this.d.get());
    }
}
