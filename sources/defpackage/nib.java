package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: nib reason: default package */
public final class nib {
    public static ObservableTransformer<b, nhx> a(nig nig, nil nil, heq<gzz> heq, nde nde) {
        return new $$Lambda$nib$Sn2wFxVfR4MGmpD8q_IN2CCFTps(nig, nil, heq, nde);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz c(nil nil, nhz nhz, gzz gzz) {
        return (gzz) nil.apply(gzz, nhz.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nhx c(nhz nhz, gzz gzz) {
        return new b(nhz.a().f().a(gzz).a(false).b(true).c(false).d(false).a());
    }

    public static ObservableTransformer<a, nhx> a(nij nij, nil nil, heq<gzz> heq, nde nde) {
        return new $$Lambda$nib$gOdqcpqmx77nEQ9qY8ljaRWggck(nij, nil, heq, nde);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz b(nil nil, nhz nhz, gzz gzz) {
        return (gzz) nil.apply(gzz, nhz.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nhx b(nhz nhz, gzz gzz) {
        return new a(nhz.a().f().a(gzz).a(true).b(false).c(false).d(false).a());
    }

    public static ObservableTransformer<c, nhx> a(nii nii, nil nil, heq<gzz> heq, nde nde) {
        return new $$Lambda$nib$OBoRGqavaN9_hOBsF9MNQK8JrQc(nii, nil, heq, nde);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(nil nil, nhz nhz, gzz gzz) {
        return (gzz) nil.apply(gzz, nhz.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nhx a(nhz nhz, gzz gzz) {
        return new d(nhz.a().f().a(gzz).a(false).b(false).c(true).d(false).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nii nii, nil nil, heq heq, nde nde, c cVar) {
        nhz nhz = cVar.a;
        Observable c = nii.a(((b) nhz.b()).a).f(new $$Lambda$nib$PghdqQlDtcnZMlsSSq9kWdhNuWw(nil, nhz)).d().a(vun.a((c<T, R>) heq, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nib$Nrt6dEhQFwjD4hRWcNiEFtuOZN8<Object,Object>(nhz));
        return !nhz.a().g() ? c.e(nhx.a(nhz.a().a(nde.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nib$_S77ZM5xdao4ypWNudyw4nkW_Y4<Object,Object>(nhz, nde)) : c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nij nij, nil nil, heq heq, nde nde, a aVar) {
        nhz nhz = aVar.a;
        Observable c = nij.a().f(new $$Lambda$nib$YByUMYyiUQyKwwBos7Ci_0S2IZ0(nil, nhz)).d().a(vun.a((c<T, R>) heq, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nib$y1Dyi7DQsGCojbOaXa0mC7dTcQ<Object,Object>(nhz));
        return !nhz.a().g() ? c.e(nhx.a(nhz.a().a(nde.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nib$wswCmET_w4TEhXSEbnSi6MybAIQ<Object,Object>(nhz, nde)) : c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nig nig, nil nil, heq heq, nde nde, b bVar) {
        nhz nhz = bVar.a;
        Observable c = nig.a().f(new $$Lambda$nib$kVEHYyB6wXdi9K2YKSiFDShcprw(nil, nhz)).d().a(vun.a((c<T, R>) heq, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nib$E4ci3USFzkAglYKbEkMDUJSE7YI<Object,Object>(nhz));
        return !nhz.a().g() ? c.e(nhx.a(nhz.a().a(nde.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nib$czTPwZ5QnpL4OKvqGOlbYjpjAas<Object,Object>(nhz, nde)) : c;
    }
}
