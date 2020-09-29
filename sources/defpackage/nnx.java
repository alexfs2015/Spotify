package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: nnx reason: default package */
public final class nnx {
    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(noh noh, nnv nnv, hcs hcs) {
        return (hcs) noh.apply(hcs, nnv.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(noc noc, noh noh, hhm hhm, nit nit, b bVar) {
        nnv nnv = bVar.a;
        Observable c = noc.a().f(new $$Lambda$nnx$bsFXyxj7Y8VkALQt3a5gG57rwxw(noh, nnv)).d().a(wit.a((c<T, R>) hhm, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nnx$gBzK0xnZ0SqBKM0bbGA21nZQ8c<Object,Object>(nnv));
        return !nnv.a().g() ? c.e(nnt.a(nnv.a().a(nit.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nnx$dEU_Zuk81ckXF9KxWF78bwp_og<Object,Object>(nnv, nit)) : c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(noe noe, noh noh, hhm hhm, nit nit, c cVar) {
        nnv nnv = cVar.a;
        Observable c = noe.a(((b) nnv.b()).a).f(new $$Lambda$nnx$qpZOGPZs8LSDuSibim1hxljFRXw(noh, nnv)).d().a(wit.a((c<T, R>) hhm, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nnx$pQHcayowEsaMfxVLMdGGvg3KfY<Object,Object>(nnv));
        return !nnv.a().g() ? c.e(nnt.a(nnv.a().a(nit.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nnx$PQu1EH6PNOhP7TjwGRsFc1zPII<Object,Object>(nnv, nit)) : c;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nof nof, noh noh, hhm hhm, nit nit, a aVar) {
        nnv nnv = aVar.a;
        Observable c = nof.a().f(new $$Lambda$nnx$zPDfoKU8o7g0ZRJ_yeRlmMjERk(noh, nnv)).d().a(wit.a((c<T, R>) hhm, BackpressureStrategy.LATEST)).c((Function<? super T, ? extends R>) new $$Lambda$nnx$ZhtvdePkE8_ygAUZDmdj6c5S09M<Object,Object>(nnv));
        return !nnv.a().g() ? c.e(nnt.a(nnv.a().a(nit.b()))).e((Function<? super Throwable, ? extends T>) new $$Lambda$nnx$vrGUb5mq8dGYbF3iZE2A7TmWqw<Object,Object>(nnv, nit)) : c;
    }

    public static ObservableTransformer<b, nnt> a(noc noc, noh noh, hhm<hcs> hhm, nit nit) {
        return new $$Lambda$nnx$8qwcik4N6ZBWfGkDysn9wMYXJc(noc, noh, hhm, nit);
    }

    public static ObservableTransformer<c, nnt> a(noe noe, noh noh, hhm<hcs> hhm, nit nit) {
        return new $$Lambda$nnx$oaKkrNgqwP8B5UKh_MQrYBQ8uK0(noe, noh, hhm, nit);
    }

    public static ObservableTransformer<a, nnt> a(nof nof, noh noh, hhm<hcs> hhm, nit nit) {
        return new $$Lambda$nnx$F9JhdA7XEhDwSqkwyHuSt8fSLTM(nof, noh, hhm, nit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nnt a(nnv nnv, hcs hcs) {
        return new d(nnv.a().f().a(hcs).a(false).b(false).c(true).d(false).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs b(noh noh, nnv nnv, hcs hcs) {
        return (hcs) noh.apply(hcs, nnv.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nnt b(nnv nnv, hcs hcs) {
        return new a(nnv.a().f().a(hcs).a(true).b(false).c(false).d(false).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs c(noh noh, nnv nnv, hcs hcs) {
        return (hcs) noh.apply(hcs, nnv.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nnt c(nnv nnv, hcs hcs) {
        return new b(nnv.a().f().a(hcs).a(false).b(true).c(false).d(false).a());
    }
}
