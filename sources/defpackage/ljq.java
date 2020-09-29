package defpackage;

import io.reactivex.Observable;

/* renamed from: ljq reason: default package */
public final class ljq implements vua<Observable<kxx>> {
    private final wlc<kxz> a;

    private ljq(wlc<kxz> wlc) {
        this.a = wlc;
    }

    public static ljq a(wlc<kxz> wlc) {
        return new ljq(wlc);
    }

    public static Observable<kxx> a(kxz kxz) {
        return (Observable) vuf.a(kxz.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((kxz) this.a.get());
    }
}
