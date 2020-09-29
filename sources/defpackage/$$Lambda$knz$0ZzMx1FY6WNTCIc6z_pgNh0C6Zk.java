package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$knz$0ZzMx1FY6WNTCIc6z_pgNh0C6Zk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$knz$0ZzMx1FY6WNTCIc6z_pgNh0C6Zk implements ObservableTransformer {
    private final /* synthetic */ Flowable f$0;
    private final /* synthetic */ jrp f$1;
    private final /* synthetic */ igj f$2;
    private final /* synthetic */ gdz f$3;

    public /* synthetic */ $$Lambda$knz$0ZzMx1FY6WNTCIc6z_pgNh0C6Zk(Flowable flowable, jrp jrp, igj igj, gdz gdz) {
        this.f$0 = flowable;
        this.f$1 = jrp;
        this.f$2 = igj;
        this.f$3 = gdz;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$knz$1lrJ_VUpy6Ekqcp3UYZYGVvU(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
