package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lzg reason: default package */
public final class lzg implements vua<lzf> {
    private final wlc<Scheduler> a;
    private final wlc<rsv> b;
    private final wlc<lzk> c;

    private lzg(wlc<Scheduler> wlc, wlc<rsv> wlc2, wlc<lzk> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lzg a(wlc<Scheduler> wlc, wlc<rsv> wlc2, wlc<lzk> wlc3) {
        return new lzg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lzf((Scheduler) this.a.get(), (rsv) this.b.get(), (lzk) this.c.get());
    }
}
