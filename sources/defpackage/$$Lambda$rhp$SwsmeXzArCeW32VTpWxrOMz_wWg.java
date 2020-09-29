package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rhp$SwsmeXzArCeW32VTpWxrOMz_wWg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$SwsmeXzArCeW32VTpWxrOMz_wWg implements ObservableTransformer {
    private final /* synthetic */ rhr f$0;

    public /* synthetic */ $$Lambda$rhp$SwsmeXzArCeW32VTpWxrOMz_wWg(rhr rhr) {
        this.f$0 = rhr;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rhp$IzuE1VBMmNn19ZLMHU2OOoOH5dg(this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$rhp$_klxpt563jyx_BCb5PapEoDU04A.INSTANCE);
    }
}
