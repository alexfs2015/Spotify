package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;

/* renamed from: mrm reason: default package */
public final class mrm implements ObservableTransformer<a, mrh> {
    private final mrp a;
    private final mse b;

    public mrm(mrp mrp, mse mse) {
        this.a = mrp;
        this.b = mse;
    }

    public final ObservableSource<mrh> apply(Observable<a> observable) {
        return observable.h(new $$Lambda$mrm$GHN2NPsBqJVkO_NNGqG7bpkNw6s(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar) {
        return this.a.a().d().c((Function<? super T, ? extends R>) this.b).c((Function<? super T, ? extends R>) $$Lambda$mrm$831eUsUGxd_qAdvhV0m3OK9m4xE.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$mrm$4MIVavYe8nPH3gJjYPHHNkZcoqw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(List list) {
        return new h(ImmutableList.a((Collection<? extends E>) list));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(Throwable th) {
        return new g();
    }
}
