package defpackage;

import io.reactivex.Flowable;

/* renamed from: pxj reason: default package */
public final class pxj implements vua<Flowable<sgc>> {
    private final wlc<sds<sgc>> a;
    private final wlc<sfk> b;

    private pxj(wlc<sds<sgc>> wlc, wlc<sfk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pxj a(wlc<sds<sgc>> wlc, wlc<sfk> wlc2) {
        return new pxj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((sds) this.a.get()).a((sfk) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
