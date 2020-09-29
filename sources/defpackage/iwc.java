package defpackage;

import io.reactivex.Flowable;

/* renamed from: iwc reason: default package */
public final class iwc implements vua<Flowable<Boolean>> {
    private final wlc<tbu> a;

    private iwc(wlc<tbu> wlc) {
        this.a = wlc;
    }

    public static iwc a(wlc<tbu> wlc) {
        return new iwc(wlc);
    }

    public static Flowable<Boolean> a(tbu tbu) {
        return (Flowable) vuf.a(tbu.k(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tbu) this.a.get());
    }
}
