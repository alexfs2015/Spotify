package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: leo reason: default package */
public final class leo implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private leo(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static leo a(wlc<Flowable<fpt>> wlc) {
        return new leo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
