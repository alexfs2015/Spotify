package defpackage;

import io.reactivex.Completable;

/* renamed from: nkp reason: default package */
public final class nkp implements vua<Completable> {
    private final wlc<nkb> a;

    private nkp(wlc<nkb> wlc) {
        this.a = wlc;
    }

    public static nkp a(wlc<nkb> wlc) {
        return new nkp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Completable) vuf.a(((nkb) this.a.get()).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
