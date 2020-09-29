package defpackage;

import io.reactivex.Flowable;

/* renamed from: pxc reason: default package */
public final class pxc implements vua<Flowable<sgc>> {
    private final wlc<String> a;
    private final wlc<String> b;

    private pxc(wlc<String> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pxc a(wlc<String> wlc, wlc<String> wlc2) {
        return new pxc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(Flowable.b(sgc.a((String) this.a.get(), (String) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
