package defpackage;

import io.reactivex.Flowable;

/* renamed from: ssb reason: default package */
public final class ssb implements vua<ssa> {
    private final wlc<Flowable<Integer>> a;
    private final wlc<jws> b;

    private ssb(wlc<Flowable<Integer>> wlc, wlc<jws> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ssb a(wlc<Flowable<Integer>> wlc, wlc<jws> wlc2) {
        return new ssb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ssa((Flowable) this.a.get(), (jws) this.b.get());
    }
}
