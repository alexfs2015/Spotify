package defpackage;

import io.reactivex.Flowable;

/* renamed from: iwg reason: default package */
public final class iwg implements vua<Flowable<Integer>> {
    private final wlc<sys> a;

    private iwg(wlc<sys> wlc) {
        this.a = wlc;
    }

    public static iwg a(wlc<sys> wlc) {
        return new iwg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((sys) this.a.get()).a().a(1).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
