package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: smj reason: default package */
public final class smj implements ObservableTransformer<b, slz> {
    private final sin a;

    public smj(sin sin) {
        this.a = (sin) fbp.a(sin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ slz a(b bVar) {
        return new b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b b(b bVar) {
        this.a.b();
        return bVar;
    }

    public final ObservableSource<slz> apply(Observable<b> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$smj$hjcTbWOaiY3jvH22TmhVHucHCg<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$smj$fFY6y86NEVmkIEgkgf_6iXeupI.INSTANCE);
    }
}
