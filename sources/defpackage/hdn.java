package defpackage;

import io.reactivex.Observable;

/* renamed from: hdn reason: default package */
public final class hdn implements vua<hdm> {
    private final wlc<Observable<Boolean>> a;
    private final wlc<hdx> b;

    private hdn(wlc<Observable<Boolean>> wlc, wlc<hdx> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hdn a(wlc<Observable<Boolean>> wlc, wlc<hdx> wlc2) {
        return new hdn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hdm((Observable) this.a.get(), (hdx) this.b.get());
    }
}
