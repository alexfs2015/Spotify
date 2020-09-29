package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: sex reason: default package */
final class sex implements Function<sgd, Flowable<gzz>> {
    private final sev a;
    private final sez b;
    private final vit<gzz> c;
    private final Flowable<gzz> d;

    public final /* synthetic */ Object apply(Object obj) {
        sgd sgd = (sgd) obj;
        if (shf.a(fax.b(sgd.a.b())).isEmpty()) {
            return this.d;
        }
        return this.a.a(sgd).b().b((Function<? super T, ? extends wrf<? extends R>>) this.b).j().a((ObservableTransformer<? super T, ? extends R>) this.c).a(BackpressureStrategy.LATEST);
    }

    sex(sev sev, sez sez, vit<gzz> vit, Flowable<gzz> flowable) {
        this.a = (sev) fay.a(sev);
        this.b = (sez) fay.a(sez);
        this.c = (vit) fay.a(vit);
        this.d = (Flowable) fay.a(flowable);
    }
}
