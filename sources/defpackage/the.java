package defpackage;

import io.reactivex.Flowable;

/* renamed from: the reason: default package */
public final class the implements vua<Flowable<Boolean>> {
    private final wlc<thn> a;

    private the(wlc<thn> wlc) {
        this.a = wlc;
    }

    public static the a(wlc<thn> wlc) {
        return new the(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((thn) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
