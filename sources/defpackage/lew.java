package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lew reason: default package */
public final class lew implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private lew(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static lew a(wlc<Flowable<fpt>> wlc) {
        return new lew(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
