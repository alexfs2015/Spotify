package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$knz$1lrJ_VUp-y6E-kqcp3UY-ZYGVvU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$knz$1lrJ_VUpy6Ekqcp3UYZYGVvU implements Function {
    private final /* synthetic */ Flowable f$0;
    private final /* synthetic */ jrp f$1;
    private final /* synthetic */ igj f$2;
    private final /* synthetic */ gdz f$3;

    public /* synthetic */ $$Lambda$knz$1lrJ_VUpy6Ekqcp3UYZYGVvU(Flowable flowable, jrp jrp, igj igj, gdz gdz) {
        this.f$0 = flowable;
        this.f$1 = jrp;
        this.f$2 = igj;
        this.f$3 = gdz;
    }

    public final Object apply(Object obj) {
        return this.f$0.j().c(1).b((Consumer<? super T>) new $$Lambda$knz$wY35BZ296ICsUhWHdroDHXOvu50<Object>((f) obj, this.f$1, this.f$2, this.f$3)).g().a((ObservableSource<T>) Observable.c());
    }
}
