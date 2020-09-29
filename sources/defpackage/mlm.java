package defpackage;

import io.reactivex.Observable;

/* renamed from: mlm reason: default package */
public final class mlm implements vua<mll> {
    private final wlc<rqd> a;
    private final wlc<Observable<mlh>> b;

    public static mll a(rqd rqd, Observable<mlh> observable) {
        return new mll(rqd, observable);
    }

    public final /* synthetic */ Object get() {
        return new mll((rqd) this.a.get(), (Observable) this.b.get());
    }
}
