package defpackage;

import io.reactivex.Scheduler;

/* renamed from: shz reason: default package */
public final class shz implements vua<shy> {
    private final wlc<Scheduler> a;
    private final wlc<sia> b;
    private final wlc<sic> c;
    private final wlc<hed> d;

    private shz(wlc<Scheduler> wlc, wlc<sia> wlc2, wlc<sic> wlc3, wlc<hed> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static shz a(wlc<Scheduler> wlc, wlc<sia> wlc2, wlc<sic> wlc3, wlc<hed> wlc4) {
        return new shz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new shy((Scheduler) this.a.get(), (sia) this.b.get(), (sic) this.c.get(), (hed) this.d.get());
    }
}
