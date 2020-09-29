package defpackage;

import io.reactivex.Observable;

/* renamed from: mad reason: default package */
public final class mad implements vua<Observable<Boolean>> {
    private final wlc<hec> a;
    private final wlc<hed> b;
    private final wlc<sia> c;
    private final wlc<kvb> d;

    public static Observable<Boolean> a(hec hec, hed hed, sia sia, kvb kvb) {
        return (Observable) vuf.a(CC.a(hec, hed, sia, kvb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hec) this.a.get(), (hed) this.b.get(), (sia) this.c.get(), (kvb) this.d.get());
    }
}
