package defpackage;

import io.reactivex.Observable;

/* renamed from: pqw reason: default package */
public final class pqw implements vua<Observable<prf>> {
    private final wlc<hec> a;
    private final wlc<rka> b;

    public static Observable<prf> a(hec hec, rka rka) {
        return (Observable) vuf.a(CC.a(hec, rka), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hec) this.a.get(), (rka) this.b.get());
    }
}
