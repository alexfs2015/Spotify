package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: ssp reason: default package */
public final class ssp implements vua<Flowable<kxx>> {
    private final wlc<kxz> a;

    private ssp(wlc<kxz> wlc) {
        this.a = wlc;
    }

    public static ssp a(wlc<kxz> wlc) {
        return new ssp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((kxz) this.a.get()).a.a(BackpressureStrategy.LATEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}
