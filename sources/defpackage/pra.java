package defpackage;

import io.reactivex.Observable;

/* renamed from: pra reason: default package */
public final class pra implements vua<Observable<prf>> {
    private final wlc<hec> a;
    private final wlc<pni> b;

    public static Observable<prf> a(hec hec, pni pni) {
        return (Observable) vuf.a(CC.a(hec, pni), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hec) this.a.get(), (pni) this.b.get());
    }
}
