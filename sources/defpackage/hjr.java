package defpackage;

import io.reactivex.Flowable;

/* renamed from: hjr reason: default package */
public final class hjr implements vua<Flowable<fpt>> {
    private final wlc<hec> a;

    private hjr(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static hjr a(wlc<hec> wlc) {
        return new hjr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((hec) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
