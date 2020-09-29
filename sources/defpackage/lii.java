package defpackage;

import io.reactivex.Observable;

/* renamed from: lii reason: default package */
public final class lii implements vua<Observable<gbn>> {
    private final wlc<hed> a;

    private lii(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static lii a(wlc<hed> wlc) {
        return new lii(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((hed) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
