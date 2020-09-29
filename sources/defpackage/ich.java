package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: ich reason: default package */
public final class ich implements vua<Single<sxh>> {
    private final wlc<Flowable<fpt>> a;

    private ich(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static ich a(wlc<Flowable<fpt>> wlc) {
        return new ich(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
