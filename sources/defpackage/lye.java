package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: lye reason: default package */
public final class lye {
    private final lyx a;
    private final lzd b;
    private final vit<gzz> c;

    lye(lzd lzd, vit<gzz> vit, lyr lyr, FlowableTransformer<wsj<wmg>, gzz> flowableTransformer, boolean z) {
        this(new lyx(lyr, flowableTransformer, z), lzd, vit);
    }

    private lye(lyx lyx, lzd lzd, vit<gzz> vit) {
        this.a = (lyx) fay.a(lyx);
        this.b = (lzd) fay.a(lzd);
        this.c = (vit) fay.a(vit);
    }

    public final Flowable<gzz> a(lyd lyd) {
        return this.a.a(lyd).d((Function<? super Throwable, ? extends T>) $$Lambda$lye$kWZHzkrC_yJVQumTWsKw74VURo8.INSTANCE).c((Function<? super T, ? extends R>) this.b).j().a((ObservableTransformer<? super T, ? extends R>) this.c).a(BackpressureStrategy.LATEST);
    }
}
