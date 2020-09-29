package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: sct reason: default package */
public final class sct implements ObservableTransformer<j, sbs> {
    private final ryz a;

    public sct(ryz ryz) {
        this.a = (ryz) fay.a(ryz);
    }

    public final ObservableSource<sbs> apply(Observable<j> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$sct$_BcxSUMHoCf0VeBzygiPPhpZrFA<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$sct$SnmsbnttKbpPf0ytKmeX1K7o9Bc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ j b(j jVar) {
        this.a.a(jVar.a);
        return jVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sbs a(j jVar) {
        return new b();
    }
}
