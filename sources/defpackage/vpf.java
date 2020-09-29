package defpackage;

import io.reactivex.Single;

/* renamed from: vpf reason: default package */
public final class vpf implements vua<Single<Boolean>> {
    private final wlc<hec> a;

    private vpf(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static vpf a(wlc<hec> wlc) {
        return new vpf(wlc);
    }

    public static Single<Boolean> a(hec hec) {
        return (Single) vuf.a(CC.a(hec), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hec) this.a.get());
    }
}
