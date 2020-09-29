package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lfc reason: default package */
public final class lfc implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private lfc(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static lfc a(wlc<Flowable<fpt>> wlc) {
        return new lfc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
