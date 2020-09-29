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

/* renamed from: vil reason: default package */
public final class vil implements CompletableTransformer {
    private final int a;
    private final vin b;

    public vil(int i, int i2, long j) {
        this.a = 30;
        this.b = new vin(i2, j);
    }

    public vil() {
        this(30, 5, 1000);
    }

    public final CompletableSource apply(Completable completable) {
        Flowable flowable;
        Completable c = completable.c((long) this.a, TimeUnit.SECONDS);
        vin vin = this.b;
        if (c instanceof FuseToFlowable) {
            flowable = ((FuseToFlowable) c).be_();
        } else {
            flowable = RxJavaPlugins.a((Flowable<T>) new CompletableToFlowable<T>(c));
        }
        ObjectHelper.a(vin, "handler is null");
        return Completable.a((wrf<T>) RxJavaPlugins.a((Flowable<T>) new FlowableRetryWhen<T>(flowable, vin)));
    }
}
