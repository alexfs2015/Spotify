package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Function;

/* renamed from: ntm reason: default package */
public final class ntm<T> implements SingleTransformer<T, ntl<T>> {
    private final lbi a;
    private final fbq<T> b;

    public ntm(lbi lbi, fbq<T> fbq) {
        this.a = lbi;
        this.b = fbq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Single single, c cVar) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ntm$MPrmxkFBFx20uoy3p0HUG5Bz_w<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Single single, lbg lbg) {
        return (Single) lbg.a((gee<c, R_>) new $$Lambda$ntm$0zuzYmenzFbtqAap2g0U7FTu0Vc<c,R_>(this, single), (gee<b, R_>) $$Lambda$ntm$usHUQsu3xg8prZrQRZka1mbjoVA.INSTANCE, (gee<a, R_>) $$Lambda$ntm$aP0U7pI4FtgI_U4EvIb7Buee6Gc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Object obj) {
        return this.b.apply(obj) ? Single.b(ntl.a(obj)) : Single.b(ntl.a((Throwable) new RuntimeException("Server returned error")));
    }

    public final SingleSource<ntl<T>> apply(Single<T> single) {
        return this.a.a.a(0).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ntm$9czFXplldk77kyCG6RszsTXfqfw<Object,Object>(this, single));
    }
}
