package defpackage;

import io.reactivex.Flowable;

/* renamed from: iwf reason: default package */
public final class iwf implements vua<Flowable<tcf>> {
    private final wlc<tby> a;

    private iwf(wlc<tby> wlc) {
        this.a = wlc;
    }

    public static iwf a(wlc<tby> wlc) {
        return new iwf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((tby) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
