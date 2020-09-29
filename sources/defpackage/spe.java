package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: spe reason: default package */
final class spe implements Function<sqk, Flowable<hcs>> {
    private final spc a;
    private final spg b;
    private final vvy<hcs> c;
    private final Flowable<hcs> d;

    spe(spc spc, spg spg, vvy<hcs> vvy, Flowable<hcs> flowable) {
        this.a = (spc) fbp.a(spc);
        this.b = (spg) fbp.a(spg);
        this.c = (vvy) fbp.a(vvy);
        this.d = (Flowable) fbp.a(flowable);
    }

    public final /* synthetic */ Object apply(Object obj) {
        sqk sqk = (sqk) obj;
        return srm.a(fbo.b(sqk.a.b())).isEmpty() ? this.d : this.a.a(sqk).b().b((Function<? super T, ? extends xfk<? extends R>>) this.b).j().a((ObservableTransformer<? super T, ? extends R>) this.c).a(BackpressureStrategy.LATEST);
    }
}
