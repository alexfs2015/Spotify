package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Function;

/* renamed from: nnl reason: default package */
public final class nnl<T> implements SingleTransformer<T, nnk<T>> {
    private final kxz a;
    private final faz<T> b;

    public nnl(kxz kxz, faz<T> faz) {
        this.a = kxz;
        this.b = faz;
    }

    public final SingleSource<nnk<T>> a(Single<T> single) {
        return this.a.a.a(0).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nnl$ljchI1OLKY3x_tLQlbBjn5IBc<Object,Object>(this, single));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Single single, kxx kxx) {
        return (Single) kxx.a((gct<c, R_>) new $$Lambda$nnl$lj9s2AOnY9ERnnp3UMUqIOBr_lM<c,R_>(this, single), (gct<b, R_>) $$Lambda$nnl$6zdAnerUix8Mrw700_9OwcSiMiw.INSTANCE, (gct<a, R_>) $$Lambda$nnl$2X2n_aOeKRdHPQd7Mn6u362q80Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Single single, c cVar) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nnl$Mg6NFMyleiS3KIMY0ttp8mafuk<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Object obj) {
        if (this.b.apply(obj)) {
            return Single.b(nnk.a(obj));
        }
        return Single.b(nnk.a((Throwable) new RuntimeException("Server returned error")));
    }
}
