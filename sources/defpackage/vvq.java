package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: vvq reason: default package */
public final class vvq implements CompletableTransformer {
    private final int a;
    private final vvs b;

    public vvq() {
        this(30, 5, 1000);
    }

    public vvq(int i, int i2, long j) {
        this.a = 30;
        this.b = new vvs(i2, j);
    }

    public final CompletableSource apply(Completable completable) {
        Completable c = completable.c((long) this.a, TimeUnit.SECONDS);
        vvs vvs = this.b;
        Flowable bc_ = c instanceof FuseToFlowable ? ((FuseToFlowable) c).bc_() : RxJavaPlugins.a((Flowable<T>) new CompletableToFlowable<T>(c));
        ObjectHelper.a(vvs, "handler is null");
        return Completable.a((xfk<T>) RxJavaPlugins.a((Flowable<T>) new FlowableRetryWhen<T>(bc_, vvs)));
    }
}
