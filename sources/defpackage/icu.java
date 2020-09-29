package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: icu reason: default package */
public final class icu implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private icu(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static icu a(wlc<Flowable<fpt>> wlc) {
        return new icu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
