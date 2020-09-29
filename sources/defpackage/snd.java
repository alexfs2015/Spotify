package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: snd reason: default package */
public final class snd implements ObservableTransformer<h, slk> {
    private final sli a;

    public snd(sli sli) {
        this.a = sli;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ slk a(h hVar) {
        smg smg = hVar.b;
        return new skz(hVar.a, this.a.a(smg.a(), smg.c(), smg.b(), 4).a());
    }

    public final ObservableSource<slk> apply(Observable<h> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$snd$m3ZeGedmV4KYpA7mNpSDAkQnRI<Object,Object>(this));
    }
}
