package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: sna reason: default package */
public final class sna implements ObservableTransformer<j, slz> {
    private final sin a;

    public sna(sin sin) {
        this.a = (sin) fbp.a(sin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ slz a(j jVar) {
        return new b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ j b(j jVar) {
        this.a.a(jVar.a);
        return jVar;
    }

    public final ObservableSource<slz> apply(Observable<j> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$sna$zLReSr90VA1Jy7l9ptOQ4RNhCU<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$sna$6Zfl24u0vNBYNhDpPxOKuDQ9uQ.INSTANCE);
    }
}
