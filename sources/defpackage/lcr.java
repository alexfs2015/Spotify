package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lcr reason: default package */
public final class lcr implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private lcr(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static lcr a(wlc<Flowable<fpt>> wlc) {
        return new lcr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
