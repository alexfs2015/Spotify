package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: les reason: default package */
public final class les implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private les(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static les a(wlc<Flowable<fpt>> wlc) {
        return new les(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
