package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lfg reason: default package */
public final class lfg implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private lfg(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static lfg a(wlc<Flowable<fpt>> wlc) {
        return new lfg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
